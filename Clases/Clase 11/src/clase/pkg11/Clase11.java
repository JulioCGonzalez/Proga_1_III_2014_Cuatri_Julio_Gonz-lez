package clase.pkg11;

import java.util.Scanner;

public class Clase11 {

    public static void main(String[] args) {
        // Algoritmo de ordenamiento
        Lineal oLineal = new Lineal();
        Binario oBinario = new Binario();
        Scanner teclado = new Scanner(System.in);
        int []arreglo={1,2,3,4,5,6,7,8,9};
        System.out.println("Agregar elemento");
        int elemento=teclado.nextInt();
        System.out.println("El index de lineal:"+oLineal.BusquedaLineal(arreglo, elemento));
        System.out.println("el index de binario:"+oBinario.BusquedaBinaria(arreglo, elemento));
    }
    
}
