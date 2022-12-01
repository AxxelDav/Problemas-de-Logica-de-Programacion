package ejercicio46;

public class Main {
    public static void main(String[] args) {

        String palabra = "hola";

        Ejercicio46 ejercicio46 = new Ejercicio46();
        ejercicio46.todosSubstrings(palabra);

    }
}







//********************************

/*
        int izquierda = 0, derecha = 1;
        int j = 0;
        for(int i = 1 ;  i <= 4 ; i++) {
            while (j<4) {
                System.out.println("(" + izquierda + ", " + derecha + ")");
                izquierda++;
                derecha++;
                j++;
            }
            j = i;
            derecha = i + 1;
            izquierda = 0;

        }
 */