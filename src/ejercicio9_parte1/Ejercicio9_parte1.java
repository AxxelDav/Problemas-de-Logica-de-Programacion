package ejercicio9_parte1;

import java.util.*;

public class Ejercicio9_parte1 {

    public void elementosEnComun(final int[] array1, final int[] array2){
        List<Integer> comun = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array1.length; i++) {
            int finalI = i;
            if(Arrays.stream(array2).anyMatch(j -> j == array1[finalI])) comun.add(array1[i]);
        }

        for(int a : comun)set.add(a);

        Integer[] miarray = new Integer[set.size()];
        set.toArray(miarray);
        System.out.println(Arrays.toString(miarray));

    }
}

//ALGORITMO UTILIZADO:
//Creo una lista "comun" y un conjunto "set"
//En un for recorro el array1 y pregunto si su elementos estan contenidos en array2, si es verdadero agrego ese elemento a la lista "comun"
//En un forEach agrego al conjunto "set" los elementos de la lista "comun" (si se repite el set solo guarda un solo elemento)
//Creo un array "miarray" del tamaño del conjunto "set"
//Convierto el "set" a array "miarray"
//Imprimo el array "miarray" en forma de String
