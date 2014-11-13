package clase10;

public class Clase10 {

    public static void main(String[] args) {
        Seleccion oSeleccion = new Seleccion();
        int []arreglo={8,5,2,6,0};
        int [] temporal=oSeleccion.Seleccion(arreglo, "A");
        for (int i = 0; i < temporal.length; i++) {
            System.out.println(temporal[i]);
        }
        System.out.println();
        
        Burbuja oBurbuja = new Burbuja();
        temporal=oBurbuja.Burbuja(arreglo, "A");
        for (int i = 0; i < temporal.length; i++) {
            System.out.println(temporal[i]);
        }
        System.out.println();
        
        temporal=oBurbuja.Burbujadesendente(arreglo, "A");
        for (int i = 0; i < temporal.length; i++) {
            System.out.println(temporal[i]);
        }
        System.out.println();
                
        Insercion oInsercion = new Insercion();
        temporal=oInsercion.Insercion(arreglo, "A");
        for (int i = 0; i < temporal.length; i++) {
            System.out.println(temporal[i]);
        }
        System.out.println();    
    }
    
}
