
package proyFinalAtencionResto.Vistas;

import java.sql.Connection;
import javax.swing.JOptionPane;
import proyFinalAtencionResto.AccesoADatos.Coneccion;
import proyFinalAtencionResto.AccesoADatos.ProductoData;
import proyFinalAtencionResto.Entidades.Producto;



/**
 *
 * @author Grupo Sala 40 
 * Proyecto - Final
 */
public class Principal_main {

    Connection con=null;
    public static void main(String[] args) {
       
//        Coneccion.getConexion();

//        JOptionPane.showConfirmDialog(null, "guarda un producto???");
//ProductoData gestionProducto = new ProductoData();
//Producto unProducto=new Producto ("hamburguesas",10,450.22);
//gestionProducto.guardarProducto(unProducto);

Prueba_desdeElMain prueba = new Prueba_desdeElMain();
prueba.cargarProducto();

    }
    
    
    
}
