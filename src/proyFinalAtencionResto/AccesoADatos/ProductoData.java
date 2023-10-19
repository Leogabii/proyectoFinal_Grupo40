
package proyFinalAtencionResto.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.TreeSet;

import proyFinalAtencionResto.Entidades.Producto;

/**
 *
 * @author Grupo Sala 40 
 * Proyecto - Final
 */
public class ProductoData {


   
    private Connection con=null;

    public ProductoData() {
        con=(Connection) Coneccion.getConexion();
    }
   
    public void guardarProducto(Producto producto){
        int i=0;
        String sql = "INSERT INTO producto (nombre_producto, tipo_Producto, precio,stock, estado) VALUES (?, ?, ?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getTipoProducto());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            i=ps.executeUpdate();
            if (i!=0) JOptionPane.showMessageDialog(null, "Producto añadido con exito.");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a guardar un Producto" + ex.getMessage());
        }
    }
      public void eliminarProducto(int id){
        try {
            String sql = "UPDATE producto SET estado = 0 WHERE idProducto = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el producto");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla producto");
        }
 }
      
 
     //Tenemos que hacer una busqueda por nombre para acceder al nombre del producto a modificar
// ese nombre lo almacenamos en un String      
      // lo pasamos por parametro al metodo modificarProductoPorNombre para usarlo en el where
   /* String nombreViejo;
*/
        public void modificarProductoPorNombre(Producto producto, int id){
        // este metodo permitira modificar por nombre del producto y modificamos por el nombre como prueba.
         //nombre_producto, tipo_Producto, precio,stock, estado
        String sql = "UPDATE producto SET nombre_producto = ? , tipo_producto = ?, precio = ?,stock = ? WHERE idProducto =?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getTipoProducto());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setInt(5,id );
            
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El producto no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto " + ex.getMessage());
        }
    }
        
        
//        public void modificarProductoPorId(Producto producto){
//        // este metodo permitira modificar por id de producto.
//       int idProducto = producto.getIdProducto();
//        String sql = "UPDATE producto SET nombre = ?, cantidad = ?,  precio = ? WHERE idProducto =?";
//        PreparedStatement ps = null;
//
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setString(1, producto.getNombre());
//            ps.setInt(2, producto.getCantidad());
//            ps.setDouble(3, producto.getPrecio());
//            ps.setInt(4, idProducto);
//            int exito = ps.executeUpdate();
//
//            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
//            } else {
//                JOptionPane.showMessageDialog(null, "El producto no existe");
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto " + ex.getMessage());
//        }
//    }
//         public List<Producto> listarProductoPorRangoDePrecio(int min, int max) {
//        List<Producto> productos = new ArrayList<>();
//        String sql = "select idProducto, nombre, cantidad, precio from producto where precio between ? and ?";
//        try{
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setInt(1, min);
//        ps.setInt(2, max);
//        ResultSet rs = ps.executeQuery();
//        Producto producto = null;
//        while (rs.next()) {
//            producto = new Producto();
//            producto.setIdProducto(rs.getInt("idProducto"));
//            producto.setNombre(rs.getString("nombre"));
//            producto.setCantidad(rs.getInt("cantidad"));
//            producto.setPrecio(rs.getDouble("precio"));
//            producto.setEstado(true);
//            System.out.println("soy 127"+producto.toString());
//            productos.add(producto);
//            productos.forEach(System.out::println);
//        }
//ps.close();
//        } catch(SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
//        }
//        return productos;
//        
//    }
        
        
       public  List<Producto> listadoDeProductos() throws SQLException{
        List<Producto> listaProductos= new ArrayList<>();
       try{
          
           String sql ="select * from producto";
           PreparedStatement sentencia = con.prepareStatement(sql);
           ResultSet resultado =  sentencia.executeQuery();
           Producto producto;
           while (resultado.next()){
               producto = new Producto();
               producto.setIdProducto(resultado.getInt("idProducto"));
               producto.setNombreProducto(resultado.getString("nombre_producto"));
               producto.setTipoProducto(resultado.getString("tipo_producto"));
               producto.setPrecio(resultado.getDouble("precio"));
               producto.setStock(resultado.getInt("stock"));
               producto.setEstado(resultado.getBoolean("estado"));
               listaProductos.add(producto);
           }
       }catch(SQLException sqle){
           JOptionPane.showMessageDialog(null, sqle);
           
       }
       return listaProductos;
         }
       
        public Producto traemeDatoDeEsteProducto(int codigo){
            Producto producto = new Producto();
        try {
            String sql = "SELECT * FROM producto WHERE idProducto=?";

            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, codigo);
            ResultSet resultado = sentencia.executeQuery();
            
            while (resultado.next()) {
                producto.setNombreProducto(resultado.getString("nombre_producto"));
                producto.setPrecio(resultado.getDouble("precio"));
                
            }
        } catch (SQLException sqe) {
            JOptionPane.showMessageDialog(null, sqe);
        }
        return producto;
        }
       
       
  }  // ******************* end class ************************

      
