
package proyFinalAtencionResto.Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Pedido {
    
    private int idPedido;
    private int idMesa;
    private int idMesero;
    private LocalDateTime fecha_hora;
    private Double importe;
    
    private boolean cobrado;

    public Pedido() {
    }

    public Pedido(int idPedido, int idMesa, int idMesero, LocalDateTime fecha_hora, Double importe, boolean cobrado) {
        this.idPedido = idPedido;
        this.idMesa = idMesa;
        this.idMesero = idMesero;
        this.fecha_hora = fecha_hora;
        this.importe = importe;
        this.cobrado = cobrado;
    }

    public Pedido(int idMesa, int idMesero, LocalDateTime fecha_hora, Double importe, boolean cobrado) {
        this.idMesa = idMesa;
        this.idMesero = idMesero;
        this.fecha_hora = fecha_hora;
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

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDateTime fecha_hora) {
        this.fecha_hora = fecha_hora;
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
        return "Pedido{" + "idPedido=" + idPedido + ", idMesa=" + idMesa + ", idMesero=" + idMesero + ", fecha_hora=" + fecha_hora + ", importe=" + importe + ", cobrado=" + cobrado + '}';
    }


    
    
    
    
    
    
}
    


