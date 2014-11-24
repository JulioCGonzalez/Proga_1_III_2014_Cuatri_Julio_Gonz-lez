package Main;

import Listas.ListaRenta;
import Listas.ListaPelicula_Juegos;
import Nodos.NodoPelicula_Juegos;
import java.util.Scanner;

public class ProyectoListas {

    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        ListaPelicula_Juegos peliculas = new ListaPelicula_Juegos();
        ListaRenta juegos = new ListaRenta();
        char continuar = ' ';
        do {
            System.out.println("Bienvenido a Game y Video Club UTN");
            System.out.println("Digite la opción");
            System.out.println("1.Consultas");
            System.out.println("2.Reportes");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:

                    do {
                        System.out.println("Digite las opciones de consulta");
                        System.out.println("1.Consultar el inventario de una película o juego.");
                        System.out.println("2.Consultar el nombre de la película o juego más rentado-comprado.");
                        System.out.println("3.Consultar el nombre de la película o juego menos rentado-comprado.");
                        System.out.println("4.Salir de consultas");
                        opcion = teclado.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("El invetario de peliculas que traemos en total son unas 100 peliculas para rentar y vender");
                                System.out.println("Y en el invetario de juegos traemos solo son de la consola de play station 4 con una cantidad de 125 en el momento");
                                break;
                            case 2:
                                System.out.println("Las peliculas mas rentados son ");
                                
                        }
                        
                    } while (opcion!=4);

            }
            System.out.println("\n");
            System.out.println("¿Desea continuar ?");
            continuar = teclado.next().charAt(0);
        } while ((continuar == 's') || (continuar == 'S'));

    }

}
