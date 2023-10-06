
package proyFinalAtencionResto.Entidades;

import java.time.LocalDate;


public class Pedido {
    
    private int idPedido;
    private Mesa mesa;
    private String nombreMesero;
    private LocalDate fechaHora;
    private Double importe;
    
    private boolean cobrado;

    public Pedido() {
    }
    

    public Pedido(int idPedido,  Mesa mesa, String nombreMesero, LocalDate fechaHora, Double importe, boolean cobrado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fechaHora = fechaHora;
        this.importe = importe;
        this.cobrado = cobrado;
    }

    public Pedido(Mesa mesa, String nombreMesero, LocalDate fechaHora, Double importe, boolean cobrado) {
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fechaHora = fechaHora;
        this.importe = importe;
        this.cobrado = cobrado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFecha_hora(LocalDate fechahora) {
        this.fechaHora = fechaHora;
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
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", nombreMesero=" + nombreMesero + ", fechaHora=" + fechaHora + ", importe=" + importe + ", cobrado=" + cobrado + '}';
    }
    
    
    
}
