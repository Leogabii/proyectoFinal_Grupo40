/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyFinalAtencionResto.Entidades;

/**
 *
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

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Mesero{" + "idMesero=" + idMesero + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio + ", localidad=" + localidad + ", telefono=" + telefono + ", provincia=" + provincia + '}';
    }

   
    
    
    
    
}
