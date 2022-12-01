package ejercicio47;

import java.util.Arrays;

public class Ejercicio47 {

    public void aficiones(Usuario[] usuarios) {
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;

        for (Usuario usuario : usuarios) {

            switch (usuario.getAficion()) {
                case "Informatica":
                    cont1++;
                    break;
                case "Cine":
                    cont2++;
                    break;
                case "Futbol":
                    cont3++;
                    break;
                case "Videojuegos":
                    cont4++;
                    break;
            }
        }

        System.out.println("Informatica: " + cont1);
        System.out.println("Cine: " + cont2);
        System.out.println("Futbol: " + cont3);
        System.out.println("Videojuegos: " + cont4);
    }
}
