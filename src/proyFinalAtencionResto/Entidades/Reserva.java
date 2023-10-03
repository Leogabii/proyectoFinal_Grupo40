
package proyFinalAtencionResto.Entidades;

import java.time.LocalDate;

public class Reserva extends Persona{
    
    private int idReserva;
    private LocalDate fechaRes;
    private boolean estado;
    
//    Al extender de Persona, no es posible crear un constructor vacío.
//    public Reserva() {}
    
    public Reserva(int idReserva, int dni, String apellido, String nombre, boolean estado) {
        super(dni, apellido, nombre);
        this.idReserva = idReserva;
        this.estado = estado;
    }
    
    public Reserva(int dni, String apellido, String nombre, LocalDate fechaRes, boolean estado) {
        super(dni, apellido, nombre);
        this.estado = estado;
    }
    
    private int getIdReserva() {
        return idReserva;
    }
    
    private void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    
    @Override
    public int getDni() {
        return super.getDni();
    }
    
    @Override
    public void setDni(int dni) {
        super.setDni(dni);
    }
    
    @Override
    public String getApellido() {
        return super.getApellido();
    }
    
    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }
    
    @Override
    public String getNombre() {
        return super.getNombre();
    }
    
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }
    
    private LocalDate getFechaRes() {
        return fechaRes;
    }
    
    private void setFechaRes(LocalDate fechaRes) {
        this.fechaRes = fechaRes;
    }
    
    private boolean getEstado() {
        return estado;
    }
    
    private void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", dni=" + super.getDni() + ", apellido=" + super.getApellido() + ", nombre=" + super.getNombre() + ", fechaRes=" + fechaRes + ", estado=" + estado + '}';
    }

    
}
