package ejercicio10;

public class Ejercicio10 {

    public String escalera(int num){
        String escalera_completa = ""; //sobre esa variable vamos a concatenar las filas de los escalones que tendra la escalera

        for (int nivel = 1; nivel<=num; nivel++){ //nivel es la cantidad de filas que vamos a imprimir
            String escalones = "";  //Con esto formamos los escalones que va a tener ese nivel(fila)

            for (int escalon=1; escalon<=nivel; escalon++){
                escalones += "[-]"; //Se va añadiendo un escalon nuevo hasta que lleguemos al numero de nivel
            }

            escalera_completa += escalones + "\n"; //Añadimos sobre lo que ya hubiera dentro de la escalera_completa
        }

        return escalera_completa;
    }
}

//Muy buen algoritmo:
//public void escalera(int num){
//        String simbolo= "[-]";
//        for (int i=0; i<num; i++){
//        String agregado = new String(new char[i]).replace("\0", "[-]");
//        System.out.println(simbolo + agregado);
//        }
//        }