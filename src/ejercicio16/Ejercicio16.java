package ejercicio16;

import java.util.Arrays;
import java.util.List;

public class Ejercicio16 {

    public void vocales(String texto) {

        texto = texto.replace(" ", "").toLowerCase();
        List<String> listTexto = Arrays.asList(texto.split(""));
        int cantidad = 0, contador = 0;

        for (String letra : listTexto) {
            contador = esVocal(letra) ? cantidad++ : cantidad;
        }
        System.out.println(contador);
    }


    public boolean esVocal(String letra){
        switch (letra){
            case "a": case "e": case "i": case "o": case "u":
                return true;
        }
        return false;
    }

}
//Algoritmos usando Programacion Funcional:
/*
https://www.mejorcodigo.com/p/105946.html
*/