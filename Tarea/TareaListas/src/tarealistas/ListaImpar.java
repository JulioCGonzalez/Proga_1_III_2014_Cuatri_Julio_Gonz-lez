package tarealistas;

public class ListaImpar {

         private NodosDeNumeros raiz;
    
    public void Insertar(NodosDeNumeros elemento)
    {
        NodosDeNumeros nuevo;
        nuevo=new NodosDeNumeros();
        nuevo.setNumero(elemento.getNumero());
       
        
        if(raiz==null)
        {
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }
        else
        {
            NodosDeNumeros auxiliar=raiz;
            while (auxiliar.getSiguiente()!=null) {
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }        
    } 
    
    public void Imprimir(NodosDeNumeros elemento)
    {
        NodosDeNumeros recorrido=raiz;
        
        if(elemento.getNumero()%2!=0)
        while(recorrido!=null)
        {
            System.out.println(recorrido.getNumero());
            recorrido=recorrido.getSiguiente();
        }else{
        System.out.println();
    }
    }
}
