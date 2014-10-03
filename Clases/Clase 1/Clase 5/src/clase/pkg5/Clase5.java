
import clase.pkg5.Operaciones;
import java.util.Scanner;


public class Clase5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Operaciones Ope = new Operaciones();
        int opt;
        double valor1 , valor2;
        char continuar = 's';
        
        do{
            System.out.println("Digite las opciones: \n"
                    + "1.Suma de valores \n"
                    + "2.Resta de valores \n"
                    + "3.División de valores \n"
                    + "4.Multiplicación de los valores \n"
                    + "5.Raíz del valor \n"
                    + "6.Potencia del valor \n"
                    + "7.Salir");
            opt=teclado.nextInt();
            
            switch(opt){
                    
                case 1:
                        valor1=teclado.nextDouble();
                        valor2=teclado.nextDouble();
                        System.out.println("La suma de los valores es " + Ope.Sumar(valor1, valor2));
                case 2: 
                        valor1=teclado.nextDouble();
                        valor2=teclado.nextDouble();
                        System.out.println("La resta de los valores es " + Ope.Resta(valor1, valor2));
                case 3:
                        valor1=teclado.nextDouble();
                        valor2=teclado.nextDouble();
                        System.out.println("La división de los valores es " +Ope.Division(valor1, valor2));
                case 4:
                        valor1=teclado.nextDouble();
                        valor2=teclado.nextDouble();
                        System.out.println("La multiplicación de los valores es " +Ope.Mutiplicacion(valor1, valor2));
                case 5:
                    valor1=teclado.nextDouble();
                    System.out.println("La raíz del valor es " + Ope.Raiz(valor1));
                case 6:
                    valor1=teclado.nextDouble();
                    valor2=teclado.nextDouble();
                    System.out.println("La potencia del valor es " + Ope.Pontecia(valor1, valor2));
            }
            System.out.println("");
            continuar = teclado.next().charAt(0);
        }while((continuar == 's')|| (continuar == 'S'));
    }
    
}
