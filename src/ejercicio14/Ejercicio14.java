package ejercicio14;

import java.util.function.Function;

public class Ejercicio14 {

    public String repiteme(String texto, int cant) {

        StringBuilder resultado = new StringBuilder();
        int i = 0;
        while(i<cant){
            resultado.append(texto);
            i++;
        }

        return resultado.toString();
    }
}
