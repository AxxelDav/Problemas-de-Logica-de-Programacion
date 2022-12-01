package ejercicio23;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio23 {

    public void enMayuscuula(String cadena) {

        ArrayList<String> lista = new ArrayList<>(Arrays.asList(cadena.split(" "))); //Hago un Split por espacio
        int contador = 0;

        while(contador < lista.size()){
            lista.set(contador, StringUtils.capitalize(lista.get(contador))); //actualizo cada elemento de lista, por el mismo elemento pero aplicancole capitalize
            contador++;
        }

        String palabra = String.join(",", lista).replace("," , " "); // paso la lista a una cadena normal
        System.out.println(palabra);

    }
}

//Otra logica es: recorrer la lista y preguntar si es igual a espacio, sumarle uno y hacerle un uppercase. Obviamente convertir a mayuscula la primer letra de la cadena..