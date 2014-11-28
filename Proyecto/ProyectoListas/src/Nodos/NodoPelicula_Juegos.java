package Nodos;

import java.util.Date;

public class NodoPelicula_Juegos {
private int id;
private String nombre;
private String tipo;
private int costo;
private Date fechaentrega;
private Date fecherecepcion;
private String genero;
private NodoPelicula_Juegos siguiente;

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Date getFecherecepcion() {
        return fecherecepcion;
    }

    public void setFecherecepcion(Date fecherecepcion) {
        this.fecherecepcion = fecherecepcion;
    }

    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public NodoPelicula_Juegos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPelicula_Juegos siguiente) {
        this.siguiente = siguiente;
    }

    
}
