
package proyFinalAtencionResto.Vistas;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import proyFinalAtencionResto.AccesoADatos.Coneccion;
import proyFinalAtencionResto.AccesoADatos.MeseroData;
import proyFinalAtencionResto.AccesoADatos.ProductoData;
import proyFinalAtencionResto.Entidades.Mesero;
import proyFinalAtencionResto.Entidades.Producto;



/**
 *
 * @author Grupo Sala 40 
 * Proyecto - Final
 */
public class Principal_main {

    
    
    
    public static void main(String[] args) {
    
//    PanelPrincipal menu = new PanelPrincipal();
//    menu.setVisible(true);
    MeseroData md = new MeseroData();
    List<Mesero> meseros = new ArrayList<>();
    meseros = md.listaDeMeseros();
    for(Mesero mesero: meseros) {
        System.out.println(mesero);
    }
       

    }
    
    
    
}
