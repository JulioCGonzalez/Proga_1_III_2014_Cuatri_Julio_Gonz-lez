/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Julio César
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Problem1 p = new Problem1();
        Problem2 s = new Problem2();
        Random rnd = new Random();
        int A, opt, mes, año, x = 1;
        String letra = null, a = null, b = null, c = null, d = null, e = null;
        char continuar = 's';
        do {
            System.out.println("Digite las opciones: \n"
                    + "1.Mes \n"
                    + "2.Ingrese un valor \n"
                    + "3.Ingresar una letra \n"
                    + "4.Multiplicación de los valores \n"
                    + "5.Raíz del valor \n"
                    + "6.Potencia del valor \n");
            opt = teclado.nextInt();

            switch (opt) {

                case 1:
                    System.out.println("El número de mes");
                    A = teclado.nextInt();
                    System.out.println("El mes es " + p.Mes(opt));
                    break;
                case 2:
                    System.out.println("Ingrese el primer valor");
                    A = teclado.nextInt();
                    if (A == 2 || A == 5 || A == 8) {
                        System.out.println("El cuadrado del número es " + s.numero(A));
                    }
                    if (A == 4 || A == 7 || A == 9) {
                        System.out.println("La mutiplicación del número es " + s.numero2(A));
                    }
                    break;
                case 3:
                    System.out.println("Ingrese una letra");
                    letra = teclado.next(letra);
                    if (letra == a) {
                        System.out.println("Excelente");
                    }
                    if (letra == b) {
                        System.out.println("Bueno");
                    }
                    if (letra == c) {
                        System.out.println("Regular");
                    }
                    if (letra == d) {
                        System.out.println("Malo");
                    }
                    if (letra == e) {
                        System.out.println("Pésimo");
                    }
                    if (letra != a || letra != b || letra != c || letra != d || letra != e) {
                        System.out.println("Error letra no valida");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el año");
                    año = teclado.nextInt();
                    System.out.println("Ingrese el mes");
                    mes = teclado.nextInt();
                    if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)) && (mes == 2)) {
                        System.out.println("El año es bisiesto y tiene de 29 dìas de" + año);
                    } else {
                        System.out.println("El año no es bisiesto y tiene 28 días de " + año);
                    }
                    if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                        System.out.println("El mes tiene 30 días de " + año);
                    }
                    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                        System.out.println("El mes tiene 31 de " + año);
                    }
                    if (mes != 1 || mes != 2 || mes != 3 || mes != 4 || mes != 5 || mes != 6 || mes != 7 || mes != 8 || mes != 9 || mes != 10 || mes != 11 || mes != 12) {
                        System.out.println("Número erroneo");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el valor");
                    x = teclado.nextInt();
                    x = rnd.nextInt(3000);
                    if ((x - 1000) > 0) {
                        x -= 1000;
                        System.out.print("M");
                    } else {
                        if ((x - 100) > 0) {
                            x -= 100;
                            System.out.print("C");
                        } else {
                            if ((x - 10) > 0) {
                                x -= 10;
                                System.out.println("X");
                            }
                        }
                    }
                    break;
                
                default:
                    System.out.println("Error de opción");
            }
            System.out.println("Desea continuar");
            continuar = teclado.next().charAt(0);
        } while ((continuar == 's') || (continuar == 'S'));
    }

}

