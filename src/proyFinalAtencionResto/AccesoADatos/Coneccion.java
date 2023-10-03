/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyFinalAtencionResto.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo Sala 40 
 * Proyecto - Final
 */

public class Coneccion {
    
     private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String PASSWORD="";
    private static final String URL ="jdbc:mysql://localhost:3306/";
    private static final String DB="atenciondelresto";
    private static final String USUARIO="root";
    private static Connection connection;

    private Coneccion() {
    }
    
    public static Connection getConexion(){
        
        if (connection==null){
            try{
                Class.forName(DRIVER);
                
              connection=(Connection) DriverManager.getConnection(URL+DB + "?useLegacyDatetimeCode="
                      + "false&serverTimezone=UTC" + "&user=" + USUARIO + "&password=" + PASSWORD);

                    JOptionPane.showMessageDialog(null, "Conexion exitosa!!!");
            }catch(ClassNotFoundException | SQLException ex){
                JOptionPane.showMessageDialog(null,"mensaje de error: " + ex.getMessage());
            }
            
            
            
            
        }
        return connection;
    }  
    
}
