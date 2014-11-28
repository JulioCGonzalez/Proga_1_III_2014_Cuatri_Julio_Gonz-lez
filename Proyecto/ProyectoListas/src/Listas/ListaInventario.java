package Listas;

import Nodos.NodoInventario;

public class ListaInventario {
    NodoInventario raiz;
    

    public void Insertar(NodoInventario usuario) {
        NodoInventario nuevo;
        nuevo = new NodoInventario();
        nuevo.setId(usuario.getId());
        nuevo.setCantidad(usuario.getCantidad());
        nuevo.setCostodecompra(usuario.getCostodecompra());
        nuevo.setPeliculas(usuario.getPeliculas());
        nuevo.setJuegos(usuario.getJuegos());
        
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoInventario auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public boolean Eliminar(int costo) {
        NodoInventario siguienteUsuario = raiz;
        NodoInventario anteriror = siguienteUsuario;
        if (siguienteUsuario == null) {
            System.out.println("La lista está vacía");
            return true;
        }
        while (siguienteUsuario != null) {
            if (siguienteUsuario.getCostodecompra(equals(costo))) {
                if (raiz == siguienteUsuario) {
                    raiz = siguienteUsuario.getSiguiente();
                }
                anteriror.setSiguiente(siguienteUsuario.getSiguiente());
                return false;
            }
            anteriror = siguienteUsuario;
            siguienteUsuario = siguienteUsuario.getSiguiente();
        }
        return false;
    }

    public String ImprimirPeliculas() {
        NodoInventario aux;
        aux = raiz;
        String temporal = "";
        while (aux != null) {
                temporal += "Id: "+ aux.getId() + "Cantidad: " + aux.getCantidad()
                        +"Costo de compra: " + aux.getCostodecompra()+ "Peliculas: " + aux.getPeliculas();
                temporal += "\n";
                aux = aux.getSiguiente();
            }
        return temporal;
        }
    
    public String ImprimirJuegos() {
        NodoInventario aux;
        aux = raiz;
        String temporal = "";
        while (aux != null) {
                temporal += "Id: "+ aux.getId() + "Cantidad: " + aux.getCantidad()
                        +"Costo de compra: " + aux.getCostodecompra()+ "Juegos: " + aux.getJuegos();
                temporal += "\n";
                aux = aux.getSiguiente();
            }
        return temporal;
        }
}
