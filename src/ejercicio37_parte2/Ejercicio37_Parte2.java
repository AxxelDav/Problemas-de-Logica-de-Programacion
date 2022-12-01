package ejercicio37_parte2;

import java.util.Objects;

public class Ejercicio37_Parte2 {

    public void elQueMasAparece(Integer[] numeros){
        int cont = 0;
        int contMayor = 0;
        Integer numeroMayor = 0;

        for (Integer numero : numeros){
            for (Integer numero2 : numeros){
                if (Objects.equals(numero, numero2)) cont++;
            }

            if (cont > contMayor && cont != 1) {
                contMayor = cont;
                numeroMayor = numero;
            }
            cont = 0;
        }

        System.out.println(numeroMayor); //Numero que mas se repite
        System.out.println(contMayor);   //Cantidad de veces que mas se repite
    }
}
