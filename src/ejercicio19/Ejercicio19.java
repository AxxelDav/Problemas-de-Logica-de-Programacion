package ejercicio19;

public class Ejercicio19 {

    public void misPeliculas(Pelicula p[]) {
        for (Pelicula movie : p) {
            if(movie.isVista()) System.out.println("Te falta por ver: \"" + movie.getTitulo() + "\" de " + movie.getAutor());
            else System.out.println("Ya has visto: \"" + movie.getTitulo() + "\" de " + movie.getAutor());
        }
    }

}
