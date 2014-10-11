/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgswitch;

/**
 *
 * @author Julio César
 */
public class Problem2 {
    public double numero (double n){
        double cuadrado = 0;
        String numero=String.valueOf(n);
        char ultimoNumero=numero.charAt(numero.length()-1);
        if(ultimoNumero == 2|| ultimoNumero == 5|| ultimoNumero == 8){
        cuadrado = Math.pow(n, 2);
        }
        return cuadrado;
    }
    public double numero2 (double n){
        double multiplo = 0;
        String numero=String.valueOf(n);
        char ultimoNumero=numero.charAt(numero.length()-1);
        if(ultimoNumero == 4|| ultimoNumero == 7|| ultimoNumero == 9){
        multiplo = n * 5;
        }
        return multiplo;
    }
}
