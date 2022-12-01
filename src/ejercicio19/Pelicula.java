package ejercicio19;

public class Pelicula {
    private String titulo;
    private String autor;
    private boolean vista;

    public Pelicula(String titulo, String autor, boolean vista) {
        this.titulo = titulo;
        this.autor = autor;
        this.vista = vista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }
}
