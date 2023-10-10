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
<<<<<<< HEAD
    private int pedido;
    private int producto;
=======
    private int idPedido;
    private int idProducto;
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
    private int cantidad;

    public pedidoProducto() {
    }

<<<<<<< HEAD
    public pedidoProducto(int pedido, int producto, int cantidad) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public pedidoProducto(int idPedidoProd, int pedido, int producto, int cantidad) {
        this.idPedidoProd = idPedidoProd;
        this.pedido = pedido;
        this.producto = producto;
=======
    public pedidoProducto(int idPedidoProd, int pedido, int producto, int cantidad) {
        this.idPedidoProd = idPedidoProd;
        this.idPedido = pedido;
        this.idProducto = producto;
        this.cantidad = cantidad;
    }

    public pedidoProducto(int pedido, int producto, int cantidad) {
        this.idPedido = pedido;
        this.idProducto = producto;
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
        this.cantidad = cantidad;
    }

    public int getIdPedidoProd() {
        return idPedidoProd;
    }

    public void setIdPedidoProd(int idPedidoProd) {
        this.idPedidoProd = idPedidoProd;
    }

    public int getPedido() {
<<<<<<< HEAD
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
=======
        return idPedido;
    }

    public void setPedido(int pedido) {
        this.idPedido = pedido;
    }

    public int getProducto() {
        return idProducto;
    }

    public void setProducto(int producto) {
        this.idProducto = producto;
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "pedidoProducto{" + "idPedidoProd=" + idPedidoProd + ", pedido=" + idPedido + ", producto=" + idProducto + ", cantidad=" + cantidad + '}';
    }

  

    
    
    
    
    
    
}
