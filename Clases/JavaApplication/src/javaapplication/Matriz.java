package javaapplication;

import java.util.Scanner;

public class Matriz {

    private static Object oScanner;

    public static void main(String[] args) {
        int menu = 0;
        Scanner oScanner = new Scanner(System.in);
        char continuar = ' ';
        do {
            System.out.println("Digite la opcion que desea : ");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            menu = oScanner.nextInt();
            switch (menu) {
                case 1:
                    oScanner = new Scanner(System.in);
                    Ejercicio01 oEjercicio01 = new Ejercicio01();
                    oEjercicio01.cargar();
                    oEjercicio01.intercambiar();
                    oEjercicio01.imprimir();
                    break;
                case 2:    
                    oScanner = new Scanner(System.in);
                    Ejercicio02 oEjercicio02 = new Ejercicio02();
                    oEjercicio02.cargar();
                    oEjercicio02.imprimirVertices();
                    break;
                case 3:
                    oScanner = new Scanner(System.in);
                    Ejercicio03 oEjercicio03 = new Ejercicio03();
                    oEjercicio03.cargar();
                    oEjercicio03.imprimirMayor();
                    break;
            }
            System.out.println("\n");
            System.out.println("¿Desea continuar?");
            continuar = oScanner.next().charAt(0);
        } while((continuar == 's') || (continuar == 'S'));
    }

}
