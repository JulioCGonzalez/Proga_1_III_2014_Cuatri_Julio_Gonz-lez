package Listas;


import Nodos.NodoUsuarios;



public class ListaUsarios {

    NodoUsuarios raiz;
    

    public void Insertar(NodoUsuarios usuario) {
        NodoUsuarios nuevo;
        nuevo = new NodoUsuarios();
        nuevo.setNumerosocio(usuario.getNumerosocio());
        nuevo.setNombre(usuario.getNombre());
        nuevo.setMorosidad(usuario.getMorosidad());
        nuevo.setDireccion(usuario.getDireccion());
        nuevo.setTelefono(usuario.getTelefono());
        
        
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoUsuarios auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public boolean Eliminar(int socio) {
        NodoUsuarios siguienteUsuario = raiz;
        NodoUsuarios anteriror = siguienteUsuario;
        if (siguienteUsuario == null) {
            System.out.println("La lista está vacía");
            return true;
        }
        while (siguienteUsuario != null) {
            if (siguienteUsuario.getNumerosocio(equals(socio))) {
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

    public String Imprimir(NodoUsuarios usuario) {
        NodoUsuarios aux;
        aux = raiz;
        String temporal = "";
        while (aux != null) {
                temporal += "Numero de socio:  " + aux.getNumerosocio() + "Nombre: "+ aux.getNombre()+"Morosidad: "
                        + aux.getMorosidad()+"Direccion: " + aux.getDireccion() + "Telefono"+ aux.getTelefono();
                temporal += "\n";
                aux = aux.getSiguiente();
            }
        return temporal;
        }
    
}
