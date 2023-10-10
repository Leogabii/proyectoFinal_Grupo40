/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyFinalAtencionResto.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
        
    }    
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

