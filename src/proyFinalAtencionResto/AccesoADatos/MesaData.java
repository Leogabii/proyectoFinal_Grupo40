/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyFinalAtencionResto.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyFinalAtencionResto.Entidades.Mesa;
import proyFinalAtencionResto.Entidades.Pedido;

/**
 *
 * @author li_ig
 */

public class MesaData {
    private Connection con=null;
    public MesaData(){
        con=(Connection) Coneccion.getConexion();
    }
    
    public boolean estadoMesa(int numeroMesa){
        boolean estado = false;
        String sql = "SELECT estado_mesa FROM mesa WHERE numero=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, numeroMesa);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                estado = rs.getBoolean("estado_mesa");
            }else{
                JOptionPane.showMessageDialog(null, "La mesa no existe");
        }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa " + ex.getMessage());
        }
        return estado;
    }
        
        public void actualizarEstadoMesa(int nroMesa,Boolean estado){
          
        String sql =  "UPDATE mesa SET estado_mesa= ? WHERE id_mesa=?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ps.setInt(2, nroMesa);
            
            
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La mesa no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la modificar el estado de una mesa " + ex.getMessage());
        }
         
         
    }
    
    
    
    
    
    
     public List<Mesa> listadoDeMesas() throws SQLException{
         List<Mesa> mesas = new ArrayList<>();
       try{
          
           String sql ="select * from mesa";
           PreparedStatement sentencia = con.prepareStatement(sql);
           ResultSet resultado =  sentencia.executeQuery();
           Mesa mesa;
           while (resultado.next()){
               mesa = new Mesa();
               mesa.setIdMesa(resultado.getInt("id_mesa"));
               mesa.setNumero(resultado.getInt("numero"));
               mesa.setEstadoMesa(resultado.getBoolean("estado_mesa"));
               mesa.setCapacidad(resultado.getInt("capacidad"));
               mesas.add(mesa);
           }
       }catch(SQLException sqle){
           JOptionPane.showMessageDialog(null, sqle);
           
       }
       return mesas;
         }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    } // ********** end class ****************


































































    //Calcula Subtotal: recibe la cantidad de un producto por su precio unitario, devuelve el 
//subtotal. Ejemplo dos gaseosas a 100$, subtotal 200$.
    
    /* para PRODUCTO DATA
    public int obtenerPrecioProducto(int idproducto) throws SQLException{
    Pedido x = new Pedido();
    String sql = "Select precio FROM producto WHERE idProducto=?";
        PreparedStatement ps = null;
        try{
            ps= con.prepareStatement(sql);
            ps.setInt(1, idproducto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                precioUnitario = rs.getInt("precio");
            }else{
                JOptionPane.showMessageDialog(null, "No existe el producto");
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto " + ex.getMessage());
        }
        return precioUnitario;
    }
    public void calculaSubtotal(int precioUnitario){
        Double precioSubtotal;
        String sql = "SELECT cantidad from pedidoProducto where "
        
    }
}

 /*
 public Alumno buscarAlumnoPorDni(int dni){
        Alumno alumno = null;
        String sql = "SELECT apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);// esta variable ver de donde sale
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return alumno;
    }
*/

