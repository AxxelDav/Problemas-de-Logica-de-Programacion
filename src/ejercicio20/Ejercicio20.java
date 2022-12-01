package ejercicio20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio20 {

    public void anagramas(String cadena1, String cadena2) {
        cadena1 = cadena1.replace(" ", "").toLowerCase();
        cadena2 = cadena2.replace(" ", "").toLowerCase();
        List<String> listaCadena1 = Arrays.asList(cadena1.split(""));
        List<String> listaCadena2 = Arrays.asList(cadena2.split(""));
        boolean flag = false; //Creamos esta bandera que nos indicara si son o no anagramas

        for (String letra : listaCadena1) {
            flag = Collections.frequency(listaCadena1, letra) == Collections.frequency(listaCadena2, letra); //Comparamos si la ferecuencia de "letra" en ambas listas es la misma, en ese caso nos aseguramos que es anagrama (cada letra tiene la misma cantidad en cada lista)
            if (!flag)
                break; //Si "letra" no tiene la misma ocurrencia en ambas listas CORTAMOS el ciclo!! y devolvemos la "flag" (bandera) en falso
        }

        System.out.println(flag);
    }
}
//    public void anagramas2(String cadena1, String cadena2) {
//        cadena1 = cadena1.replace(" ", "").toLowerCase();
//        cadena2 = cadena2.replace(" ", "").toLowerCase();
//        String[] cad1 = cadena1.split("");
//        String[] cad2 = cadena2.split("");
//        ArrayList<String> listaCadena1 = new ArrayList<String>(Arrays.asList(cad1));
//        ArrayList<String> listaCadena2 = new ArrayList<String>(Arrays.asList(cad2));
//        boolean flag = false;
//        int posicion = 0;
//
//        for (String letra : listaCadena1) {
//                posicion = listaCadena2.indexOf(letra); //Me fijo la posicion en donde se encuentra "letra" dentro de listaCadena2
//                if (posicion != -1) { //Pregunto si se encontro una posicion valida
//                    listaCadena2.remove(posicion); //elimino el elemento numero "posicion" de listaCadena2
//                    flag = true; //seteo la bandera en true
//                } else { //Entro acá porque no hay una "posicion" valida de letra dentro de listaCadena2, es decir, NO se encontro letra en listaCadena2
//                    flag = false;//seteo la bandera en false
//                    break; //corto con el ciclo
//                }
//            }
//        System.out.println(flag);
//    }

//Otro algoritmo puede ser hacerle split, eliminar espacios y demas, luego aplicarle un SORT y por ultimo comparar si son iguales las cadenas.

