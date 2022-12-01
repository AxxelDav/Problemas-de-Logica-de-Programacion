package ejercicio30;

import java.util.Arrays;
public class Ejercicio30 {

    public Object[] eliminarDuplicados(Integer[] array) {
        return Arrays.stream(array).distinct().toArray(); //Con PROGRAMACION FUNCIONAL elimino los elementos duplicados del array, con ayuad de STREAM de Arrays
    }
}


//Otro algoritmo es:
//convertir el array en "set" (conjunto) y luego transformar ese set en array y retornarlo.