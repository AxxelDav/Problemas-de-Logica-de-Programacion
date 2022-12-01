package ejercicio25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Ejercicio25 {

    public void mayusMinus(String cadena) {
        int mayus=0, minus=0;

        ArrayList<String> lista = new ArrayList<>(Arrays.asList(cadena.split("")));

        for (String letra : lista) {
            if(letra.equals(letra.toUpperCase()))
                mayus++;
            else
                minus++;
            }

        if (mayus > minus){
            System.out.println(String.join(",", lista).replace("," , "").toUpperCase());
        }
        else if (mayus < minus){
            System.out.println(String.join(",", lista).replace("," , " ").toLowerCase());
        }
        else System.out.println(String.join(",", lista).replace("," , " "));

    }
}
