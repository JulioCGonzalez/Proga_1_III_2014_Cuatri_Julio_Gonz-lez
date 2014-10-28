package utn_game;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kendall
 */
public class UTN_GAME {

    public static void main(String[] args) {

        GAME juego = new GAME();

        Scanner teclado = new Scanner(System.in);
        int menu;
        char continuar = ' ';
        String X = "";
        String O = "";
        int J = 0;
        int Y = 0;
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
                    X = JOptionPane.showInputDialog("Selecciona el nombre del primer jugador");
                    break;
                case 2:
                    O = JOptionPane.showInputDialog("Selecciona el nombre del segundo jugador");
                    break;
                case 3:

                    int pF;
                    pF = Integer.parseInt(JOptionPane.showInputDialog(""));
                    
                    int pC;
                    pC = Integer.parseInt(JOptionPane.showInputDialog(""));
                    
                    int N1;
                    N1 = Integer.parseInt(JOptionPane.showInputDialog(""));
                    
                    int N2;
                    N2 = Integer.parseInt(JOptionPane.showInputDialog(""));

                    

                    juego.colocarFicha2(pF, pC, N1, N1);
                    

                    System.out.println(juego.imprimir());

                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, X);
                    JOptionPane.showMessageDialog(null, O);
                    break;
            }
            continuar = JOptionPane.showInputDialog("¿Desea continuar?").charAt(0);
        } while ((continuar == 's') || (continuar == 'S'));
    }
}
