package Listas;

import Nodos.NodoPelicula_Juegos;

public class ListaPelicula_Juegos {

    NodoPelicula_Juegos raiz;

    public void Insertar(NodoPelicula_Juegos usuario) {
        NodoPelicula_Juegos nuevo;
        nuevo = new NodoPelicula_Juegos();
        nuevo.setId(usuario.getId());
        nuevo.setNombre(usuario.getNombre());
        nuevo.setTipo(usuario.getTipo());
        nuevo.setCosto(usuario.getCosto());
        nuevo.setFechaentrega(usuario.getFechaentrega());
        nuevo.setFecherecepcion(usuario.getFecherecepcion());
        nuevo.setGenero(usuario.getGenero());
        
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoPelicula_Juegos auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public boolean Eliminar(String nombre) {
        NodoPelicula_Juegos siguienteUsario = raiz;
        NodoPelicula_Juegos anteriror = siguienteUsario;
        if (siguienteUsario == null) {
            System.out.println("La lista está vacía");
            return true;
        }
        while (siguienteUsario != null) {
            if (siguienteUsario.getNombre().equals(nombre)) {
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

     public String ImprimirNombre() {
        NodoPelicula_Juegos aux;
        aux = raiz;
        String temporal = "";
        while (aux != null) {
            temporal += "Nombre: " + aux.getNombre();
            temporal += "\n";
            aux = aux.getSiguiente();
        }

        return temporal;
    }
    
    public String Imprimir() {
        NodoPelicula_Juegos aux;
        aux = raiz;
        String temporal = "";
        while (aux != null) {
            temporal += "Id: " + aux.getId() +"Nombre: " + aux.getNombre()+ "Tipo: " + aux.getTipo()
                    +"Costo: "+ aux.getCosto() + "Fecha de Entrega: " + aux.getFechaentrega() 
                    + "Fecha de recepcion: " + aux.getFecherecepcion() + "Genero: " + aux.getGenero();
            temporal += "\n";
            aux = aux.getSiguiente();
        }

        return temporal;
    }
}
