package ejercicio40;

public class Ejercicio40 {

    public void altoBajo(Integer[] numeros) {
        int numBajo = numeros[0];
        int numAlto = numeros[0];

        for (Integer numero : numeros){
            if (numero >= numAlto) numAlto = numero;
            if (numero <= numBajo) numBajo = numero;
        }
        System.out.println("Numero alto: " + numAlto);
        System.out.println("Numero bajo: " + numBajo);
    }
}

//Una algoritmo super Eficiente es, ordenar el array, y luego devolver el primer y ultimo elemento del array.
