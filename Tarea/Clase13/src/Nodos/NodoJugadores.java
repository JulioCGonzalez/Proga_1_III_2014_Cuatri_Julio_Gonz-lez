/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Julio César
 */
public class NodoJugadores {
String nombre;
int edad;

    NodoJugadores siguiente;

public NodoJugadores(){
    nombre="";
    edad=0;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public NodoJugadores getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoJugadores siguiente) {
        this.siguiente = siguiente;
    }

}
