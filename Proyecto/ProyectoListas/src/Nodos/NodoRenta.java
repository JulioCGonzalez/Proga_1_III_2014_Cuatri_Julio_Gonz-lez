package Nodos;

import Listas.ListaPelicula_Juegos;
import Listas.ListaUsarios;

public class NodoRenta {

    private String nombre;
    private int numerosocio;
    private int renta;
    private int idrenta;
    private NodoRenta siguiente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getNumerosocio() {
        return numerosocio;
    }

    public void setNumerosocio(int numerosocio) {
        this.numerosocio = numerosocio;
    }

    public int getRenta() {
        return renta;
    }

    public void setRenta(int renta) {
        this.renta = renta;
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
