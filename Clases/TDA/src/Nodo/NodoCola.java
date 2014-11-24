package Nodo;

public class NodoCola {
private String tiquete;
private String cliente;
private NodoCola siguiente;

    public NodoCola() {
    tiquete="";
    cliente="";
    siguiente=null;
    }

    public String getTiquete() {
        return tiquete;
    }

    public void setTiquete(String tiquete) {
        this.tiquete = tiquete;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }


}
