package ejercicio15;

import java.util.*;

public class Ejercicio15 {

    public void LetraMasRepetida(String texto) {

        texto = texto.replace(" ", "").toLowerCase(); //Elimino los espacios del String y tambien paso a minuscula para que las letras no se diferencien por ser minuscula o mayuscula.

        String letraMasRepetida = "";
        int cantidadRepetida = 0;

        List<String> textoToList = Arrays.asList(texto.split("")); //transformamos el string "texto" a una lista

        for (String letra : textoToList) {
            int cantidad = Collections.frequency(textoToList, letra); //obtenemos la cantidad de veces que "letra" (elemento de la lista segun nos indique el forEach) se repite en la lista

            if (cantidadRepetida < cantidad) {  //Si la letra actual superó a la que había antes. (Acá vamos a ir obteniendo la letra que mas se repite y la cantidad de veces que se repite)
                letraMasRepetida = letra; //Actualiza la letra
                cantidadRepetida = cantidad; //Actualiza el contador de repeticiones con el número máximo
            }

            System.out.println("La letra " + letra + " se repite " + cantidad + " veces.");


        }

        System.out.println("\nLetra con mayor ocurrencia: " + letraMasRepetida);
        System.out.println("Cantidad de ocurrencias: " + cantidadRepetida);
    }
}


//Otro algoritmo super COPADO:
/*
    public void LetraMasRepetidas (String texto) {

        texto = texto.replace(" ", "").toLowerCase();
        char cadena[] = texto.toCharArray();

        Map<Character, Integer> miMapa = new HashMap(); // Mapa para contar cada letra
        for (char letra : cadena) {
            try {
                miMapa.put(letra, miMapa.get(letra) + 1);
            } catch (NullPointerException npe) {  // Entramos aquí la primera vez que se encuentra una nueva letra
                miMapa.put(letra, 1);
            }
           }

        char letraMasRepetida = Collections.max(miMapa.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

        System.out.println("\nLetra con mayor ocurrencia: " + letraMasRepetida +  ", con una frecuencia de: " + miMapa.get(letraMasRepetida));

        miMapa.keySet().forEach((letra) -> {
            System.out.println("Letra [" + letra + "]: " + miMapa.get(letra));
        });
    }
 */
