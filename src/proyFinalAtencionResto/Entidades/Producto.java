
package proyFinalAtencionResto.Entidades;

/**
 *
 * @author Grupo Sala 40 
 * Proyecto - Final
 */
public class Producto {
 
<<<<<<< HEAD
    private int idProducto;
=======
    private int idProducto; 
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
    private String nombreProducto;
    private String tipoProducto;
    private double precio;
    private int stock;
<<<<<<< HEAD
    private boolean estado;
=======
    private boolean estado=true;
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43

    
    
    public Producto() {
    }

<<<<<<< HEAD
    public Producto(String nombreProducto, double precio, int stock) {
=======
    public Producto(int idProducto,String nombreProducto, String tipoProducto, double precio, int stock, boolean estado) {
        this.idProducto = idProducto; 
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.stock = stock;
<<<<<<< HEAD
        this.estado = true;
    }

    public Producto(int idProducto, int stock) {
        this.idProducto = idProducto;
        this.stock = stock;
    }
    
    

    public Producto(int idProducto, String nombreProducto, double precio, int stock, boolean estado) {
        this.idProducto = idProducto;
=======
        this.estado = estado;
    }

    public Producto( String nombreProducto,String tipoProducto, double precio, int stock, boolean estado) {
        this.tipoProducto = tipoProducto;
>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
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
<<<<<<< HEAD
        return ""+ idProducto + ", " + nombreProducto ;
    }

    
=======
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", tipoProducto=" + tipoProducto + ", precio=" + precio + ", stock=" + stock + ", estado=" + estado + '}';
    }

    

>>>>>>> b3a3c8e832d9d934744d5dca742cdebc298fab43
    
   
}
