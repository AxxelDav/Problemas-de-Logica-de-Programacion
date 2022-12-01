package ejercicio6;

public class Ejercicio6 {

    public String ladoHorizontal(int tamanio){
        String cadena = "";
        for(int i=0; i<tamanio ; i++) cadena += "*";
        return cadena;
    }

    public String ladoVertical(int tamanio){
        String cadena = "";
        char caracter = '*';
        for(int i=0; i<tamanio ; i++)cadena += " "; //lleno la cadena de vacios, tantos caracteres vacios como el tamanio que paso por parametro
        StringBuilder nueva_cadena = new StringBuilder(cadena); //creo una cadena de tipo StringBuilder que me permite usar el metodo setCharAt()
        nueva_cadena.setCharAt(0, caracter); //reemplazo el primer caracter de nueva_cadena con "*"
        nueva_cadena.setCharAt(cadena.length()-1, caracter); //reemplazo el ultimo caracter de nueva_cadena con "*"
        return nueva_cadena.toString();
    }



    public void cuadrado(int tamanio){
        System.out.println(ladoHorizontal(tamanio));
        for (int i = 1; i<=tamanio-2; i++) System.out.println(ladoVertical(tamanio)); // como el for tiene una sola linea puedo ponerlo todo en una sola linea
        System.out.println(ladoHorizontal(tamanio));
    }
}


//********ALGORITMO DE ROBLES*************
/*    public String lado(int numero){
        String lado = "";
        for (int i=0; i<numero; i++){
            lado += "*";
        }
        return lado;
    }

    public String cuadrado2(int numero){
        String dibujo = lado(numero) + "\n";
        String contenido = "";
        for (int i=0; i<(numero-2); i++){
            contenido = "*";

            for (int x=0; x<(numero-2); x++){
                contenido += " ";
            }
            contenido += "*";
            dibujo += contenido + "\n";
        }
        dibujo += lado(numero);
        return dibujo;
    }
*/




