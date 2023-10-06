
package proyFinalAtencionResto.Entidades;

/**
 *
 * @author Grupo Sala 40 
 * Proyecto - Final
 */
public class Producto {
 
    private int idProducto;
    private String tipoProducto;
    private String nombreProducto;
    private double precio;
    private boolean estado=true;

    public Producto() {
    }

    public Producto(int idProducto, String tipoProducto, String nombreProducto, double precio) {
        this.idProducto = idProducto;
        this.tipoProducto = tipoProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public Producto(String tipoProducto, String nombreProducto, double precio) {
        this.tipoProducto = tipoProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", tipoProducto=" + tipoProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio + ", estado=" + estado + '}';
    }

   
    
    
}
