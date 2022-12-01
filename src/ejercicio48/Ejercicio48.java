package ejercicio48;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio48 {

    public void soloUnaVez(String texto) {
        int cont = 0;

        List<String> lista = new ArrayList<>();

        for (String letra : texto.split("")) {
            for (String letra2 : texto.split("")){
                if (letra.equals(letra2)) cont++;
            }

            if (cont == 1) {
                lista.add(letra);
            }

            cont = 0;
        }

        System.out.println("Primera Aparicion: " + lista);
        System.out.println("Primer Caracter: " + texto.charAt(0));
    }
}
