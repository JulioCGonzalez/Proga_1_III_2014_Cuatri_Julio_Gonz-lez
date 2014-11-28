package Nodos;

import Listas.ListaPelicula_Juegos;
import Listas.ListaUsarios;

public class NodoVenta {
private int numerosocio;
private String comprador;
private int total;
private String peliculas,juegos;
private NodoVenta siguiente;

    public int getNumerosocio() {
        return numerosocio;
    }

    public void setNumerosocio(int numerosocio) {
        this.numerosocio = numerosocio;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(String peliculas) {
        this.peliculas = peliculas;
    }

    public String getJuegos() {
        return juegos;
    }

    public void setJuegos(String juegos) {
        this.juegos = juegos;
    }

    public NodoVenta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoVenta siguiente) {
        this.siguiente = siguiente;
    }


}
