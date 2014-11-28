package practicalistas;

public class Lista {

    private Nodo raiz;

    public void Insertar(Nodo elemento) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.setNumero(elemento.getNumero());

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            Nodo auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public String ContadordeNumeros() {
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        int contador7 = 0;
        int contador8 = 0;
        int contador9 = 0;
        int contador10 = 0;

        String retorno = "";

        Nodo auxiliar = raiz;
        while (auxiliar != null) {
            if (auxiliar.getNumero()==1) {
                contador1++;
            }
            if (auxiliar.getNumero()==1) {
                contador2++;
            }
            if (auxiliar.getNumero()==1) {
                contador3++;
            }
            if (auxiliar.getNumero()==1) {
                contador4++;
            }
            if (auxiliar.getNumero()==1) {
                contador5++;
            }
            if (auxiliar.getNumero()==1) {
                contador6++;
            }
            if (auxiliar.getNumero()==1) {
                contador7++;
            }
            if (auxiliar.getNumero()==1) {
                contador8++;
            }
            if (auxiliar.getNumero()==1) {
                contador9++;
            }
            if (auxiliar.getNumero()==1) {
                contador10++;
            }
            
            auxiliar=auxiliar.getSiguiente();
        }
        retorno+=contador1+"repeticiones en 1";
        retorno+=contador2+"repeticiones en 2";
        retorno+=contador3+"repeticiones en 3";
        retorno+=contador4+"repeticiones en 4";
        retorno+=contador5+"repeticiones en 5";
        retorno+=contador6+"repeticiones en 6";
        retorno+=contador7+"repeticiones en 7";
        retorno+=contador8+"repeticiones en 8";
        retorno+=contador9+"repeticiones en 9";
        retorno+=contador10+"repeticiones en 10";
        
        return retorno;
    }
}
