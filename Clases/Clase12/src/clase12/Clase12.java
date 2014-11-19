package clase12;

/**
 *
 * @author Julio César
 */
public class Clase12 {

    public static void main(String[] args) {
       NodoLista nodoLista1 = new NodoLista();
       nodoLista1.setMatricula("01");
       nodoLista1.setDueno("Efren Jimenez");
       nodoLista1.setMarca("Toyota");
       
       NodoLista nodoLista2 = new NodoLista();
       nodoLista2.setMatricula("02");
       nodoLista2.setDueno("Marito Mortadela");
       nodoLista2.setMarca("Vaca");
       
       Lista oLista= new Lista();
       oLista.Insertar(nodoLista2);
       oLista.Insertar(nodoLista2);
       
       oLista.Imprimir();
    }
    
}
