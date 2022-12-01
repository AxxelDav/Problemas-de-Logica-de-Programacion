package ejercicio8;

public class Ejercicio8 {

    public int darvueltaNumero(Integer numero){
        String cadena;
        cadena = numero.toString(); //paso numero a String
        StringBuilder cadena2 = new StringBuilder(cadena); //cadena2 me va a permitir usar los metodos de StringBuilder, como utilizar el metodo "reverse()"
        String ultimo = cadena2.reverse().toString();
        return Integer.parseInt(ultimo); //casteo el String ultimo a Integer y lo retorno
    }

    //ALGORITMO DE ROBLES:
//    toString()
//    split()
//    reverse()
//    join()

}
