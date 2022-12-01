package ejercicio37_parte1;

public class Ejercicio37_Parte1 {

    public void prueba(String texto) {
        int contMayor = 0;
        int cont = 0;
        String palabraMayor = "No hay palabra Mayor";

        for (String palabra : texto.split(" ")){
            for (String palabra2 : texto.split(" ")){
                if (palabra.equals(palabra2)){
                    cont++;
                }
            }
            if (cont > contMayor && cont != 1) { //Valido que contador SIEMPRE sea mayor que contMayor, y tambien valido que contador JAMAS sea 1 (Eso significa que no se cuenta mas de 1 ocurrencia.
                contMayor = cont;
                palabraMayor = palabra;
            }
            else cont = 0; // en caso de que haya solo una ocurrencia, el contador va a ser 0 (incluso aunque sea mayor que contMayor)
        }

        System.out.println(palabraMayor); //Palabra que mas se repite
        System.out.println(contMayor);    //Cantidad de veces que mas se repite





    }
}
