package ejercicio29;

public class Enunciado29 {

    public boolean capicua(Integer num) {
        String test = num.toString();
        StringBuilder prueba = new StringBuilder(test);
        String nuevo = prueba.reverse().toString();

        return prueba.reverse().toString().equals(nuevo);

    }
}
