
package proyFinalAtencionResto.AccesoADatos;

import java.sql.Connection;
import proyFinalAtencionResto.Entidades.Pedido;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyFinalAtencionResto.Entidades.Mesa;
import sun.security.rsa.RSACore;


/**
 *
 * @author grupo40
 */
public class PedidoData {
    
    private Connection con = null;
    
    public PedidoData() {
        con = (Connection) Coneccion.getConexion();
    }
    
    private void guardarPedido(Pedido pedido) {
//        int idMesa = pedido.getMesa().getIdMesa();
        String sql = "insert into pedido (id_mesa, id_mesero, fecha_hora) "
                + "values (?, ?, ?))";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,pedido.getIdMesa());
            ps.setInt(2,pedido.getIdMesero());
            ps.setDate(3, Date.valueOf(pedido.getFechaHora()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pedido creado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El pedido NO ha sido creado." +ex);
        }
        
    }
    
    public List<Pedido> listarPedidosPorIdMesero(int idMesero) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "select * from pedido where id_mesero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdMesa(rs.getInt("id_mesa"));
                pedido.setIdMesero(rs.getInt("id_mesero"));      
                pedido.setFechaHora(rs.getDate("fecha_hora").toString());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El/la mesero/a no fue encontrado/a.");
        }
        return pedidos;
    }
    
    public List<Pedido> listarPedidosPorIdMeseroIdMesa(int idMesero, int idMesa) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "select * from pedido where id_mesero = ? and id_mesa = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            ps.setInt(2, idMesa);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdMesa(rs.getInt("id_mesa"));
                pedido.setIdMesero(rs.getInt("id_mesero"));
                pedido.setFechaHora(rs.getDate("fecha_hora").toString());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se han encontrado pedidos asociados al mesero y la mesa indicados.");
        }
        return pedidos;
    }
    
    public List<Pedido> listarIngresosPorFecha(String fecha1, String fecha2) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "select * from Pedido where fecha_hora between ? and ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, fecha1+" 00:00:00");
            ps.setString(2, fecha2+" 23:59:59");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdMesa(rs.getInt("id_mesa"));
                pedido.setIdMesero(rs.getInt("id_mesero"));
                pedido.setFechaHora(rs.getDate("fecha_hora").toString());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se han encontrado pedidos en la fecha indicada.");
        }
        return pedidos;
    }
    
    public List<Pedido> listarIngresosDelDiaCobrados() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "select * from Pedido where fecha_hora between ? and ? and cobrada = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            LocalDateTime fechaActual = LocalDateTime.now();
            String fecha = fechaActual.getYear()+""+"-"+fechaActual.getMonthValue()+""+"-"+fechaActual.getDayOfMonth()+"";
            ps.setString(1, fecha+" 00:00:00");
            ps.setString(2, fecha+" 23:59:59");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdMesa(rs.getInt("id_mesa"));
                pedido.setIdMesero(rs.getInt("id_mesero"));
                pedido.setFechaHora(rs.getDate("fecha_hora").toString());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se han encontrado pedidos en la fecha indicada.");
        }
        return pedidos;
    }
    
    public List<Pedido> listarIngresosDelDiaPendientes() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "select * from Pedido where fecha_hora between ? and ? and cobrada = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            LocalDateTime fechaActual = LocalDateTime.now();
            String fecha = fechaActual.getYear()+""+"-"+fechaActual.getMonthValue()+""+"-"+fechaActual.getDayOfMonth()+"";
            ps.setString(1, fecha+" 00:00:00");
            ps.setString(2, fecha+" 23:59:59");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdMesa(rs.getInt("id_mesa"));
                pedido.setIdMesero(rs.getInt("id_mesero"));
                pedido.setFechaHora(rs.getDate("fecha_hora").toString());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se han encontrado pedidos en la fecha indicada.");
        }
        return pedidos;
    }
    
    public List<Pedido> listarPedidosDeMeseroPorFecha(int idMesero, String fecha1, String fecha2) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "select * from pedido where id_mesero = ? and fecha_hora between ? and ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            ps.setString(2, fecha1+" 00:00:00");
            ps.setString(3, fecha2+" 23:59:59");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdMesa(rs.getInt("id_mesa"));
                pedido.setIdMesero(rs.getInt("id_mesero"));
                pedido.setFechaHora(rs.getDate("fecha_hora").toString());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El/la mesero/a que busca no fue encontrado/a.");
        }
        return pedidos;
    }
    
    public List<Pedido> listarPedidosDeMesaPorFecha(int idMesa, String fecha1, String fecha2) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "select * from pedido where id_mesa = ? and fecha_hora between ? and ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);
            ps.setString(2, fecha1+" 00:00:00");
            ps.setString(3, fecha2+" 23:59:59");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdMesa(idMesa);
                pedido.setIdMesero(rs.getInt("id_mesero"));
                pedido.setFechaHora(rs.getDate("fecha_hora").toString());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La mesa que busca no fue encontrada.");
        }
        return pedidos;
    }
    
        public List<Mesa> listarMesasPorIdMesero(int idMesero) {
        ArrayList<Mesa> mesas = new ArrayList<>();
        String sql = "select id_mesa from pedido where id_mesero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            ResultSet rs = ps.executeQuery();
            ArrayList<Integer> agregadas = new ArrayList<>();
            while (rs.next()) {
                Mesa mesa = new Mesa();
                if (agregadas.contains(rs.getInt("id_mesa"))) {
                } else {
                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesas.add(mesa);
                agregadas.add(rs.getInt("id_mesa"));
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El/la mesero/a no fue encontrado/a.");
        }
        return mesas;
    }
    
    
    
        public int proximoNroPedido() throws SQLException{
       int actual=0;
        try{
        
        String sql = "select id_pedido from pedido order by id_pedido desc";
        PreparedStatement sentencia = con.prepareStatement(sql);
        ResultSet resultado =  sentencia.executeQuery();
        if(resultado.next()){
            actual=resultado.getInt("id_pedido");
        }
        }catch(SQLException sqle){
                    JOptionPane.showMessageDialog(null, sqle);
        }
         return actual+1;
    }
    
    
}
