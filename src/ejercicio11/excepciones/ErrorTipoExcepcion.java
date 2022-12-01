package ejercicio11.excepciones;

import ejercicio11.mensaje.Mensajes;

public class ErrorTipoExcepcion extends Exception{

    private final String mensaje;

    public ErrorTipoExcepcion(String mensaje){
        this.mensaje = mensaje;
    }

    public static ErrorTipoExcepcion errorTipoDeDato(){
        return new ErrorTipoExcepcion(Mensajes.OTROS_PARAMETROS);
    }

    public String getMensaje() {
        return mensaje;
    }
}
