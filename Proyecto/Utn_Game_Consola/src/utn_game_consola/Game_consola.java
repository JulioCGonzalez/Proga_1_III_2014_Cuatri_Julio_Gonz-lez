package utn_game_consola;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Game_consola {

    public static void main(String[] args) {

        Game game = new Game();
        Scanner teclado = new Scanner(System.in);
        int menu;
        char continuar = ' ';
        String Name1 = "", Name2 = "", N1 = "X", N2 = "0", marca = "";

        int P2, O, pF, pC, player;

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("1.Seleccione el nombre del primer jugador" + "\n"
                    + "2.Seleccione el nombre del segundo jugador" + "\n"
                    + "3.Iniciar juego" + "\n"
                    + "4.Estadísticas" + "\n"
                    + "5.Salir"));
            switch (menu) {

                case 1:
                    Name1 = teclado.next();
                    break;
                case 2:
                    Name2 = teclado.next();
                    break;
                case 3:

                    System.out.println("Juego Iniciado");
                    game.CrearMatriz();
                    game.cargar();
                    game.imprimir();

                    
                    while(game.ganar()==""){
                    
                    System.out.println("Elija jugador");
                        player = teclado.nextInt();
                        if (player == 1) {
                            System.out.println("Primer jugador coloque una ficha");
                            marca = "X";
                        } else {
                            System.out.println("Segundo jugador coloque una ficha");
                            marca = "0";
                        }
                        game.colocarFicha(teclado.nextInt(), teclado.nextInt(), marca);
                        
                        game.imprimir();
                        game.ganar();
                    }
                    System.out.println("\n"+game.ganar());
                    
                    

                    break;
                case 4:

                    break;
            }
            continuar = JOptionPane.showInputDialog("¿Desea continuar?").charAt(0);
        } while ((continuar == 's') || (continuar == 'S'));

    }

}
