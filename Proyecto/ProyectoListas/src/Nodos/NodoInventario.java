package Nodos;

import Listas.ListaPelicula_Juegos;

public class NodoInventario {
private int id;
private int cantidad;
private int costodecompra;
private String peliculas,juegos;
private NodoInventario siguiente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCostodecompra() {
        return costodecompra;
    }

    public void setCostodecompra(int costodecompra) {
        this.costodecompra = costodecompra;
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

   Object cambio = null;
   
   String kk = (String) cambio;
   

    public NodoInventario getSiguiente() {
        return siguiente;        
    }

    public void setSiguiente(NodoInventario siguiente) {
        this.siguiente = siguiente;
    }

    public boolean getCostodecompra(boolean equals) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
