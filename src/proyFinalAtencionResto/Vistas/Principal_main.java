
package proyFinalAtencionResto.Vistas;

import java.sql.Connection;
import java.util.Scanner;
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
    
    Scanner x = new Scanner(System.in);
    System.out.println("Ingrese nombre del producto ");
    String nombre = x.nextLine();
    ProductoData pd = new ProductoData();
    Producto producto = new Producto("Pepsi", "Bebida", 1000, 10, true);
    pd.modificarProductoPorNombre(producto, nombre);
        

//        JOptionPane.showConfirmDialog(null, "guarda un producto???");
//ProductoData gestionProducto = new ProductoData();
//Producto unProducto=new Producto ("hamburguesas",10,450.22);
//gestionProducto.guardarProducto(unProducto);

//Prueba_desdeElMain prueba = new Prueba_desdeElMain();
//prueba.cargarProducto();


//String nombreViejo = x.next();
//        System.out.println(nombreViejo);
        
//if ("cocacola".equals(nombreviejo)){
//System.out.println(nombreviejo);
//}
//luego de una busqueda me crea un objeto de tipo producto, el cual voy a modificar los datos a cambiar
/*
pd.guardarProducto(producto);
*/
//pd.modificarProductoPorId(producto);

    }
    
    
    
}
