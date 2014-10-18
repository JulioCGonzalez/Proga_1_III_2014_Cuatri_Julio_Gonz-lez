/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

import java.util.Scanner;

/**
 *
 * @author Julio César
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Operaciones Ope = new Operaciones();
        int opt;
        double valor1, valor2;
        char continuar = 's';

        do {
            System.out.println("Digite las opciones: \n"
                    + "1.Suma de valores \n"
                    + "2.Resta de valores \n"
                    + "3.División de valores \n"
                    + "4.Multiplicación de los valores \n"
                    + "5.Raíz del valor \n"
                    + "6.Potencia del valor \n");
            opt = teclado.nextInt();

            switch (opt) {

                case 1:
                    System.out.println("Ingrese el primer valor");
                    valor1 = teclado.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    valor2 = teclado.nextDouble();
                    System.out.println("La suma de los valores es " + Ope.Sumar(valor1, valor2));
                    break;
                case 2:
                    System.out.println("Ingrese el primer valor");
                    valor1 = teclado.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    valor2 = teclado.nextDouble();
                    System.out.println("La resta de los valores es " + Ope.Resta(valor1, valor2));
                    break;
                case 3:
                    System.out.println("Ingrese el primer valor");
                    valor1 = teclado.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    valor2 = teclado.nextDouble();
                    System.out.println("La división de los valores es " + Ope.Division(valor1, valor2));
                    break;
                case 4:
                    System.out.println("Ingrese el primer valor");
                    valor1 = teclado.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    valor2 = teclado.nextDouble();
                    System.out.println("La multiplicación de los valores es " + Ope.Mutiplicacion(valor1, valor2));
                    break;
                case 5:
                    System.out.println("Ingrese el valor");
                    valor1 = teclado.nextDouble();
                    System.out.println("La raíz del valor es " + Ope.Raiz(valor1));
                    break;
                case 6:
                    System.out.println("Ingrese el primer valor");
                    valor1 = teclado.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    valor2 = teclado.nextDouble();
                    System.out.println("La potencia del valor es " + Ope.Pontecia(valor1, valor2));
                    break;
                default:
                    System.out.println("Error de opción");
            }
            System.out.println("Desea continuar");
            continuar = teclado.next().charAt(0);
        } while ((continuar == 's') || (continuar == 'S'));
    }

}
