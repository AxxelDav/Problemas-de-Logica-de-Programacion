package ejercicio11;

import ejercicio11.excepciones.ErrorTipoExcepcion;

public class Main {
    public static void main(String[] args) throws ErrorTipoExcepcion {
        Ejercicio11 prueba = new Ejercicio11();

        try {
            prueba.censurado("hola axel", "axel");
        }catch (ErrorTipoExcepcion e){
            System.out.println(e.getMensaje());
        }
    }
}
