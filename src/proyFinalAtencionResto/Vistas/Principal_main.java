
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

    
    
    
    public static void main(String[] args) {
    
    

//        JOptionPane.showConfirmDialog(null, "guarda un producto???");
//ProductoData gestionProducto = new ProductoData();
//Producto unProducto=new Producto ("hamburguesas",10,450.22);
//gestionProducto.guardarProducto(unProducto);

//Prueba_desdeElMain prueba = new Prueba_desdeElMain();
//prueba.cargarProducto();
ProductoData pd = new ProductoData();
//luego de una busqueda me crea un objeto de tipo producto, el cual voy a modificar los datos a cambiar
Producto producto = new Producto(1, "Pepsi", 10, 400, true);

pd.modificarProductoPorId(producto);

    }
    
    
    
}
