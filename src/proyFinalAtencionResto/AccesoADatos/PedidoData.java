
package proyFinalAtencionResto.AccesoADatos;

import java.sql.Connection;
import proyFinalAtencionResto.Entidades.Pedido;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sun.security.rsa.RSACore;


/**
 *
 * @author Asus
 */
public class PedidoData {
    
    private Connection con = null;
    
    public PedidoData() {
        con = (Connection) Coneccion.getConexion();
    }
    
    private void guardarPedido(Pedido pedido) {
        int idMesa = pedido.getMesa().getIdMesa();
        String sql = "insert into pedido (id_mesa, nombre_mesero, fecha_hora) "
                + "values (?, ?, ?))";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,idMesa);
            ps.setString(2,pedido.getNombreMesero());
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
    
}
