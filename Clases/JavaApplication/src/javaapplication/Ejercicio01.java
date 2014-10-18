/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Julio César
 */
public class Ejercicio01 {

    private Scanner teclado;
    private int[][] matriz;

    public void cargar() {
        teclado = new Scanner(System.in);
        System.out.println("Digite el numero de filas");
        int filas = teclado.nextInt();
        System.out.println("Digite el numero de columnas");
        int columnas = teclado.nextInt();
        matriz = new int[filas][columnas];
        
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matriz[f][c] = teclado.nextInt();
            }
        }
    }

    public void intercambiar() {
        for (int c = 0; c < matriz[0].length; c++) {
            int auxiliar = matriz[0][c];
            matriz[0][c]=matriz[1][c];
            matriz[1][c]=auxiliar;
        }
    }

    public void imprimir() {
        
        
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
        
    }

}
