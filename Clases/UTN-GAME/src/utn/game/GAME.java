package utn.game;

import java.util.Scanner;

public class GAME {

    private int[][] matriz;

    public void CrearMatriz() {
        matriz = new int[6][7];

    }

    public void cargar() {
        Scanner teclado = new Scanner(System.in);

        matriz = new int[6][7];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {

                matriz[f][c] = teclado.nextInt();
            }
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
