package clase.pkg11;

public class Binario {

    public int BusquedaBinaria(int[] arreglo, int elemento) {
        int inicial = 0;
        int _final = arreglo.length - 1;
        while (inicial < _final) {
        int central =(int) (inicial + _final) / 2;
            if (elemento>arreglo[central]) {
                inicial=central+1;
            }
            else{
                if (elemento<arreglo[central]) {
                _final=central-1;    
                }
                else{
                    return central;
                }
            }
        }
        return -1;
    }

}
