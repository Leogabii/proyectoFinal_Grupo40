/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyFinalAtencionResto.Vistas;

import javax.swing.JOptionPane;
import proyFinalAtencionResto.AccesoADatos.ProductoData;
import proyFinalAtencionResto.Entidades.Producto;


public class Prueba_desdeElMain {

    private String nombre;
    private int cantidad;
    private double precio;
    private boolean estado=true;
    
    public Prueba_desdeElMain() {
    }
    
    /*public void cargarProducto(){
    
        
    nombre=JOptionPane.showInputDialog(null, "Ingrese al nombre del producto: ");
    cantidad=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad del producto " + nombre +": "));
    precio=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese al precio del producto" + nombre +": "));
    ProductoData gestionProducto = new ProductoData();
    Producto producto = new Producto(nombre,cantidad,precio);
    gestionProducto.guardarProducto(producto);
    
    
    
    
}
    
}
