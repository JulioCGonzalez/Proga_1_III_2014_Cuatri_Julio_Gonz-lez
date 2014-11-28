package practicalistas;

import java.util.Scanner;

public class PracticaListas {
    public static void main(String[] args) {
        Lista oLista = new Lista();
        Nodo nodoNumero;
        Scanner oScanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            nodoNumero = new Nodo();
            System.out.println("Digite un numero del 1 al 10");
            nodoNumero.setNumero(oScanner.nextInt());
            oLista.Insertar(nodoNumero);
        }
        System.out.println(oLista.ContadordeNumeros());
    }
    
}
