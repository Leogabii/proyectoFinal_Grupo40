
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
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
        String sql = "select id_pedido, id_mesa, id_mesero, fecha_hora, importe, cobrada from pedido where id_mesero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setIdMesa(rs.getInt("id_mesa"));
                pedido.setIdMesero(rs.getInt("id_mesero"));
                pedido.setFecha_hora(rs.getDate("fecha_hora").toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
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
    
    public List<Double> listarIngresosPorFecha(LocalDate fecha) {
        ArrayList<Double> ingresos = new ArrayList<>();
        String sql = "select importe from Pedido where fecha_hora = ?%";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                double ingreso;
                ingreso = rs.getDouble("ingreso");
                ingresos.add(ingreso);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se han encontrado pedidos en la fecha indicada.");
        }
        return ingresos;
    }
    
    public List<Double> listarIngresosDelDiaCobrados() {
        ArrayList<Double> ingresos = new ArrayList<>();
        String sql = "select importe from Pedido where fecha_hora between ? and ? and cobrada = 1";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            DateFormat dateFormat1 = new SimpleDateFormat("yyyy MMM d");
            String date1 = dateFormat1.format(Calendar.getInstance().getTime());
            ps.setString(1, date1+" 10:00:00");
            DateFormat dateFormat2 = new SimpleDateFormat("yyyy MMM d HH:mm:ss");
            String date2 = dateFormat2.format(Calendar.getInstance().getTime());
            ps.setString(2, date2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                double ingreso;
                ingreso = rs.getDouble("ingreso");
                ingresos.add(ingreso);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se han encontrado pedidos en la fecha indicada.");
        }
        return ingresos;
    }
    
    public List<Double> listarIngresosDelDiaPendientes() {
        ArrayList<Double> ingresos = new ArrayList<>();
        String sql = "select importe from Pedido where fecha_hora between ? and ? and cobrada = 0";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            DateFormat dateFormat1 = new SimpleDateFormat("yyyy MMM d");
            String date1 = dateFormat1.format(Calendar.getInstance().getTime());
            ps.setString(1, date1+" 10:00:00");
            DateFormat dateFormat2 = new SimpleDateFormat("yyyy MMM d HH:mm:ss");
            String date2 = dateFormat2.format(Calendar.getInstance().getTime());
            ps.setString(2, date2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                double ingreso;
                ingreso = rs.getDouble("ingreso");
                ingresos.add(ingreso);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se han encontrado pedidos en la fecha indicada.");
        }
        return ingresos;
    } 
    
    public List<Pedido> listarPedidosDeMeseroPorFecha(int idMesero, LocalDate fecha) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "select id_pedido, id_mesa, id_mesero, fecha_hora, importe, cobrada from pedido where id_mesero = ? and fecha_hora between ? and ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            ps.setDate(2, Date.valueOf(fecha+" 10:00:00"));
            ps.setDate(3, Date.valueOf(fecha.plusDays(1)+" 01:00:00"));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setIdMesa(rs.getInt("id_mesa"));
                pedido.setIdMesero(rs.getInt("id_mesero"));
                pedido.setFecha_hora(rs.getDate("fecha_hora").toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
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
    
    public List<Pedido> listarPedidosDeMesaPorFecha(int idMesa, LocalDate fecha, int hora1, int hora2) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "select * from pedido where id_mesa = ? and fecha_hora between ? and ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);
            ps.setDate(2, Date.valueOf(fecha+" "+hora1+":00:00"));
            ps.setDate(2, Date.valueOf(fecha+" "+hora2+":00:00"));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdMesa(idMesa);
                pedido.setIdMesero(rs.getInt("id_mesero"));
                pedido.setFecha_hora(rs.getDate("fecha_hora").toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrada"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La mesa que busca no fue encontrada.");
        }
        return pedidos;
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
