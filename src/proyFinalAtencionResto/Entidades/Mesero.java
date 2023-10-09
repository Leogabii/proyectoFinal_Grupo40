
package proyFinalAtencionResto.Entidades;

/**
 *
 * @author Grupo40
 */
public class Mesero {
    
    private int idMesero, codigo, dni, telefono;
    private String apellido, nombre, domicilio, localidad, provincia;
    
    public Mesero() {}
    
    public Mesero (int idMesero, int codigo, String apellido, String nombre, int dni, int telefono, String domicilio, String localidad, String provincia) {
        this.idMesero = idMesero;
        this.codigo = codigo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.provincia = provincia;
    }
    
    public Mesero (int codigo, String apellido, String nombre, int dni, int telefono, String domicilio, String localidad, String provincia) {
        this.codigo = codigo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.provincia = provincia;
    }
    
    public int getIdMesero() {
        return idMesero;
    }
    
    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Mesero{" + "idMesero=" + idMesero + ", codigo=" + codigo + ", dni=" + dni + ", telefono=" + telefono + ", apellido=" + apellido + ", nombre=" + nombre + ", domicilio=" + domicilio + ", localidad=" + localidad + ", provincia=" + provincia + '}';
    }
    
    
}
