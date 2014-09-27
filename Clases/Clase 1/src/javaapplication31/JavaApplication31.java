/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication31;

import java.util.Scanner;

/**
 *
 * @author Julio César
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Información básica.
        double horasTrabajadas = 0, costoHora = 0,salario = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digíte las horas laboradas por el trabajor" + "\n");
        horasTrabajadas = Double.parseDouble(teclado.nextLine());
        System.out.println("Digíte el costo por hora" + "\n");
        costoHora = Double.parseDouble(teclado.nextLine());
        salario = horasTrabajadas*costoHora;
        System.out.println("El salario final es" + salario);
    }
    
}
