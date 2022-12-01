package ejercicio51;

import java.util.ArrayList;

public class Ejercicio51 {

    public void pares(Integer[] numeros) {
        ArrayList<Integer> parArray = new ArrayList<>();
        ArrayList<Integer> imparArray = new ArrayList<>();

        for (Integer numero : numeros) {
            if (numero%2 == 0) parArray.add(numero);
            else imparArray.add(numero);
        }

        System.out.println("pares: " + parArray);
        System.out.println("impares: " + imparArray);
    }


}
