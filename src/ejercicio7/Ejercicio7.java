package ejercicio7;

public class Ejercicio7 {

    public int numerosImparesEntre(int numero1, int numero2){
        int contador = 0;
        for (int i =numero1+1; i<numero2; i++){
            if (i%2 != 0){
                contador++;
            }
        }
        return contador;
    }
}
