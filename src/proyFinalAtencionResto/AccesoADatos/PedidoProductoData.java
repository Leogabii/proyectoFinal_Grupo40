/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyFinalAtencionResto.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class PedidoProductoData {
    
       private Connection con = null;
    
    public PedidoProductoData() {
        con = (Connection) Coneccion.getConexion();
    }
    
    public void registrarPedido(int pedido, HashMap<Integer,Integer> mapaProductos) throws SQLException {
    
        
    
    
    //***************+ aca va para registrar producto **************************
        //**********+ inserto el pedido **************
        //INSERT INTO `pedido`(`id_pedido`, `id_mesa`, `id_mesero`, `fecha_hora`, `importe`, `cobrada`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]')
        //*********** inserto productos pedidos a la tabla pedidoproducto
        //INSERT INTO `pedidoproducto`(`id_pedido_producto`, `id_pedido`, `id_producto`, `cantidad`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]')
        
    
    
    /**
             * segunda parte
             * 
             * una vez generado el pedido ese numero se lo asigno a la tabla pedidoproducto que relaciona
             * pedidos con producto
             */
            
            /*
            INSERT INTO `pedidoproducto`(`id_pedido_producto`, `id_pedido`, `id_producto`, `cantidad`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]')
            */
            
            
            
            
            for (Map.Entry<Integer,Integer> value: mapaProductos.entrySet()){
              
                
            
            String sql2="INSERT INTO `pedidoproducto`(`id_pedido`, `id_producto`, `cantidad`) VALUES (?,?,?)";
            PreparedStatement Sentencia = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
            Sentencia.setInt(1, pedido);
            Sentencia.setInt(2, value.getKey());
            Sentencia.setInt(3, value.getValue());
            Sentencia.executeUpdate();
            }// termina de recorrer los datos que vinieron de la tabla
            }
    
    

            
      public void eliminaPedidoProducto(int pedido){  
          try{
    String sql = "DELETE FROM pedidoproducto WHERE pedidoproducto.id_pedido=?";
        
        PreparedStatement sentencia = con.prepareStatement(sql);
        sentencia.setInt(1, pedido);
        int fila =sentencia.executeUpdate();
//        JOptionPane.showMessageDialog(null, "filas eliminadas=" + fila);
//        if (fila>0){
//        JOptionPane.showMessageDialog(null, "eliminado");
//        }else{
//          JOptionPane.showMessageDialog(null, "NO eliminado");  
//        }
        
      }catch(SQLException sqle){
          JOptionPane.showMessageDialog(null, sqle);
      }
    
    
}
      
      
      public HashMap<Integer,Integer>  listarProductosporNumero(int pedido) throws SQLException {
        HashMap<Integer,Integer> mapaTemporal = new HashMap();
          try {
            String sql = "SELECT * FROM pedidoproducto WHERE id_pedido=?";

            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, pedido);
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                mapaTemporal.put(resultado.getInt("id_producto"),resultado.getInt("cantidad"));
            }
        } catch (SQLException sqe) {
            JOptionPane.showMessageDialog(null, sqe);
        }
        
      return mapaTemporal;
      }
      
      
      public void actualizaCantidad(int pedido, int producto, int cantidad){
          //UPDATE pedidoproducto SET cantidad= 100 WHERE id_pedido=1 and id_producto=2
          
          
          
          String sql = "UPDATE pedidoproducto SET cantidad= ? WHERE id_pedido=? and id_producto= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setInt(2, pedido);
            ps.setInt(3, producto);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Nevo valor actualizado exitosamente. "+exito);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO fue actualizado."+ex);
        }
      }
      
      
} // ********************+ end classs ****************