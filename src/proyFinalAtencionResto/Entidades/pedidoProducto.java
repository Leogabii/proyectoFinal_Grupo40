/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyFinalAtencionResto.Entidades;

/**
 *
 * @author li_ig
 */
public class pedidoProducto {
    private int idPedidoProd;
    private int pedido;
    private int producto;
    private int cantidad;

    public pedidoProducto() {
    }

    public pedidoProducto(int pedido, int producto, int cantidad) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public pedidoProducto(int idPedidoProd, int pedido, int producto, int cantidad) {
        this.idPedidoProd = idPedidoProd;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getIdPedidoProd() {
        return idPedidoProd;
    }

    public void setIdPedidoProd(int idPedidoProd) {
        this.idPedidoProd = idPedidoProd;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "pedidoProducto{" + "idPedidoProd=" + idPedidoProd + ", pedido=" + pedido + ", producto=" + producto + ", cantidad=" + cantidad + '}';
    }

  

    
    
    
    
    
    
}
