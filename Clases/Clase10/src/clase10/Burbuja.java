package clase10;

public class Burbuja {
    public int[] Burbuja(int[]arreglo, String ordenadas){
        int indice;
        int indice2;
        int auxiliar;
        
        for (indice = 0; indice< arreglo.length-1; indice++) {
            for (indice2 = 0; indice2 < ((arreglo.length-indice)-1); indice2++) {
               if (arreglo[indice2+1]<arreglo[indice2]){
                   auxiliar=arreglo[indice2+1];
                   arreglo[indice2+1]=arreglo[indice2];
                   arreglo[indice2]=auxiliar;
               }
            }
        }
        return arreglo;
    }
     public int[] Burbujadesendente(int[]arreglo, String ordenadas){
        int indice;
        int indice2;
        int auxiliar;
        
        for (indice = 0; indice< arreglo.length-1; indice++) {
            for (indice2 = 0; indice2 < (arreglo.length-1); indice2++) {
               if (arreglo[indice2]<arreglo[indice2+1]){
                   auxiliar=arreglo[indice2+1];
                   arreglo[indice2]=arreglo[indice2+1];
                   arreglo[indice2+1]=auxiliar;
               }
            }
        }
        return arreglo;
    }
}

