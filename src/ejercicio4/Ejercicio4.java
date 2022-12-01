package ejercicio4;

public class Ejercicio4 {

    public char[] revertirPalabra(String s){
        char cadena[] = s.toCharArray(); //Cambiamos el string "s" a una cadena, otra forma podias haber accedido a cada posicion mediante .charAt(1))
        int ultimo = cadena.length - 1;
        int inicio = 0;
        char aux;
        for(int i = 0; i < cadena.length / 2; i++){
            aux = cadena[inicio];
            cadena[inicio] = cadena[ultimo];
            cadena[ultimo] = aux;
            inicio ++;
            ultimo--;
        }
        return cadena;
    }

    //MEJOR ALGORITMO
//    public String revertir(String texto){
//        char cadena[] = texto.toCharArray();
//        String invertido = "";
//        for(int i = 0; i<cadena.length; i++){
//            invertido = cadena[i] + invertido;  //concatena pero al reves, osea lo añado primero (para invertir el orden). Es decir que la letra que voy a agregar, la voy a ir agregando la letra al principio (osea antes de la primer letra que agregue anteriormente)
//        }
//
//        return invertido;
//    }

}
