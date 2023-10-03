
package proyFinalAtencionResto.Entidades;



public class Mesero extends Persona{
    
    private int idMesero;
    private boolean acceso;
    
//    Al extender de Persona, no es posible crear un constructor vacío.
//    public Mesero() {}
    
    public Mesero(int idMesero, int dni, String apellido, String nombre, boolean acceso) {
        super(dni, apellido, nombre);
        this.idMesero = idMesero;
        this.acceso = acceso;
    }
    
    public Mesero(int dni, String apellido, String nombre, boolean acceso) {
        super(dni, apellido, nombre);
        this.acceso = acceso;
    }
    
    public int getIdMesero() {
        return idMesero;
    }
    
    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
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
    
    public boolean getAcceso() {
        return acceso;
    }
    
    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    @Override
    public String toString() {
        return "Mesero{" + "idMesero=" + idMesero + ", dni=" + super.getDni() + ", apellido=" + super.getApellido() + ", nombre=" + super.getNombre() + ", acceso=" + acceso + '}';
    }

    
    
    
}
