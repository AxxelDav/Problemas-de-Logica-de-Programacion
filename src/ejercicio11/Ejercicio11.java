package ejercicio11;

//censurado(String texto, String busqueda)
//Si el texto y la busqueda no vienen --> no se han ingresado correctamente los parametros
//Si el texto y la busqueda estan vacios --> no puedes leer el texto y la busqueda
//Si solo llega texto --> no se puede hacer la busqueda, porque falta ese parametro
//Si solo llega busqueda --> no leer el texto, porque falta ese parametro

import ejercicio11.excepciones.ErrorTipoExcepcion;

public class Ejercicio11 {

    public void censurado(String texto, String busqueda) throws ErrorTipoExcepcion {

        if (!texto.getClass().getSimpleName().equals(busqueda.getClass().getSimpleName())){
            throw ErrorTipoExcepcion.errorTipoDeDato();
        }

        System.out.println(texto.replaceAll(busqueda, "[-CENSURADO-]"));

    }
}
