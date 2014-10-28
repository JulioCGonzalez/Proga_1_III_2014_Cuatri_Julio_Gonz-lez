
package utn_game_c;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class UTN_GAME_C {

   
    public static void main(String[] args) {
        
        
              GAME juego = new GAME();

        Scanner teclado = new Scanner(System.in);
        int menu;
        char continuar = ' ';
        int X, O, pF, pC,N1,N2 ;
        
     
        int matriz;

        String l;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("1.Seleccione el nombre del primer jugador" + "\n"
                    + "2.Seleccione el nombre del segundo jugador" + "\n"
                    + "3.Iniciar juego" + "\n"
                    + "4.Estadísticas" + "\n"
                    + "5.Salir"));
            switch (menu) {
                case 1:
                    X = teclado.nextInt();
                    break;
                case 2:
                     X = teclado.nextInt();
                    break;
                case 3:
                    
                   pF = teclado.nextInt();
                   pC = teclado.nextInt();

                   
                    juego.colocarFicha2(pF,pC);
                    
                    juego.imprimir();
                    

             
                    


                    break;
                case 4:
                   
                    break;
            }
            continuar = JOptionPane.showInputDialog("¿Desea continuar?").charAt(0);
        } while ((continuar == 's') || (continuar == 'S'));
    }
}