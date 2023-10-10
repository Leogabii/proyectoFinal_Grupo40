
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
   
    
    
}
