
package proyFinalAtencionResto.Entidades;

import java.time.LocalDate;


public class Pedido {
    
    private int idPedido;
    private int idMesa;
    private int idMesero;
    private LocalDate fechaHora;
    private Double importe;
    
    private boolean cobrado;

    public Pedido() {
    }
    

    public Pedido(int idPedido,  int mesa, int idMesero, LocalDate fechaHora, Double importe, boolean cobrado) {
        this.idPedido = idPedido;
        this.idMesa = mesa;
        this.idMesero = idMesero;
        this.fechaHora = fechaHora;
        this.importe = importe;
        this.cobrado = cobrado;
    }

    public Pedido(int mesa, int idMesero, LocalDate fechaHora, Double importe, boolean cobrado) {
        this.idMesa = mesa;
        this.idMesero = idMesero;
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

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int mesa) {
        this.idMesa = mesa;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
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
        return "Pedido{" + "idPedido=" + idPedido + ", idMesa=" + idMesa + ", idMesero=" + idMesero + ", fechaHora=" + fechaHora + ", importe=" + importe + ", cobrado=" + cobrado + '}';
    }
    
    
    
}
