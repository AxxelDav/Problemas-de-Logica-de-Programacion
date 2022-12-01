package ejercicio50;

public class Ejercicio50 {

    public void bucles(Integer numero) {
        int bucles = 0;
        String cadena = numero.toString(); //Paso el numero a String, para luego meterlo en un FoeEach y hacerle un split

        for (String letra : cadena.split("")) {
            if (Integer.parseInt(letra) == 0 || Integer.parseInt(letra) == 6 || Integer.parseInt(letra) == 9) bucles ++; //para comparar cada letra con un numero, lo casteo con el parseInt
            else if (Integer.parseInt(letra) == 8) bucles += 2;
        }

        System.out.println("Bucles: " + bucles);
    }
}
