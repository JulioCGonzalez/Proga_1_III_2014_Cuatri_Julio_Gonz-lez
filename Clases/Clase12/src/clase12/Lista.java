/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

/**
 *
 * @author Julio César
 */
public class Lista {
private NodoLista raiz;

public void Insertar(NodoLista elemento){
    NodoLista nuevo;
    nuevo =new NodoLista();
    nuevo.setMatricula(elemento.getMatricula());
    nuevo.setMatricula(elemento.getMarca());
    nuevo.setMatricula(elemento.getDueno());
    
    if (raiz==null) {
        nuevo.setSiguiente(null);
        raiz=nuevo;
    }else{
        NodoLista auxiliar=raiz;
        while  (auxiliar.getSiguiente()!=null){
            auxiliar=auxiliar.getSiguiente();
        }
        auxiliar.setSiguiente(nuevo);
    }
}
public void Imprimir(){
    NodoLista recorrido=raiz;
    System.out.println("Listado de todos los elementos de la lista");
    while(recorrido!=null){
        System.out.println("La marca es:"+ recorrido.getMarca()+ "El dueño es:"+ recorrido.getDueno()+ "La matricula es:"+recorrido.getMatricula());
    recorrido=recorrido.getSiguiente();
    }
    System.out.println();
}
}
