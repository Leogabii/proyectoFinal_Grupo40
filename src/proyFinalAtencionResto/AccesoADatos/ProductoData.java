
package proyFinalAtencionResto.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
        String sql = "INSERT INTO producto (nombre, cantidad, precio,estado) VALUES (?, ?, ?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, producto.isEstado());
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
      String nombreViejo;
        public void modificarProductoPorNombre(Producto producto, String nombreViejo){
        // este metodo permitira modificar por nombre del producto y modificamos por el nombre como prueba.
         
        String sql = "UPDATE producto SET nombre = ? , cantidad = ?, precio = ? WHERE nombre =?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            
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
        public void modificarProductoPorId(Producto producto){
        // este metodo permitira modificar por id de producto.
       int idProducto = producto.getIdProducto();
        String sql = "UPDATE producto SET nombre = ? , cantidad = ?,  precio = ? WHERE idProducto =?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, idProducto);
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
         public List<Producto> listarProductoPorRangoDePrecio(int min, int max) {
        List<Producto> productos = new ArrayList<>();
        String sql = "select idProducto, nombre, cantidad, precio from producto from producto where precio between ? and ?";
        try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, min);
        ps.setInt(2, max);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            Producto producto = new Producto();
            producto = new Producto();
            producto.setIdProducto(rs.getInt(1));
            producto.setNombre(rs.getString(2));
            producto.setCantidad(rs.getInt(3));
            producto.setPrecio(rs.getDouble(4));
            producto.setEstado(true);
            productos.add(producto);
        } else {
            JOptionPane.showMessageDialog(null, "El producto no se ha encontrado");
        }
ps.close();
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
        return productos;
        
    }
 }
