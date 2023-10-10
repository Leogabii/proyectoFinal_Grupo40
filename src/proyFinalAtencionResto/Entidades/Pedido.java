
package proyFinalAtencionResto.Entidades;

import java.time.LocalDate;


public class Pedido {
    
    private int idPedido;
<<<<<<< HEAD
    private int mesa;
    private int legajoMesero;
=======
    private int idMesa;
    private String nombreMesero;
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
    private LocalDate fechaHora;
    private Double importe;
    private boolean cobrado;

    public Pedido() {
    }

<<<<<<< HEAD
    public Pedido(int mesa, int legajoMesero, LocalDate fechaHora, Double importe, boolean cobrado) {
        this.mesa = mesa;
        this.legajoMesero = legajoMesero;
=======
    public Pedido(int idPedido,  int mesa, String nombreMesero, LocalDate fechaHora, Double importe, boolean cobrado) {
        this.idPedido = idPedido;
        this.idMesa = mesa;
        this.nombreMesero = nombreMesero;
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
        this.fechaHora = fechaHora;
        this.importe = importe;
        this.cobrado = cobrado;
    }

<<<<<<< HEAD
    public Pedido(int idPedido, int mesa, int legajoMesero, LocalDate fechaHora, Double importe, boolean cobrado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.legajoMesero = legajoMesero;
=======
    public Pedido(int mesa, String nombreMesero, LocalDate fechaHora, Double importe, boolean cobrado) {
        this.idMesa = mesa;
        this.nombreMesero = nombreMesero;
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
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

<<<<<<< HEAD
    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
=======
    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int mesa) {
        this.idMesa = mesa;
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
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
<<<<<<< HEAD
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", legajoMesero=" + legajoMesero + ", fechaHora=" + fechaHora + ", importe=" + importe + ", cobrado=" + cobrado + '}';
=======
        return "Pedido{" + "idPedido=" + idPedido + ", idMesa=" + idMesa + ", nombreMesero=" + nombreMesero + ", fechaHora=" + fechaHora + ", importe=" + importe + ", cobrado=" + cobrado + '}';
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
    }
    
    
    
    
    
    
    
    
}
   