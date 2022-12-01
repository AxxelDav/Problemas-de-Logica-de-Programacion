package ejercicio24;

import java.util.Arrays;

public class Ejercicio24 {

    public boolean permutacion(int numeros[], int num) {

        int contador = 0;

        if (numeros.length != num){ //Consulto de que el array tenga el tamaño correcto (igual a num)
            return false;
        }

        while (contador < numeros.length) {
            if (numeros[contador] != contador+1){ //comparo que cada elemento del array arranque en 1, y que sus elementos sean consecutivos de a 1
                return false;
            }
            contador++;
        }

        return true;

    }
}
