package ejercicio45;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Ejercicio45 ejercicio45 = new Ejercicio45();

        Alumno alumno1 = new Alumno("Drac1", 7);
        Alumno alumno2 = new Alumno("Drac2", 3);
        Alumno alumno3 = new Alumno("Drac3", 9);
        Alumno alumno4 = new Alumno("Drac4", 2);

        Alumno[] alumnos = {alumno1, alumno2, alumno3, alumno4};

        ejercicio45.notasAlumnos(alumnos);


    }
}
