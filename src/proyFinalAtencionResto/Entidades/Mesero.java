<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
=======

>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
package proyFinalAtencionResto.Entidades;

/**
 *
<<<<<<< HEAD
 * @author eduardo
 */
public class Mesero {
    
    private int idMesero;
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private String localidad;
    private String telefono;
    private String provincia;

    public Mesero() {
    }

    public Mesero(String nombre, String apellido, int dni, String domicilio, String localidad, String telefono, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.telefono = telefono;
        this.provincia = provincia;
    }

    public Mesero(int idMesero, String nombre, String apellido, int dni, String domicilio, String localidad, String telefono, String provincia) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.telefono = telefono;
        this.provincia = provincia;
    }

    public int getIdMesero() {
        return idMesero;
    }

=======
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
    
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

<<<<<<< HEAD
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
=======
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
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

<<<<<<< HEAD
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
=======
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
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

<<<<<<< HEAD
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

=======
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "" + nombre + ", " + apellido + ", dni=" + dni + " ";
    }
    
    
    
    
=======
        return "Mesero{" + "idMesero=" + idMesero + ", codigo=" + codigo + ", dni=" + dni + ", telefono=" + telefono + ", apellido=" + apellido + ", nombre=" + nombre + ", domicilio=" + domicilio + ", localidad=" + localidad + ", provincia=" + provincia + '}';
    }
    
    
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
}
