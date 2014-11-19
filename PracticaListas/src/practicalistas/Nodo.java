package practicalistas;
public class Nodo {
int numero;
Nodo siguiente;

public Nodo(){
    numero=0;
    siguiente=null;
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
