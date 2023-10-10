
package proyFinalAtencionResto.Entidades;


public class Mesa {
    
    
    private int idMesa, numero, capacidad;
    private boolean estadoMesa;
    
    public Mesa() {}
    
    public Mesa(int idMesa,int numero, int capacidad, boolean estado) {
        this.idMesa = idMesa;
        this.numero = numero;
        this.capacidad = capacidad;
        this.estadoMesa= estado;
    }
    
    public Mesa( int numero,int capacidad, boolean estado) {
        this.numero = numero;
        this.capacidad = 10;
        this.estadoMesa = estado;
    }
    
    public int getIdMesa() {
        return idMesa;
    }
    
    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(boolean estadoMesa) {
        this.estadoMesa = estadoMesa;
    }
    
   

    @Override
    public String toString() {
        return "Mesa{" + "idMesa=" + idMesa + ",numero=" + numero + ",capacidad=" + capacidad + ", estado=" + estadoMesa + '}';
    }
    
    
    
    
}
