
package proyFinalAtencionResto.Vistas;

import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import proyFinalAtencionResto.AccesoADatos.Coneccion;
import proyFinalAtencionResto.AccesoADatos.MeseroData;
import proyFinalAtencionResto.AccesoADatos.PedidoData;
import proyFinalAtencionResto.AccesoADatos.ProductoData;
import proyFinalAtencionResto.Entidades.Mesa;
import proyFinalAtencionResto.Entidades.Mesero;
import proyFinalAtencionResto.Entidades.Pedido;
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
//    MeseroData md = new MeseroData();
//    List<Mesero> meseros = new ArrayList<>();
//    meseros = md.listaDeMeseros();
//    for(Mesero mesero: meseros) {
//        System.out.println(mesero);
//    }
//    PedidoData pd = new PedidoData();
//    List<Pedido> pedidos = new ArrayList<>();
//    pedidos = pd.listarPedidosPorIdMesero(2);
//    for(Pedido pedido: pedidos) {
//        System.out.println(pedidos);
//    }
//    PedidoData pd = new PedidoData();
//    List<Pedido> pedidos = new ArrayList<>();
//    pedidos = pd.listarPedidosPorIdMeseroIdMesa(2,2);
//    for(Pedido pedido: pedidos) {
//        System.out.println(pedidos);
//    }
//    
//    PedidoData pd = new PedidoData();
//    List<Pedido> pedidos = new ArrayList<>();
//    pedidos = pd.listarPedidosDeMeseroPorFecha(2,"2023-10-11", "2023-10-12");
//    for(Pedido pedido: pedidos) {
//        System.out.println(pedidos);
//    }
//
//    PedidoData pd = new PedidoData();
//    List<Pedido> pedidos = new ArrayList<>();
//    pedidos = pd.listarPedidosDeMesaPorFecha(2,"2023-10-11", "2023-10-12");
//    for(Pedido pedido: pedidos) {
//        System.out.println(pedidos);
//    }

//    PedidoData pd = new PedidoData();
//    List<Pedido> pedidos = new ArrayList<>();
//    pedidos = pd.listarIngresosPorFecha("2023-10-11", "2023-10-12");
//    for(Pedido pedido: pedidos) {
//        System.out.println(pedidos);
//    }

//    PedidoData pd = new PedidoData();
//    List<Pedido> pedidos = new ArrayList<>();
//    pedidos = pd.listarIngresosDelDiaCobrados();
//    for(Pedido pedido: pedidos) {
//        System.out.println(pedidos);
//    }

//    PedidoData pd = new PedidoData();
//    List<Pedido> pedidos = new ArrayList<>();
//    pedidos = pd.listarIngresosDelDiaPendientes();
//    for(Pedido pedido: pedidos) {
//        System.out.println(pedidos);
//    }

    PedidoData pd = new PedidoData();
    List<Mesa> lista = new ArrayList<>();
    lista = pd.listarMesasPorIdMesero(2);
//    if (lista.isEmpty()){
//        System.out.println("La lista está vacía");
//    } 
    for(Mesa mesa: lista) {
        System.out.println(mesa.getIdMesa());
    }

    }
    
    
    
}
