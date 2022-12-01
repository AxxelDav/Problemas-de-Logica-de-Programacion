package ejercicio28;

public class Ejercicio28 {

    public void factorial(int num) {
        int cont=1;
        int factorial=1;

        while (cont<=num){
            factorial=factorial*cont;
            cont++;
        }

        System.out.println(factorial);
    }
}
