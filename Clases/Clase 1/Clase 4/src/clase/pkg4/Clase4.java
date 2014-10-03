/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.pkg4;

import java.util.Scanner;

/**
 *
 * @author Julio César
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        double A;
        char C;
        int x , y;
        double n , m;
        double Nn;
        int a, b, c , d;
        int aA;
        
        Problemas problemas = new Problemas();
        Problema1 oProblema1 = new Problema1();
        Problema2 oProblema2 = new Problema2();
       
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el número N, A, x , y , n , m, Nn , a, b, c, d, aA");

        N = teclado.nextInt();
        A = teclado.nextDouble();
        x = teclado.nextInt();
        y = teclado.nextInt();
        n = teclado.nextDouble();
        m = teclado.nextDouble();
        Nn = teclado.nextDouble();
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        aA = teclado.nextInt();
        
        if((A%2==0))
         {
          System.out.println("A es PAR" + "\n" );
        } else
        {
          System.out.println("A es IMPAR" + "\n" );
        }
        
        if((b%2==0))
         {
          System.out.println("b es positivo" + "\n" );
        } else
        {
          System.out.println("b es negativo" + "\n" );
        }
        
        if((c%2==0))
         {
          System.out.println("c es PAR" + "\n" );
        } else
        {
          System.out.println("c es IMPAR" + "\n" );
        }
        
        if((c%2==0))
         {
          System.out.println("c es positivo" + "\n" );
        } else
        {
          System.out.println("c es negativo" + "\n" );
        }
        
        System.out.println("La suma de A y N es  " + problemas.Suma(N, A));

        System.out.println("La diferencia de A y N es " + problemas.Resta(N, A));

        System.out.println("La multipicación es " + oProblema1.multi(x, y, n, m));
        
        System.out.println("La división es " + oProblema1.divi(x, y, n, m));
        
        System.out.println("El total de Nn es " + oProblema2.total(Nn) );
        
        System.out.println(b +"=" +c +"  "+ c +"="+ a +" " + a +"="+ d +"  "+ d+ "=" +b);
    }

}
        
    
    

