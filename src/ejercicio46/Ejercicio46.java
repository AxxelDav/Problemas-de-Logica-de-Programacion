package ejercicio46;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio46 {

    public void todosSubstrings(String palabra) {

        List<String> lista = new ArrayList<>();

        int izquierda = 0, derecha = 1;
        int j = 0;
        for(int i = 1 ;  i <= palabra.length() ; i++) {
            while (j<palabra.length()) {
                lista.add(palabra.substring(izquierda,derecha));
                izquierda++;
                derecha++;
                j++;
            }
            j = i;
            derecha = i + 1;
            izquierda = 0;
        }
        System.out.println(lista);
    }
}





/*
Para hacer el algoritmo pense lo siguiente:

Primero la cantidad concurrencia de cada substring y su rango.
Ejemplo: para la palabra "hola" tenemos 4 rondas (un for)
Y en cada ronda tenemos subtrings de diferente tamaño.
En la primer ronda tenemos 4 subtrings con un tamaño de 1 caracter cada uno: "h", "o", "l", "a"
En la segunda ronda tenemos 3 subtrings con un tamaño de 2 caracteres cada uno: "ho", "ol", "la"
En la tercer ronda tenemos 2 subtrings con un tamaño de 3 caracteres cada uno: "hol", "ola"
En la cuarta ronda tenemos 1 subtring con un tamaño de 4 caracteres: "hola"

Si te fijas se respeta un patron, que es:
Por cada ronda se achica la cantidad de substrings en 1.
Viendo los rangos para cada ronda se cumple lo siguiente:

El numero de la izquierda es desde donde empieza el subtring
El numero de la derecha es desde donde termina el subtring

Primer Ronda
(0,1)
(1,2)
(2,3)
(3,4)

Segunda Ronda
(0,2)
(1,3)
(2,4)

Tercer Ronda
(0,3)
(1,4)

Cuarta Ronda
(0,4)

Entonces si te fijas el numero de la izquierda siempre es creciente y el numero de la derecha en cada ronda arranca con (derecha = derecha +1)

Asi pensé la logica, una vez que pude imprimir cada rango en cada ronda (lo harcodee con numeros) y viendo que se respetaba el patron, lo unico que hice fue usar el metodo Substring y le pase esos numeros.

*/