package clase7.arrays;

import java.util.Scanner;

/**
 *
 * @author Kendall
 */
public class Clase7Arrays {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        char continuar = ' ';

        do {
            System.out.println("Digite la opción del ejercicio a evaluar");
            System.out.println("1.Primer Ejercicio ");
            System.out.println("2.Segundo Ejercicio ");
            System.out.println("3.Tecercer Ejercicio ");
            System.out.println("4.Salir ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    for (int i = 0; i < 5; i++) {

                        System.out.println("Digite el salario del trabajo # " + (i + 1));
                        ejercicio1.AgregarSalario(teclado.nextDouble());

                    }
                    System.out.println(ejercicio1.ImprimirSueldos());
                    break;
                case 2:

                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    for (int i = 0; i < 5; i++) {

                        System.out.println("Digite la altura # " + (i + 1));
                        ejercicio2.AgregarAltura(teclado.nextFloat());

                    }

                    System.out.println("El promedio es " + ejercicio2.Promedio()+"\n");
                    System.out.println("El promedio de la altura es: "+"\n"+ejercicio2.contarPersonas());
                    
                    break;
                    
                case 3:
                    
                    Ejercicio3 ejercicio3 = new Ejercicio3();
                    for (int i = 0; i < 4; i++) {
                        System.out.println("Digite el salario del trabajador de la mañana #" + (i+1));
                        ejercicio3.AgregarSalarioTarde(teclado.nextDouble());
                    }
                    for (int i = 0; i < 4; i++) {
                        System.out.println("Digite el salario del trabajador de la tarde #"+(i+1));
                        ejercicio3.AgregarSalarioTarde(teclado.nextDouble());
                        
                    }
                    System.out.println(ejercicio3.ImprimirGastos());
                    break;
            }
            System.out.println("\n");
            System.out.println("¿Desea continuar con otro ejercicio?");
            continuar = teclado.next().charAt(0);
        } while ((continuar == 's') || (continuar == 'S'));

    }

}
