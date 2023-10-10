
package proyFinalAtencionResto.Entidades;

import java.time.LocalDate;


public class Pedido {
    
    private int idPedido;
    private int mesa;
    private int legajoMesero;
    private LocalDate fechaHora;
    private Double importe;
    private boolean cobrado;

    public Pedido() {
    }

    public Pedido(int mesa, int legajoMesero, LocalDate fechaHora, Double importe, boolean cobrado) {
        this.mesa = mesa;
        this.legajoMesero = legajoMesero;
        this.fechaHora = fechaHora;
        this.importe = importe;
        this.cobrado = cobrado;
    }

    public Pedido(int idPedido, int mesa, int legajoMesero, LocalDate fechaHora, Double importe, boolean cobrado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.legajoMesero = legajoMesero;
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

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public int getLegajoMesero() {
        return legajoMesero;
    }

    public void setLegajoMesero(int legajoMesero) {
        this.legajoMesero = legajoMesero;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
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
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", legajoMesero=" + legajoMesero + ", fechaHora=" + fechaHora + ", importe=" + importe + ", cobrado=" + cobrado + '}';
    }
    
    
    
    
    
    
    
    
}
   