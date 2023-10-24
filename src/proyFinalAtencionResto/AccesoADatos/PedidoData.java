
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
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
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
    
        
        
        
        //***************+ aca va para registrar producto **************************
        //**********+ inserto el pedido **************
        //INSERT INTO `pedido`(`id_pedido`, `id_mesa`, `id_mesero`, `fecha_hora`, `importe`, `cobrada`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]')
        //*********** inserto productos pedidos a la tabla pedidoproducto
        //INSERT INTO `pedidoproducto`(`id_pedido_producto`, `id_pedido`, `id_producto`, `cantidad`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]')
        
        
//       public void registrarPedido(int pedido,int mesa, int mesero, LocalDateTime fecha, double monto, boolean cobrada) throws SQLException {
        public void registrarPedido(Pedido pedido) throws SQLException {
           
//                       pedido.setIdPedido(proximoNrodePedido());
//            pedido.setIdMesa(nroMesa);
//            pedido.setIdMesero(nroMozo);
//            pedido.setFecha_hora(locaDate);
//            pedido.setImporte(total);
//            pedido.setCobrado(false);
           
           
           
           
           int numeroPedidoGenerado=0;
            try {
            String sql1="INSERT INTO pedido (id_mesa, id_mesero, fecha_hora, importe, cobrada) VALUES (?,?,?,?,?)";
            PreparedStatement sentencia = con.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
            
            sentencia.setInt(1, pedido.getIdMesa());
            sentencia.setInt(2, pedido.getIdMesero());
            
            String formatoBD = pedido.getFecha_hora().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            sentencia.setString(3,formatoBD);
            sentencia.setDouble(4, pedido.getImporte());
            sentencia.setBoolean(5, pedido.isCobrado());
            int fila = sentencia.executeUpdate();
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "no se ha generado ningun Pedido registrado");
                return;
            }
            ResultSet rs = sentencia.getGeneratedKeys();
            if (rs.next()) {
               numeroPedidoGenerado=(rs.getInt(1));
                           if (pedido.getIdPedido()==numeroPedidoGenerado){
                JOptionPane.showMessageDialog(null, "Su pedido a sigo generado bajo el numero: " +  numeroPedidoGenerado);
            }else{
                               JOptionPane.showMessageDialog(null, "no se ha generado el pedido corecto controlar y eliminar");
                           }
            }
            
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al queres registra el pedido salga y vuelva a entrar al programa... si el problema persiste contacte al Administrador" + ex.getMessage());
        }

        }     
    
    
          public int proximoNroPedido() throws SQLException{  // mio
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
    
          
    public List<Integer> meserosQAtendieronUnaMesaDada(int mesa, String fecha) throws SQLException { // mio
        List<Integer> meseros = new ArrayList();
        try {
            String sql = "select pedido.id_mesero from pedido where pedido.id_mesa=? AND pedido.fecha_hora=?";

            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, mesa);
            sentencia.setString(2, fecha);
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                meseros.add(resultado.getInt("id_mesero"));
            }
        } catch (SQLException sqe) {
            JOptionPane.showMessageDialog(null, sqe);
        }
        return meseros;
    }
    
    
    
    
     public Pedido dameUnpedidoPorSuNro(int ped) throws SQLException { // mio
         Pedido pedido = new Pedido();
        try {
            String sql = "SELECT * FROM pedido WHERE id_pedido=?";

            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, ped);
            ResultSet resultado = sentencia.executeQuery();
            
            while (resultado.next()) {
                pedido.setIdMesero(resultado.getInt("id_mesero"));
                pedido.setIdMesa(resultado.getInt("id_mesa"));
                pedido.setImporte(resultado.getDouble("importe"));
                
            }
        } catch (SQLException sqe) {
            JOptionPane.showMessageDialog(null, sqe);
        }
        return pedido;
    }
    
        public boolean meseroQAtiendeUnaMesaDada(int mesa, int mesero) throws SQLException { // mio
       
              int actual=0;
        try{
        String sql = "select id_mesero from pedido where id_mesa=? and cobrada=0;" ;   
        PreparedStatement sentencia = con.prepareStatement(sql);
        sentencia.setInt(1, mesa);
        ResultSet resultado =  sentencia.executeQuery();
        if(resultado.next()){
        actual=resultado.getInt("id_mesero");
        }
        }catch(SQLException sqle){
                    JOptionPane.showMessageDialog(null, sqle);
        }
         return actual==mesero;
    }    
            //select id_mesero from pedido join mesa on (pedido.id_mesa= 9 and mesa.estado_mesa = 1) order by id_mesero;
            
            
            public List<Pedido> listarPedido(String fechaABuscar){ //mio
          //SELECT * FROM pedido WHERE pedido.fecha_hora='2023-10-11 08:59:38';

//SELECT * FROM pedido WHERE pedido.fecha_hora BETWEEN '2023-10-11 00:00:00' and '2023-10-12 00:00:00';
//SELECT * FROM pedido WHERE pedido.fecha_hora BETWEEN '2023-10-12 00:00:00' and '2023-10-12 23:59:00';
    
        List<Pedido> pedidos = new ArrayList();
        try {
            //String sql = "SELECT * FROM pedido WHERE pedido.fecha_hora BETWEEN '2023-10-12 00:00:00' and '2023-10-12 23:59:59'";
              String sql = "SELECT * FROM pedido WHERE pedido.fecha_hora BETWEEN ? and ?";
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setString(1, fechaABuscar+" 00:00:00");
            sentencia.setString(2, fechaABuscar+" 23:59:59");
            ResultSet resultado = sentencia.executeQuery();
            Pedido pedido;
            while (resultado.next()) {
                
/*	
id_pedido	
id_mesa	
id_mesero	
fecha_hora	
importe	
cobrada
*/
                pedido = new Pedido();
                pedido.setIdPedido(resultado.getInt("id_pedido"));
                pedido.setIdMesa(resultado.getInt("id_mesa"));
                pedido.setIdMesero(resultado.getInt("id_mesero"));
//                Date fecha = resultado.getDate("fecha_hora");
//                SimpleDateFormat formato =  new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//                pedido.setFecha_hora(LocalDateTime.parse(formato.format(fecha)));
                LocalDateTime tiempo = LocalDateTime.now();
                pedido.setFecha_hora(tiempo);
                pedido.setImporte(resultado.getDouble("importe"));
                pedido.setCobrado(resultado.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
        } catch (SQLException sqe) {
            JOptionPane.showMessageDialog(null, sqe);
        }
        return pedidos;
    }    


            
            
               public List<Pedido> listarPedidoporNumero(int numeroABuscar){ //mio
          //SELECT * FROM pedido WHERE pedido.fecha_hora='2023-10-11 08:59:38';

//SELECT * FROM pedido WHERE pedido.fecha_hora BETWEEN '2023-10-11 00:00:00' and '2023-10-12 00:00:00';
//SELECT * FROM pedido WHERE pedido.fecha_hora BETWEEN '2023-10-12 00:00:00' and '2023-10-12 23:59:00';
    
        List<Pedido> pedidos = new ArrayList();
        try {
            //String sql = "SELECT * FROM pedido WHERE pedido.id_pedido=?";
              String sql = "SELECT * FROM pedido WHERE id_pedido= ?";
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, numeroABuscar);
            ResultSet resultado = sentencia.executeQuery();
            Pedido pedido;
            while (resultado.next()) {
                
/*	
id_pedido	
id_mesa	
id_mesero	
fecha_hora	
importe	
cobrada
*/
                pedido = new Pedido();
                pedido.setIdPedido(resultado.getInt("id_pedido"));
                pedido.setIdMesa(resultado.getInt("id_mesa"));
                pedido.setIdMesero(resultado.getInt("id_mesero"));
//                Date fecha = resultado.getDate("fecha_hora");
//                SimpleDateFormat formato =  new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//                pedido.setFecha_hora(LocalDateTime.parse(formato.format(fecha)));
                LocalDateTime tiempo = LocalDateTime.now();
                pedido.setFecha_hora(tiempo);
                pedido.setImporte(resultado.getDouble("importe"));
                pedido.setCobrado(resultado.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
        } catch (SQLException sqe) {
            JOptionPane.showMessageDialog(null, sqe);
        }
        return pedidos;
    }    
        
            
            
            
            

        
      
        
        
        public void eliminaPedido(int pedido){  
          try{
    String sql = "DELETE FROM `pedido` WHERE pedido.id_pedido=?";
        
        PreparedStatement sentencia = con.prepareStatement(sql);
        sentencia.setInt(1, pedido);
        int fila =sentencia.executeUpdate();
        JOptionPane.showMessageDialog(null, "filas eliminadas=" + fila);
        if (fila>0){
        JOptionPane.showMessageDialog(null, "eliminado");
        }else{
          JOptionPane.showMessageDialog(null, "NO eliminado");  
        }
        
      }catch(SQLException sqle){
          JOptionPane.showMessageDialog(null, sqle);
      }
    
    
}
    
    
    
        
        
        public void actualizoImporte(int pedido, double importe){
            //UPDATE pedido SET importe= ? WHERE id_pedido=?
            
            
            
        String sql = "UPDATE pedido SET importe= ? WHERE id_pedido=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, importe);
            ps.setInt(2, pedido);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Nevo valor actualizado exitosamente. "+exito);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO fue actualizado."+ex);
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
                pedido.setFechaHora(rs.getString(("fecha_hora")));

//                int mes = rs.getDate("fecha_hora").toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().getMonthValue();
//                int dia = rs.getDate("fecha_hora").toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().getDayOfMonth();
//                int hora = rs.getDate("fecha_hora").toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().getHour();
//                int minutos = rs.getDate("fecha_hora").toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().getMinute();
//                int segundos = rs.getDate("fecha_hora").toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().getSecond();
                
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
                pedido.setFechaHora(rs.getString("fecha_hora"));
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
                pedido.setFechaHora(rs.getString("fecha_hora"));
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
    
    public List<Pedido> listarIngresosPorFechaCobrados(String fecha1, String fecha2) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "select * from Pedido where fecha_hora between ? and ? and cobrada = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fecha1+" 00:00:00");
            ps.setString(2, fecha2+" 23:59:59");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdMesa(rs.getInt("id_mesa"));
                pedido.setIdMesero(rs.getInt("id_mesero"));
                pedido.setFechaHora(rs.getString("fecha_hora"));
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
    
    public List<Pedido> listarIngresosPorFechaPendientes(String fecha1, String fecha2) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "select * from Pedido where fecha_hora between ? and ? and cobrada = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fecha1+" 00:00:00");
            ps.setString(2, fecha2+" 23:59:59");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdMesa(rs.getInt("id_mesa"));
                pedido.setIdMesero(rs.getInt("id_mesero"));
                pedido.setFechaHora(rs.getString("fecha_hora"));
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
                pedido.setFechaHora(rs.getString("fecha_hora"));
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
                pedido.setFechaHora(rs.getString("fecha_hora"));
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
            
        
    
    
    
    
}// ***************** end class ****************








