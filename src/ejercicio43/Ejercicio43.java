package ejercicio43;

public class Ejercicio43 {

    public void laMedia(Integer[] numeros) {
        int suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }

        System.out.println(suma/numeros.length);
    }
}
