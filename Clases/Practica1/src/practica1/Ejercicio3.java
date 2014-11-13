/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Julio César
 */
public class Ejercicio3 {
    public String EliminarEspacios(String palabras){
        String temporal="";
        int contador=0;
        for (int i = palabras.length()-1; i >= 0; i--) {
            if (palabras.charAt(i)!=' ') {
                temporal+=palabras.charAt(i);
            }else{
                contador++;
            }
        }
        return "La palabra final es"+temporal+"Y la cantidad de espacios eliminados son"+contador;
    }
}
