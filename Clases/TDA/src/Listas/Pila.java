package Listas;

import Nodo.NodoPila;

public class Pila {

    private NodoPila raiz;

    public Pila() {
    
    }
    public void Push(NodoPila cuenta) {
        NodoPila nuevo;
        nuevo = new NodoPila();
        nuevo.setCliente(cuenta.getCliente());
        nuevo.setCuenta(cuenta.getCuenta());
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            nuevo.setSiguiente(raiz);
            raiz = nuevo;
        }
        
    }
    public NodoPila Pop(){
        if (raiz!=null) {
            NodoPila cuenta= raiz;
            raiz=raiz.getSiguiente();
        return cuenta;
        }else{
            return null;
        }
    }
    public String Imprimir(){
        String impresion="";
        NodoPila recorrido= raiz;
        while(recorrido!=null){
            impresion+="Cliente: "+recorrido.getCliente()+ "Cuenta: "+recorrido.getCuenta();
            impresion+="\n";
            recorrido=recorrido.getSiguiente();
        }
        return impresion;
    }
}
