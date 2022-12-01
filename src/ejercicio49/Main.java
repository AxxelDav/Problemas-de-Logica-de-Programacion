package ejercicio49;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        Ejercicio49 ejercicio49 = new Ejercicio49();
        miObjeto objeto = new miObjeto();

        System.out.println(ejercicio49.existePropiedad(objeto, "telefono"));
    }
}
