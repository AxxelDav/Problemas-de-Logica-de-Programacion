package ejercicio41;

public class Ejercicio41 {

    public void triangulo(Integer numero) {
        StringBuilder espacios = new StringBuilder("");
        StringBuilder asteriscos = new StringBuilder("*");
        String espacios2 = " ";
        String asteriscos2 = "**";
        String cadenaEspacios = "";


        for (int i = 1; i<numero; i++) {
            espacios.append(espacios2); //Armo la cadena con los espacios para la primer fila (siempre es igual a la cantidad de filas - 1)
        }

        cadenaEspacios = String.valueOf(espacios); //Guardo lo anterior en un String

        System.out.println(cadenaEspacios + asteriscos); //Para la primer fila, concateno normalmente (sin iteraciones)
        for (int i = 1; i < numero; i++) { //Empiezo a armar las demas filas.
            System.out.println(cadenaEspacios.substring(0, cadenaEspacios.length() - i) + asteriscos.append(asteriscos2));//Imprimo de lado izquierdo: substring cada vez se achica en 1, segun avance de fila. Y del lado derecho: imprimo los asteriscos que cada vez van aumentando de a 2 (porque apendeo asteriscos2
        }
    }
}


/*
¿Como pense el algoritmo?

Primero tengo en cuenta esto:
PRIMER FILA: 3 espacios + 1 asterisco
SEGUNDA FILA: 2 espacios + 3 asteriscos
TERCERA FILA: 1 espacio + 5 asteriscos
CUARTA FILA: 0 espacios + 7 asteriscos

Despues me planteo como dibujar esto:
//*
//***
//*****
//*******

Y por ultimo a cada fila le agrego los espacios correspondientes
*/