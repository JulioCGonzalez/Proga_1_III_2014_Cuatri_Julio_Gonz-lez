package gameproyect;

import java.util.Scanner;

public class Games {

    Scanner teclado = new Scanner(System.in);
    private String[][] matriz;

    public void CrearMatriz() {
        matriz = new String[6][7];

    }

    public void cargar() {

        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 7; c++) {
                matriz[f][c] = "|";
            }
        }
    }

    public void colocar(int posF, int posC) {
        
        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 7; c++) {
          
                if(f==posF && c==posC){
                
                 matriz[f][c] = teclado.nextLine();
                break;
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

}
