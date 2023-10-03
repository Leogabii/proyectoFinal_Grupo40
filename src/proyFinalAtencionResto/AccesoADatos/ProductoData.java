
package proyFinalAtencionResto.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
 }
