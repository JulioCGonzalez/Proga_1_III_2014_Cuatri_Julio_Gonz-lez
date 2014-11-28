package Main;

import Listas.ListaInventario;
import Listas.ListaRenta;
import Listas.ListaPelicula_Juegos;
import Listas.ListaUsarios;
import Listas.ListaVentas;
import Nodos.NodoInventario;
import Nodos.NodoPelicula_Juegos;
import Nodos.NodoRenta;
import Nodos.NodoUsuarios;
import Nodos.NodoVenta;
import java.util.Scanner;

public class ProyectoListas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaInventario inventario = new ListaInventario();
        ListaUsarios usarios = new ListaUsarios();
        ListaVentas ventas = new ListaVentas();
        ListaPelicula_Juegos pj = new ListaPelicula_Juegos();
        ListaRenta r = new ListaRenta();
        //Nombres
        //Peliculas
//        NodoPelicula_Juegos oPelicula1 = new NodoPelicula_Juegos();
//        oPelicula1.setNombre("X-Men Días del futuro pasado ");
//
//        NodoPelicula_Juegos oPelicula2 = new NodoPelicula_Juegos();
//        oPelicula2.setNombre("Juntos y revueltos ");
//
//        NodoPelicula_Juegos oPelicula3 = new NodoPelicula_Juegos();
//        oPelicula3.setNombre("El Hobbit 3 There and Back Again ");
//
//        NodoPelicula_Juegos oPelicula4 = new NodoPelicula_Juegos();
//        oPelicula4.setNombre("Bajo la misma estrella");
//
//        NodoPelicula_Juegos oPelicula5 = new NodoPelicula_Juegos();
//        oPelicula5.setNombre("Maléfica ");
//
//        NodoPelicula_Juegos oPelicula6 = new NodoPelicula_Juegos();
//        oPelicula6.setNombre("Malditos vecinos");
//        
//        NodoPelicula_Juegos oPelicula7 = new NodoPelicula_Juegos();
//        oPelicula7.setNombre("300 El origen de un imperio");
//        
//        NodoPelicula_Juegos oPelicula8 = new NodoPelicula_Juegos();
//        oPelicula8.setNombre("Resident Evil 6 ");
//        
//        NodoPelicula_Juegos oPelicula9 = new NodoPelicula_Juegos();
//        oPelicula9.setNombre("Amigos de más");
//        
//        NodoPelicula_Juegos oPelicula10 = new NodoPelicula_Juegos();
//        oPelicula10.setNombre("Cómo entrenar a tu dragón 2");
//        
//        
//        //Juegos
//        NodoPelicula_Juegos oJuegos1 = new NodoPelicula_Juegos();
//        oJuegos1.setNombre("Grand Theft Auto V ");
//
//        NodoPelicula_Juegos oJuegos2 = new NodoPelicula_Juegos();
//        oJuegos2.setNombre("Assassin's Creed Unity ");
//
//        NodoPelicula_Juegos oJuegos3 = new NodoPelicula_Juegos();
//        oJuegos3.setNombre("Far Cry 4 ");
//
//        NodoPelicula_Juegos oJuegos4 = new NodoPelicula_Juegos();
//        oJuegos4.setNombre("The Evil Within ");
//
//        NodoPelicula_Juegos oJuegos5 = new NodoPelicula_Juegos();
//        oJuegos5.setNombre("Final Fantasy XV ");
//        //Renta de pelicualas
//
//        NodoRenta oRenta1 = new NodoRenta();
//        oRenta1.setNombre("X-Men Días del futuro pasado ");
//        oRenta1.setRenta(67);
//
//        NodoRenta oRenta2 = new NodoRenta();
//        oRenta2.setNombre("Juntos y revueltos ");
//        oRenta2.setRenta(78);
//
//        NodoRenta oRenta3 = new NodoRenta();
//        oRenta3.setNombre("El Hobbit 3 There and Back Again ");
//        oRenta3.setRenta(89);
//
//        NodoRenta oRenta4 = new NodoRenta();
//        oRenta4.setNombre("Bajo la misma estrella");
//        oRenta4.setRenta(12);
//
//        NodoRenta oRenta5 = new NodoRenta();
//        oRenta5.setNombre("Maléfica ");
//        oRenta5.setRenta(34);
//        
//        NodoRenta oRenta6 = new NodoRenta();
//        oRenta6.setNombre("Malditos vecinos");
//        oRenta6.setRenta(78);
//
//        NodoRenta oRenta7 = new NodoRenta();
//        oRenta7.setNombre("300 El origen de un imperio");
//        oRenta7.setRenta(34);
//        
//        NodoRenta oRenta8 = new NodoRenta();
//        oRenta8.setNombre("Resident Evil 6");
//        oRenta8.setRenta(28);
//        
//        NodoRenta oRenta9 = new NodoRenta();
//        oRenta9.setNombre("Amigos de más");
//        oRenta9.setRenta(45);
//        
//        NodoRenta oRenta10 = new NodoRenta();
//        oRenta6.setNombre("Cómo entrenar a tu dragón 2");
//        oRenta6.setRenta(78);
//        
//        //Juegos de renta
//        NodoRenta oRenta11 = new NodoRenta();
//        oRenta11.setNombre("Grand Theft Auto V ");
//        oRenta11.setRenta(34);
//
//        NodoRenta oRenta12 = new NodoRenta();
//        oRenta12.setNombre("Assassin's Creed Unity ");
//        oRenta12.setRenta(23);
//
//        NodoRenta oRenta13 = new NodoRenta();
//        oRenta13.setNombre("Far Cry 4 ");
//        oRenta13.setRenta(87);
//
//        NodoRenta oRenta14 = new NodoRenta();
//        oRenta14.setNombre("The Evil Within ");
//        oRenta14.setRenta(89);
//
//        NodoRenta oRenta15 = new NodoRenta();
//        oRenta15.setNombre("Final Fantasy XV ");
//        oRenta15.setRenta(109);
//      //Para la venta de los usarios.
//        NodoVenta nodoVenta = new NodoVenta();
//        nodoVenta.setNumerosocio(45);
//        nodoVenta.setComprador("Juan Martinez");
//        nodoVenta.setTotal(13000);
//        nodoVenta.setJuegos("Far Cry 4");
//
//        NodoVenta nodoVenta1 = new NodoVenta();
//        nodoVenta1.setNumerosocio(32);
//        nodoVenta1.setComprador("Veronica Arce");
//        nodoVenta1.setTotal(6500);
//        nodoVenta1.setPeliculas("Forrest Gump (1994)");
//
//        NodoVenta nodoVenta2 = new NodoVenta();
//        nodoVenta2.setNumerosocio(89);
//        nodoVenta2.setComprador("Misael González");
//        nodoVenta2.setTotal(4600);
//        nodoVenta2.setPeliculas("El Padrino (1972)");
//
//        NodoVenta nodoVenta3 = new NodoVenta();
//        nodoVenta3.setNumerosocio(57);
//        nodoVenta3.setComprador("Diana Rojas");
//        nodoVenta3.setTotal(15000);
//        nodoVenta3.setJuegos("Final Fantasy XV");
//        
//        //Invetario en peliculas.
//        NodoInventario nodoInventario1 = new NodoInventario();
//        nodoInventario1.setId(29875634);
//        nodoInventario1.setCantidad(28);
//        nodoInventario1.setCostodecompra(15600);
//        nodoInventario1.setPeliculas("X-Men Días del futuro pasado");
//
//        NodoInventario nodoInventario2 = new NodoInventario();
//        nodoInventario2.setId(29567845);
//        nodoInventario2.setCantidad(7);
//        nodoInventario2.setCostodecompra(1500);
//        nodoInventario2.setPeliculas("Juntos y revueltos ");
//        
//        NodoInventario nodoInventario3 = new NodoInventario();
//        nodoInventario3.setId(295478);
//        nodoInventario3.setCantidad(15);
//        nodoInventario3.setCostodecompra(10000);
//        nodoInventario3.setPeliculas("El Hobbit 3 There and Back Again ");
//
//        NodoInventario nodoInventario4 = new NodoInventario();
//        nodoInventario4.setId(257869);
//        nodoInventario4.setCantidad(23);
//        nodoInventario4.setCostodecompra(12000);
//        nodoInventario4.setPeliculas("Bajo la misma estrella");
//        
//        NodoInventario nodoInventario5 = new NodoInventario();
//        nodoInventario5.setId(23549);
//        nodoInventario5.setCantidad(27);
//        nodoInventario5.setCostodecompra(13000);
//        nodoInventario5.setPeliculas("Maléfica");
//        
//        NodoInventario nodoInventario6 = new NodoInventario();
//        nodoInventario6.setId(294678);
//        nodoInventario6.setCantidad(12);
//        nodoInventario6.setCostodecompra(10000);
//        nodoInventario6.setPeliculas("El Hobbit 3 There and Back Again ");
//        
//        NodoInventario nodoInventario3 = new NodoInventario();
//        nodoInventario3.setId(295478);
//        nodoInventario3.setCantidad(15);
//        nodoInventario3.setCostodecompra(10000);
//        nodoInventario3.setPeliculas("El Hobbit 3 There and Back Again ");
//        
//        NodoInventario nodoInventario3 = new NodoInventario();
//        nodoInventario3.setId(295478);
//        nodoInventario3.setCantidad(15);
//        nodoInventario3.setCostodecompra(10000);
//        nodoInventario3.setPeliculas("El Hobbit 3 There and Back Again ");
//        
//        NodoInventario nodoInventario3 = new NodoInventario();
//        nodoInventario3.setId(295478);
//        nodoInventario3.setCantidad(15);
//        nodoInventario3.setCostodecompra(10000);
//        nodoInventario3.setPeliculas("El Hobbit 3 There and Back Again ");
//        
//        NodoInventario nodoInventario3 = new NodoInventario();
//        nodoInventario3.setId(295478);
//        nodoInventario3.setCantidad(15);
//        nodoInventario3.setCostodecompra(10000);
//        nodoInventario3.setPeliculas("El Hobbit 3 There and Back Again ");
//        
        int opcion;
        char continuar = ' ';
        do {
            System.out.println("Bienvenido a Game y Video Club UTN");
            System.out.println("Digite la opción");
            System.out.println("1.Insercion y actualizacion de información");
            System.out.println("2.Consultas");
            System.out.println("2.Reportes");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Digite las opciones de consulta");
                    System.out.println("1.Consultar el inventario de una película o juego.");
                    System.out.println("2.Consultar el nombre de la película o juego más rentado-comprado o menos rentado o vendido.");
                    opcion = teclado.nextInt();
            }

            switch (opcion) {
                case 2:

                    System.out.println("Digite las opciones de consulta");
                    System.out.println("1.Consultar el inventario de una película o juego.");
                    System.out.println("2.Consultar el nombre de la película o juego más rentado-comprado o menos rentado o vendido.");
                    opcion = teclado.nextInt();
                    switch (opcion) {

                        case 1:
                            System.out.println("1.Invetario de las peliculas");
                            System.out.println("2.Inventario de los juegos");
                            opcion = teclado.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.println("Las peliculas que tenemos en inventario son: ");
                                    pj.Insertar(oPelicula1);
                                    pj.Insertar(oPelicula2);
                                    pj.Insertar(oPelicula3);
                                    pj.Insertar(oPelicula4);
                                    pj.Insertar(oPelicula5);
                                    System.out.println(pj.ImprimirNombre());
                                    break;
                                case 2:
                                    System.out.println("Los juegos que tenemos son:");
                                    pj.Insertar(oJuegos1);
                                    pj.Insertar(oJuegos2);
                                    pj.Insertar(oJuegos3);
                                    pj.Insertar(oJuegos4);
                                    pj.Insertar(oJuegos5);
                                    System.out.println(pj.ImprimirNombre());
                                    break;
                            }
                        case 2:
                            System.out.println("1.Pelicualas y Juegos mas rentados y vendidos");
                            System.out.println("2.Pelicualas y Juegos menos rentados y vendidos");
                            opcion = teclado.nextInt();
                            switch (opcion) {
                                case 1:
                                    r.Insertar(oRenta1);
                                    r.Insertar(oRenta2);
                                    r.Insertar(oRenta3);
                                    r.Insertar(oRenta6);
                                    r.Insertar(oRenta10);
                                    System.out.println("Las pelicuals y juegos mas rentados y vendido son:" + r.ImprimirMayor());
                                    break;
                                case 2:
                                    r.Insertar(oRenta4);
                                    r.Insertar(oRenta5);
                                    r.Insertar(oRenta6);
                                    r.Insertar(oRenta7);
                                    r.Insertar(oRenta8);
                                    r.Insertar(oRenta9);
                                    System.out.println("Las pelicuals y juegos menos rentados y vendido son:" + r.ImprimirMenor());
                                    break;
                            }
                    }
                case 3:
                    System.out.println("1.Listar los usuarios con todos sus compras realizadas");
                    System.out.println("2.Listar todo el inventario de películas-juegos");
                    System.out.println("3.Listar todas las películas por género.");
                    System.out.println("4.Listar las compras de una fecha");
                    System.out.println("5.Listar todas las películas-juegos con rentas activas.");
                    opcion = teclado.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("1.Compradores de peliculas");
                            System.out.println("2.Compradores de juegos");
                            opcion = teclado.nextInt();
                            switch (opcion) {
                                case 1:
                                    ventas.Insertar(nodoVenta1);
                                    ventas.Insertar(nodoVenta2);
                                    System.out.println(ventas.ImprimirPelicula());
                                    break;
                                case 2:
                                    ventas.Insertar(nodoVenta);
                                    ventas.Insertar(nodoVenta3);
                                    System.out.println(ventas.ImprimirJuego());
                                    break;
                            }
                        case 2:
                            System.out.println("1.Inventario de peliculas");
                            System.out.println("2.Inventario de juegos");
                            opcion = teclado.nextInt();
                            switch (opcion) {
                                case 1:
                                    inventario.Insertar(nodoInventario1);
                                    inventario.Insertar(nodoInventario3);
                                    System.out.println(inventario.ImprimirPeliculas());
                                    break;
                                case 2:
                                    inventario.Insertar(nodoInventario2);
                                    System.out.println(inventario.ImprimirJuegos());
                            }
                    }
            }

            // }while (true); 
            //}
            System.out.println("\n");
            System.out.println("¿Desea continuar ?");
            continuar = teclado.next().charAt(0);
        } while ((continuar == 's') || (continuar == 'S'));

        //}
    }
}
