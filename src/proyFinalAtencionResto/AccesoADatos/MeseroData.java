
package proyFinalAtencionResto.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyFinalAtencionResto.Entidades.Mesero;
import proyFinalAtencionResto.Entidades.Pedido;


/**
 *
 * @author Grupo40
 */
public class MeseroData {
    
    Connection con = null;
    
    public MeseroData() {
        con = (Connection) Coneccion.getConexion();
    }
   
    
    
        public List<Mesero> listadoDeMeseros() throws SQLException{
         List<Mesero> meseros = new ArrayList<>();
       try{
          
           String sql ="select * from mesero";
           PreparedStatement sentencia = con.prepareStatement(sql);
           ResultSet resultado =  sentencia.executeQuery();
           Mesero mesero;
           while (resultado.next()){
               mesero = new Mesero();
               mesero.setIdMesero(resultado.getInt("id_mesero"));
               mesero.setNombre(resultado.getString("nombre"));
               mesero.setApellido(resultado.getString("apellido"));
               mesero.setDni(resultado.getInt("dni"));
               mesero.setDomicilio(resultado.getString("direccion"));
               mesero.setLocalidad(resultado.getString("localidad"));
               mesero.setTelefono(resultado.getString("telefono"));
               mesero.setProvincia(resultado.getString("provincia"));
               meseros.add(mesero);
           }
       }catch(SQLException sqle){
           JOptionPane.showMessageDialog(null, sqle);
           
       }
       return meseros;
         }
  
    
    
    
    
    
    
}
