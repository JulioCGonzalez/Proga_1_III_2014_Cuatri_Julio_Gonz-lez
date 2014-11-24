package Nodos;

public class NodoRenta {
int numerosocio;
String pelicula,juego;
int idrenta;
NodoRenta siguiente;

    public NodoRenta() {
    numerosocio=0;
    pelicula="";
    juego="";
    idrenta = 0;
    siguiente=null;
    }

    public int getNumerosocio() {
        return numerosocio;
    }

    public void setNumerosocio(int numerosocio) {
        this.numerosocio = numerosocio;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public int getIdrenta() {
        return idrenta;
    }

    public void setIdrenta(int idrenta) {
        this.idrenta = idrenta;
    }

    public NodoRenta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRenta siguiente) {
        this.siguiente = siguiente;
    }

    public boolean getNumerosocio(boolean equals) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
