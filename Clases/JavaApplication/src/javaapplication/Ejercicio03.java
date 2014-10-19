package javaapplication;

import java.util.Scanner;

public class Ejercicio03 {
private Scanner teclado;
    private int[][] matriz;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        matriz=new int[filas][columnas];
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print("Ingrese componente:");
                matriz[f][c]=teclado.nextInt();
            }
        }
    }
        
    public void imprimirMayor() {
    	int mayor=matriz[0][0];
    	int filamay=0;
    	int columnamay=0;
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                if (matriz[f][c]>mayor) {
                    mayor=matriz[f][c];
                    filamay=f;
                    columnamay=c;
                }
            }
        }
        System.out.println("El elemento mayor es:"+mayor);
        System.out.println("Se encuentra en la fila:"+filamay+ " y en la columna: "+columnamay);
    }
}
