package tarealistas;

import java.util.Scanner;

public class TareaListas {

    public static void main(String[] args) {
        Scanner oScanner = new Scanner(System.in);

        NodosDeNumeros nodoDelista1 = new NodosDeNumeros();
        System.out.println("Digite el numero");
        nodoDelista1.setNumero(oScanner.nextInt());

        System.out.println("El número es");
        ListaDeNumeros oListaDeNumeros = new ListaDeNumeros();
        oListaDeNumeros.Insertar(nodoDelista1);
        oListaDeNumeros.Imprimir(nodoDelista1);

        System.out.println("¿El número sera par?");
        ListaPar oListaPar = new ListaPar();
        oListaPar.Insertar(nodoDelista1);
        oListaDeNumeros.Imprimir(nodoDelista1);

        System.out.println("¿El número sera impar?");
        ListaImpar oListaImpar = new ListaImpar();
        oListaImpar.Insertar(nodoDelista1);
        oListaImpar.Imprimir(nodoDelista1);

        System.out.println("El número random es");
        ListaRandom oListaRandom = new ListaRandom();
        oListaRandom.Insertar(nodoDelista1);
        oListaRandom.Imprimir(nodoDelista1);

        System.out.println("¿Si el número es negativo imprimira 0 sera?");
        Lista0 oLista0 = new Lista0();
        oLista0.Insertar(nodoDelista1);
        oLista0.Imprimir(nodoDelista1);

    }
}
