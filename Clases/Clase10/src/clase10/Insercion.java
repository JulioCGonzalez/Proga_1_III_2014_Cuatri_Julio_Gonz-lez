package clase10;

public class Insercion {
public int[] Insercion (int[]arreglo){
     int aux;
        for(int i=1; i<arreglo.length; i++) {
            int j=i;
            while(j>0 && arreglo[j]<arreglo[j-1] ){
                int tmp = arreglo[j];
                arreglo[j]    = arreglo[j-1];
                arreglo[j-1]  = tmp;
                j--;
            }
        }
        return arreglo;
}
}
