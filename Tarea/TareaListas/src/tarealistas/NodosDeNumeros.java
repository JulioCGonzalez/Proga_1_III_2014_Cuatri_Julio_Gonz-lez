package tarealistas;

public class NodosDeNumeros {
    double numero;
NodosDeNumeros siguiente;

public NodosDeNumeros(){
    numero=0;
    siguiente=null;
}

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public NodosDeNumeros getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodosDeNumeros siguiente) {
        this.siguiente = siguiente;
    }
}
