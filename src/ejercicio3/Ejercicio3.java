package ejercicio3;

public class Ejercicio3 {

    public Ejercicio3() {
    }

    //Devuelve la cantidad de veces que palabra aparecen en frase
    public int cantidadPalabraEnFrase(String palabra, String frase){
        int contador = 0;
        int posicion =  frase.indexOf(palabra); //me retorna la primera posicion donde se encontro la palabra en frase (uso el indexOf que tiene un parametro de String)
        while (posicion != -1){ //"-1" es porque el metodo IndexOf devuelve -1 si es que NO se encontro el elemento en la cadena, por lo tanto no hay posicion
            contador ++;
            posicion = frase.indexOf(palabra, posicion + palabra.length()); // actualizo el valor de posicion, donde uso indexOf que tiene 2 parametros (la palabra a buscar, la posicion en la que va a empezar a buscar (Que le sumo el tamaño de palabra para que empiece a buscar luego de la ultima palabra encontrada)
        }
        return contador;
    }

    /*Otro algoritmo
    buscae en "frase" donde aparece la primer letra de "palabra"
    si aparece, comparas las siguientes posiciones para ver si coincide con "palabra"
    si coincide, se guarda la ultima posicion + 1 , de la palabra encontrada en "frase"
    se vuelve a repetir el ciclo hasta terminar la cadena (osea hasta que la posicion sea igual al tamaño de frase)
    */
}
