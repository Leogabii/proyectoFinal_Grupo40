
package proyFinalAtencionResto.Entidades;

import java.time.LocalDate;


public class Pedido {
    
    private int idPedido;
    private String tipoProducto;
    private Mesa mesa;
    private String nombreMesero;
    private LocalDate fechaHora;
    private Double importe;
    
    private boolean cobrado;

    public Pedido() {
    }
    

    public Pedido(int idPedido, String tipoProducto, Mesa mesa, String nombre_Mesero, LocalDate fecha_hora, Double importe, boolean cobrado) {
        this.idPedido = idPedido;
        this.tipoProducto = tipoProducto;
        this.mesa = mesa;
        this.nombreMesero = nombre_Mesero;
        this.fechaHora = fecha_hora;
        this.importe = importe;
        this.cobrado = cobrado;
    }

    public Pedido(String tipoProducto, Mesa mesa, String nombre_Mesero, LocalDate fecha_hora, Double importe, boolean cobrado) {
        this.tipoProducto = tipoProducto;
        this.mesa = mesa;
        this.nombreMesero = nombre_Mesero;
        this.fechaHora = fecha_hora;
        this.importe = importe;
        this.cobrado = cobrado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getNombre_Mesero() {
        return nombreMesero;
    }

    public void setNombre_Mesero(String nombre_Mesero) {
        this.nombreMesero = nombre_Mesero;
    }

    public LocalDate getFecha_hora() {
        return fechaHora;
    }

    public void setFecha_hora(LocalDate fecha_hora) {
        this.fechaHora = fecha_hora;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public boolean isCobrado() {
        return cobrado;
    }

    public void setCobrado(boolean cobrado) {
        this.cobrado = cobrado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", tipoProducto=" + tipoProducto + ", mesa=" + mesa + ", nombre_Mesero=" + nombreMesero + ", fecha_hora=" + fechaHora + ", importe=" + importe + ", cobrado=" + cobrado + '}';
    }
    
    
    
}
