package examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Examen {

    public static void main(String[] args) throws IOException {
        // El menu que se va a utilizar para los dos ejercicios.
        int opcion;
        char continuar = ' ';
        String palabra = " ";
        int monto = 0;

        Scanner oScanner = new Scanner(System.in);

         //Declaraciones y instanciaciones
        String textoOriginal;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //creamos la instancia
        Ejercicio1 crip1 = new Ejercicio1();
        //pedimos "n" y se la seteamos a la clase
        crip1.setN(Integer.parseInt(JOptionPane.showInputDialog("Diginte n:")));
        //llenamos el banco con letras de la 'a' a la 'z' y numeros del '0' al '9'
        crip1.llenarBanco();
        //le pedimos al usuario que dijite el texto
        System.out.println("Dijite el texto: ");
        textoOriginal =  reader.readLine();
        System.out.println("El texto original es: " + textoOriginal);
        //lo encriptamos
        crip1.encriptar(textoOriginal);
        //imprimimos el texto encriptado
         System.out.println("El texto encriptado es: " + crip1.getTextoCript());

        System.out.println("Digite el monto ");
        monto = oScanner.nextInt();
        //Instancia para oScanner
        oScanner = new Scanner(System.in);
        //La instacia para el segundo ejercicio
        Ejercicio2 oEjercicio2 = new Ejercicio2(monto);
        //La impresion de ello
        System.out.println(oEjercicio2.Desglosar());

    }

}
