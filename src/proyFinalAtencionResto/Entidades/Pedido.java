
package proyFinalAtencionResto.Entidades;


public class Pedido {
    
    private int idPedido;
    private boolean estado;
    
    public Pedido() {}
    
    public Pedido(int idPedido, boolean estado) {
        this.idPedido = idPedido;
        this.estado = estado;
    }
    
    public Pedido(boolean estado) {
        this.estado = estado;
    }
    
    public int getIdPedido() {
        return idPedido;
    }
    
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    public boolean getEstado() {
        return estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", estado=" + estado + '}';
    }
    
    
}
