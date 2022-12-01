package ejercicio18;

public class Ejercicio18 {

    public void mostrarDivisores(int numero){
        int divisor = 1;
        while(divisor <= numero){
            if(numero%divisor==0) System.out.println(divisor);
            divisor++;
        }
    }
}
