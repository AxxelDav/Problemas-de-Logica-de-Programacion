package ejercicio32;

public class Ejercicio32 {

    public Integer[] alCuadrado(Integer[] vec){
        int i = 0;

        for (Integer numero : vec){
            vec[i] = numero*numero;
            i++;
        }
        return vec;
    }


}
