package Listas;

import Nodos.NodoRenta;

public class ListaRenta {

    NodoRenta raiz;

    public void Insertar(NodoRenta usuario) {
        NodoRenta nuevo;
        nuevo = new NodoRenta();
        nuevo.setNombre(usuario.getNombre());
        nuevo.setNumerosocio(usuario.getNumerosocio());
        nuevo.setRenta(usuario.getRenta());
        nuevo.setIdrenta(usuario.getIdrenta());

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoRenta auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public boolean Eliminar(int socio) {
        NodoRenta siguienteUsario = raiz;
        NodoRenta anteriror = siguienteUsario;
        if (siguienteUsario == null) {
            System.out.println("La lista está vacía");
            return true;
        }
        while (siguienteUsario != null) {
            if (siguienteUsario.getNumerosocio(equals(socio))) {
                if (raiz == siguienteUsario) {
                    raiz = siguienteUsario.getSiguiente();
                }
                anteriror.setSiguiente(siguienteUsario.getSiguiente());
                return false;
            }
            anteriror = siguienteUsario;
            siguienteUsario = siguienteUsario.getSiguiente();
        }
        return false;
    }

    public String ImprimirMayor() {
        NodoRenta aux;
        aux = raiz;
        String temporal = "";
         while (aux != null) {
                if (aux.getRenta() >= 50)
                temporal +=  "Nombre:  " + aux.getNombre();
                temporal += "\n";
                aux = aux.getSiguiente();
            }
            
        return temporal;
        }
    
    public String ImprimirMenor() {
        NodoRenta aux;
        aux = raiz;
        String temporal = "";
         while (aux != null) {
                if (aux.getRenta() <= 50)
                temporal += "Nombre:  " + aux.getNombre();
                temporal += "\n";
                aux = aux.getSiguiente();
            }
            
        return temporal;
        }
    }

//    public String ImprimirRenta() {
//        NodoRenta aux;
//        aux = raiz;
//        String temporal = "";
//        if (aux.getRenta() >= 50) {
//            while (aux != null) {
//                temporal += "Numero de socio:  " + aux.getNumerosocio() + "Peliculas: " + aux.getPelicula()
//                        + "Juegos: " + aux.getJuego() + "Id Renta: " + aux.getIdrenta();
//                temporal += "\n";
//                aux = aux.getSiguiente();
//            }
//        }
//        return temporal;
//    }

