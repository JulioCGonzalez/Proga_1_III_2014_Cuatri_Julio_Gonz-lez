package Nodos;

public class NodoUsuarios {
int numerosocio;
String nombre;
int morosidad;
String direccion;
int telefono;
NodoUsuarios siguiente;

    public NodoUsuarios() {
    numerosocio=0;
    nombre="";
    morosidad=0;
    telefono=0;
    siguiente=null;
    }

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

    public int getMorosidad() {
        return morosidad;
    }

    public void setMorosidad(int morosidad) {
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

    public boolean getNumerosocio(boolean equals) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
