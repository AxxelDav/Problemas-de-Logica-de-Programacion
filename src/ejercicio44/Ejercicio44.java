package ejercicio44;

import java.util.ArrayList;

public class Ejercicio44 {

    public void dosPalabras(String[] palabras) {
        ArrayList<String> resultado = new ArrayList<>();

        for (String palabra : palabras) {
            if (palabra.lastIndexOf(" ") != -1) {
                resultado.add(palabra);
            }
        }
        System.out.println(resultado.toString());
    }
}
