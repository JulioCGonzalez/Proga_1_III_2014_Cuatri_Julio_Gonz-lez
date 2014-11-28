package Listas;

import Nodos.NodoVenta;

public class ListaVentas {
NodoVenta raiz;
    

    public void Insertar(NodoVenta usuario) {
        NodoVenta nuevo;
        nuevo = new NodoVenta();
        nuevo.setNumerosocio(usuario.getNumerosocio());
        nuevo.setComprador(usuario.getComprador());
        nuevo.setTotal(usuario.getTotal());
        nuevo.setPeliculas(usuario.getPeliculas());
        nuevo.setJuegos(usuario.getJuegos());
        
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoVenta auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public boolean Eliminar(int costo) {
        NodoVenta siguienteUsuario = raiz;
        NodoVenta anteriror = siguienteUsuario;
        if (siguienteUsuario == null) {
            System.out.println("La lista está vacía");
            return true;
        }
        while (siguienteUsuario != null) {
            int temp = siguienteUsuario.getNumerosocio();
            if (temp == costo) {
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

    public String ImprimirPelicula() {
        NodoVenta aux;
        aux = raiz;
        String temporal = "";
        while (aux != null) {
            if(aux.getTotal()>0)
                temporal += "Numero socio: "+ aux.getNumerosocio() + "Comprador: " + aux.getComprador()
                        +"Total: " + aux.getTotal()+ "Peliculas: " + aux.getPeliculas();
                temporal += "\n";
                aux = aux.getSiguiente();
            }
        return temporal;
        }
    
    public String ImprimirJuego() {
        NodoVenta aux;
        aux = raiz;
        String temporal = "";
        while (aux != null) {
            if(aux.getTotal()>0)
                temporal += "Numero socio: "+ aux.getNumerosocio() + "Comprador: " + aux.getComprador()
                        +"Total: " + aux.getTotal()+ "Juegos: " + aux.getJuegos();
                temporal += "\n";
                aux = aux.getSiguiente();
            }
        return temporal;
        }     
}
