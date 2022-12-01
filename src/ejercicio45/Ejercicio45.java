package ejercicio45;

import java.util.ArrayList;

public class Ejercicio45 {

    public void notasAlumnos(Alumno[] alumnos) {
        ArrayList<Alumno> aprobados = new ArrayList<>();
        ArrayList<Alumno> desaprobados = new ArrayList<>();

        for (Alumno alumno : alumnos) {
            if (alumno.getNota() >= 7) aprobados.add(alumno);
            else desaprobados.add(alumno);
        }

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos desaprobados: " + desaprobados);
    }
}
