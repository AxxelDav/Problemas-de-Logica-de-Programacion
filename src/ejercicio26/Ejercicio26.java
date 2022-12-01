package ejercicio26;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio26 {

    public void fibonacci(int numero){
        int x=0, y=1, z =x+y;
        List<Integer> lista = new ArrayList<>();

        lista.add(x);
        lista.add(y);
        lista.add(z);

        while (numero != z){
            x=y;
            y=z;
            z = x+y;
            lista.add(z);
        }

        System.out.println("Serie Completa: " + lista.toString());


    }
}
