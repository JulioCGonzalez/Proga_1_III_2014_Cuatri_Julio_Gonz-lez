package utn_game_c;

import java.util.Scanner;

public class GAME {

    Scanner teclado = new Scanner(System.in);

    private int[][] matriz;
    int[] fila = new int[6];
    private int[] columna;

    public void CrearMatriz() {
        matriz = new int[6][7];

    }

    public void colocarFicha2(int pocisionF, int pocisionC) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (i == pocisionF && j == pocisionC) {

                    matriz[i][j] = teclado.nextInt();

                }

            }

        }

    }

    public void imprimir() {

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }

    }

    /*/
    
    

     public void imprimir() {
        
        
     for (int f = 0; f < matriz.length; f++) {
     for (int c = 0; c < matriz[f].length; c++) {
     System.out.print(matriz[f][c]+" ");
     }
     System.out.println();
     }
        
     }
    
     
     public String rendirse(int rendirse) {
     String rendido1 = "El jugaendido";
     String rendido2 = "El jugador número 2 se hdor número 1 se ha ra rendido";

     String numeroIncorrecto = "Has selecionado un número incorrecto";

     if (rendirse == 1) {
     return rendido1;
     }
     if (rendirse == 2) {
     return rendido2;
     } else {
     return numeroIncorrecto;
     }
     }
    
     /*/
}
