package ejercicio9_parte2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio9_parte2 {

    public String elementosComunes (String cadena1, String cadena2) {

        List<String> listaComun = new ArrayList<>();

        for (String letraPrimera : cadena1.split("")) {
            for (String letraSegunda : cadena2.split("")){
                if (letraPrimera.equals(letraSegunda)) listaComun.add(letraPrimera);
            }
        }

        return  String.join("", listaComun).replace(",", "");
    }
}

//Podes probar haciendolo con PROGRAMACION FUNCIONAL