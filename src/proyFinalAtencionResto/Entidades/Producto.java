
package proyFinalAtencionResto.Entidades;

/**
 *
 * @author Grupo Sala 40 
 * Proyecto - Final
 */
public class Producto {
 
    private int idProducto; 
    private String nombreProducto;
    private String tipoProducto;
    private double precio;
    private int stock;
    private boolean estado=true;

    public Producto() {
    }

    public Producto(int idProducto,String nombreProducto, String tipoProducto, double precio, int stock, boolean estado) {
        this.idProducto = idProducto; 
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto( String nombreProducto,String tipoProducto, double precio, int stock, boolean estado) {
        this.tipoProducto = tipoProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "" + nombreProducto  + "";
    }

    

    
   
    
    
}
