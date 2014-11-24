/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoJugadores;

/**
 *
 * @author Julio César
 */
public class ListaJugadores {
    NodoJugadores raiz;
    
     public void Insertar(NodoJugadores jugador)
    {
        NodoJugadores nuevo;
        nuevo=new NodoJugadores();
        nuevo.setNombre(jugador.getNombre());
        nuevo.setEdad(jugador.getEdad());
        
        
        if(raiz==null)
        {
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }
        else
        {
            NodoJugadores auxiliar=raiz;
            while (auxiliar.getSiguiente()!=null) {
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }        
    }
     public boolean Eliminar(String nombre){
         NodoJugadores siguienteJugador = raiz;
         NodoJugadores anteriror = siguienteJugador;
         if (siguienteJugador==null) {
             System.out.println("La lista está vacía");
             return true;
         }
         while(siguienteJugador!=null){
             if (siguienteJugador.getNombre().equals(nombre)) {
                 if (raiz==siguienteJugador) {
                     raiz=siguienteJugador.getSiguiente();
                 }
                 anteriror.setSiguiente(siguienteJugador.getSiguiente());
                 return false;
             }
             anteriror=siguienteJugador;
             siguienteJugador=siguienteJugador.getSiguiente();
         }
         return false;
     }
     public String Imprimir(){
         NodoJugadores aux;
         aux=raiz;
         String temporal="";
         while (aux!=null){
             temporal+="Nombre , "+aux.getNombre()+"Edad , "+aux.getEdad();
             temporal+="\n";
             aux=aux.getSiguiente();
         }
         return temporal;
     }
}
