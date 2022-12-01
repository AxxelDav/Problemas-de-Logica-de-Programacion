package ejercicio30;

import ejercicio28.Ejercicio28;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Ejercicio30 ejercicio30 = new Ejercicio30();
        Integer[] array = {1,2,3,4,4,4,4,4,5};

        System.out.println(Arrays.toString(ejercicio30.eliminarDuplicados(array)));
    }


}
