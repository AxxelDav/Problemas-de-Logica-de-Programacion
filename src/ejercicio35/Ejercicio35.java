package ejercicio35;

public class Ejercicio35 {

    public Integer[] primeroYultimo(Integer[] numeros) {
        Integer[] nuevo = new Integer[2];
        nuevo[0] = numeros[0];
        nuevo[1] = numeros[numeros.length-1];
        return nuevo;
    }
}
