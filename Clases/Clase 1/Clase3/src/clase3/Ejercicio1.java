/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase3;

/**
 *
 * @author Julio César
 */
public class Ejercicio1 {
    public Ejercicio1()
    {
        
    }
    String numeros = "";
    private String ImprimirNumeros(int numero)
    {
        
        for (int i = 0; i < 10; i++) {
            numeros+=getNumeros()+ i+"";
            
        }
        return getNumeros();
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }
    
}
