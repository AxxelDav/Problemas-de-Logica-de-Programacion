package ejercicio49;

import java.lang.reflect.Field;

public class Ejercicio49 {

    public boolean existePropiedad(miObjeto objeto, String atributo) throws ClassNotFoundException {
        Class<?> userclass = Class.forName("ejercicio49.miObjeto");
        Field[] userFields = userclass.getDeclaredFields();

        for (Field elemento : userFields) {
            if (elemento.toString().contains(atributo)) { //Busco si algun elemento de userField contiene el nombre del atributo (porque vcada elemento tiene el nombre del paquete, etc...
                return true;
            }
        }

        return false;
    }
}
