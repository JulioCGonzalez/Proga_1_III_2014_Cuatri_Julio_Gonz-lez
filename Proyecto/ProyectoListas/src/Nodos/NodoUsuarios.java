package Nodos;

public class NodoUsuarios {
private int numerosocio;
private String nombre;
private String morosidad;
private String direccion;
private int telefono;
private NodoUsuarios siguiente;



    public int getNumerosocio() {
        return numerosocio;
    }

    public void setNumerosocio(int numerosocio) {
        this.numerosocio = numerosocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMorosidad() {
        return morosidad;
    }

    public void setMorosidad(String morosidad) {
        this.morosidad = morosidad;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public NodoUsuarios getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuarios siguiente) {
        this.siguiente = siguiente;
    }

    

  

    
}
