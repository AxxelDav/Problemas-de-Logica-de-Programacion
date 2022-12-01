package ejercicio42;

import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio42 {

    public void aleatorio(Integer numero1, Integer numero2) {

        int numAleatorio = (int) (Math.random() * numero2);  //multiplico por numero2 porque es hasta donde quero que llegue

        while (numero2 - (numAleatorio + numero1) < 0) { //Con este calculo me aseguro que el random + numero1 sea el correcto y que no se pase de numero2
            numAleatorio = (int) (Math.random() * numero2);
        }

        System.out.println(numAleatorio + numero1);
    }
}

/*
Otra forma:
System.out.println(ThreadLocalRandom.current().nextInt(numero1, numero2));
*/