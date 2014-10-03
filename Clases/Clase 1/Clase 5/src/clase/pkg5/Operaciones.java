
package clase.pkg5;

public class Operaciones {
    // Calculo de la suma de dos valores.
    public double Sumar(double valor1 , double valor2){
        return valor1+valor2;
    }
    public double Resta (double valor1 , double valor2){
        //Calculo de la resta de los dos valores.
        return valor1-valor2;
    }
    public double Division (double valor1 , double valor2){
        //Calculo de la división de dos valores.
        if (valor2 == 0)
        {
            return 0;
        }
        else{
            return valor1/valor2;
        }
    }
    public double Mutiplicacion (double valor1 , double valor2){
        return valor1*valor2;
    }
    public double Raiz (double valor1){
        return Math.sqrt(valor1);
    }
    public double Pontecia (double valor1 , double valor2){
        return Math.pow(valor2, valor2);
    }
}
