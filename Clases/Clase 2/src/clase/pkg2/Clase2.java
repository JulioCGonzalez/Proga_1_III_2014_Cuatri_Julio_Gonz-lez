
package clase.pkg2;

import java.util.Scanner;

public class Clase2 {

    public static void main(String[] args) {
        
        boolean validar = true;
        int opcion;
        char continuar;
        double monto;
        
        CuentaBancaria oCuentaBancaria = new CuentaBancaria();
        Scanner teclado = new Scanner(System.in);
        while (validar)
        {
            System.out.println("Digite 1 si quiere realizar un depósito y 2 si quiere realizar un retiro");
            teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            
            if (opcion==1)
            {
                System.out.println("Digite el monto a depósito");
                monto = teclado.nextDouble();
                oCuentaBancaria.Deposito(monto);
            }
            if (opcion==2)
            {
                System.out.println("Digite el monto a retirar");
                teclado = new Scanner(System.in);
                monto= teclado.nextDouble();
                oCuentaBancaria.Retiro(monto);
                if (oCuentaBancaria.isHayError())
                {
                    System.out.println("El monto que usted va a retirar no puede ser retirada");
                }
            }
            System.out.println("El saldo final es de" + oCuentaBancaria.getSaldoInicial());
            System.out.println("Desea continuar con otra transacción S/N");
            teclado = new Scanner(System.in);
            continuar = teclado.nextLine().charAt(0);
            if ((continuar=='S') ||(continuar=='s'))
            {
                validar=true;
            }
            if  ((continuar=='N') ||(continuar=='n'))
                validar=false;
        }
    }
    
}
