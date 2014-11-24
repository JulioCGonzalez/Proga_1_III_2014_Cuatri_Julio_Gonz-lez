/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase13;

import Listas.ListaJugadores;
import Nodos.NodoJugadores;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author Julio César
 */
public class Clase13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner oScanner = new Scanner(System.in);
        ListaJugadores ligaJugadores = new ListaJugadores();
        
        NodoJugadores nodoJugadores1 = new NodoJugadores();
        nodoJugadores1.setNombre("Armando Alonso");
        nodoJugadores1.setEdad(30);
        ligaJugadores.Insertar(nodoJugadores1);
        
        NodoJugadores nodoJugadores2 = new NodoJugadores();
        nodoJugadores2.setNombre("Alvaro Sanchez");
        nodoJugadores2.setEdad(28);
        ligaJugadores.Insertar(nodoJugadores2);
        
        NodoJugadores nodoJugadores3 = new NodoJugadores();
        nodoJugadores3.setNombre("Patrick Perbemtom");
        nodoJugadores3.setEdad(32);
        ligaJugadores.Insertar(nodoJugadores3);
        
        System.out.println(ligaJugadores.Imprimir());
    }
    
}
