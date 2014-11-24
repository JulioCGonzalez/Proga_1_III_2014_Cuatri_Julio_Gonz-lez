package Nodos;

public class NodoPelicula_Juegos {
int id;
String nombre;
String tipo;
int costo;
int fechaentrega;
int fecherecepcion;
String genero;
NodoPelicula_Juegos siguiente;

    public NodoPelicula_Juegos() {
    id = 0;
    nombre = "";
    tipo = "";
    costo = 0;
    fechaentrega = 0;
    fecherecepcion = 0;
    genero = "";
    siguiente=null;
    }

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

    public int getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(int fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public int getFecherecepcion() {
        return fecherecepcion;
    }

    public void setFecherecepcion(int fecherecepcion) {
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
