package pkgswitch;

import java.util.Random;

public class Problem3 {

    public Problem3() {
    }
public void Crearnumero(int x){
    Random rnd = new Random();
    x =1;
    x = rnd.nextInt(3000);
    System.out.println("El numero aeleatorio es " + x);
}
}