package tda;

import Listas.Cola;
import Listas.Pila;
import Nodo.NodoCola;
import Nodo.NodoPila;

public class TDA {

    public static void main(String[] args) {
        Pila oPila = new Pila();
        NodoPila cuenta1 = new NodoPila();
        cuenta1.setCliente("Mario Mortadela");
        cuenta1.setCuenta("2-056456-456457-345546");
        oPila.Push(cuenta1);

        NodoPila cuenta2 = new NodoPila();
        cuenta2.setCliente("Juan Moreira");
        cuenta2.setCuenta("2-055235-4532457-467878");
        oPila.Push(cuenta2);

        NodoPila cuenta3 = new NodoPila();
        cuenta3.setCliente("Carlos Chacon");
        cuenta3.setCuenta("2-547656-454567-645646");
        oPila.Push(cuenta3);

        NodoPila cuenta4 = new NodoPila();
        cuenta4.setCliente("Ana del Valle");
        cuenta4.setCuenta("2-052556-445347-876744");
        oPila.Push(cuenta4);

        NodoPila cuenta5 = new NodoPila();
        cuenta5.setCliente("Adrian Jimenez");
        cuenta5.setCuenta("2-05464-456442-97676546");
        oPila.Push(cuenta5);

        System.out.println(oPila.Imprimir());
        oPila.Pop();
        System.out.println(oPila.Imprimir());
        oPila.Pop();
        System.out.println(oPila.Imprimir());
        oPila.Pop();
        System.out.println(oPila.Imprimir());
        oPila.Pop();
        System.out.println(oPila.Imprimir());
        oPila.Pop();

        Cola oCola = new Cola();
        NodoCola tiquete1 = new NodoCola();
        tiquete1.setCliente("Daniel Martinez");
        tiquete1.setTiquete("2-657765-445897-78890");
        oCola.Encolar(tiquete1);

        NodoCola tiquete2 = new NodoCola();
        tiquete2.setCliente("Marcos Saborio");
        tiquete2.setTiquete("2-78789-765568-35457");
        oCola.Encolar(tiquete2);

        NodoCola tiquete3 = new NodoCola();
        tiquete3.setCliente("Andrea Sandoval");
        tiquete3.setTiquete("2-67658-56457658-345546");
        oCola.Encolar(tiquete3);

        NodoCola tiquete4 = new NodoCola();
        tiquete4.setCliente("Maria Corrales");
        tiquete4.setTiquete("2-647774-45435437-309889");
        oCola.Encolar(tiquete4);

        NodoCola tiquete5 = new NodoCola();
        tiquete5.setCliente("Susana Molina");
        tiquete5.setTiquete("2-0657-45446457-4608986");
        oCola.Encolar(tiquete5);
        
        System.out.println(oCola.Imprimir());
        oCola.Desencolar();
        System.out.println(oCola.Imprimir());
        oCola.Desencolar();
        System.out.println(oCola.Imprimir());
        oCola.Desencolar();
        System.out.println(oCola.Imprimir());
        oCola.Desencolar();
        System.out.println(oCola.Imprimir());
        oCola.Desencolar();
    }

}
