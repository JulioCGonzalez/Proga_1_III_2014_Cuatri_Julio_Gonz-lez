package examen;

public class Ejercicio2 {
private int cantidad = 0;
// Constructor de la clase
    public  Ejercicio2(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public String Desglosar(){
        String retorno = "";
       //Metodos para calcualar dependiendo del caso de cuanta es la cantidad de colones 
        if (this.cantidad >= 10000) {
            retorno += this.cantidad/10000 + " Billetes de 10000 \n";
            this.cantidad = this.cantidad%10000;
        // Se trabaja con grandes cantidades pero nos indica que si pasa de ese rango que siga con el otro y asi sucesivamente    
        }
        if (this.cantidad >= 5000 && this.cantidad < 10000) {
            retorno += this.cantidad/5000 + " Billetes de 5000 \n";
            this.cantidad = this.cantidad%5000;
            
        }
        if (this.cantidad >= 2000 && this.cantidad < 5000) {
            retorno += this.cantidad/2000 + " Billetes de 2000 \n";
            this.cantidad = this.cantidad%2000;
            
        }
        if (this.cantidad >= 1000 && this.cantidad < 2000) {
            retorno += this.cantidad/1000 + " Billetes de 1000 \n";
            this.cantidad = this.cantidad%1000;
            
        }
        if (this.cantidad >= 500 && this.cantidad < 1000) {
            retorno += this.cantidad/500 + " Monedas de 500 \n";
            this.cantidad = this.cantidad%500;
            
        }
        if (this.cantidad >= 100 && this.cantidad < 500) {
            retorno += this.cantidad/100 + " Monedas de 100 \n";
            this.cantidad = this.cantidad%100;
            
        }
        if (this.cantidad >= 50 && this.cantidad < 100) {
            retorno += this.cantidad/50 + " Monedas de 50 \n";
            this.cantidad = this.cantidad%50;
            
        }
        if (this.cantidad >= 25 && this.cantidad < 50) {
            retorno += this.cantidad/25 + " Monedas de 25 \n";
            this.cantidad = this.cantidad%25;
            
        }     
    return retorno;
}
}