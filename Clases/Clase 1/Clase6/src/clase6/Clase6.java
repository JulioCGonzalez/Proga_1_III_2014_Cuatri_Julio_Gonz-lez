package clase6;

import java.util.Scanner;

public class Clase6 {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner oScanner = new Scanner(System.in);
        char continuar = ' ';
        do {
            System.out.println("Digite la opción que desea : ");
            System.out.println("1.Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            opcion = oScanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Digite el correo a evaluar");
                    oScanner = new Scanner(System.in);
                    Ejercicio1 oEjercicio1 = new Ejercicio1(oScanner.nextLine());
                    System.out.println(oEjercicio1.ValidarCorreo());
                    break;
                case 2:
                    System.out.println("Digite la cadena a evaluar");
                    Ejercicio2 oEjercicio2 = new Ejercicio2();
                    oScanner=new Scanner(System.in);
                    oEjercicio2.setCadena(oScanner.nextLine());
                    System.out.println(oEjercicio2.MediaCadena());
                    System.out.println(oEjercicio2.UltimoValor());
                    System.out.println(oEjercicio2.Alrevez());
                    System.out.println(oEjercicio2.Guion());
                    System.out.println(oEjercicio2.Vocales());
                    System.out.println(oEjercicio2.Palindromo());
            }
            System.out.println("\n");
            System.out.println("¿Desea continuar?");
            continuar = oScanner.next().charAt(0);
        }while((continuar == 's') || (continuar == 'S'));
    }

}
