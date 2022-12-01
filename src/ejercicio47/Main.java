package ejercicio47;

public class Main {

    public static void main(String[] args) {
        Ejercicio47 ejercicio47 = new Ejercicio47();

        Usuario usuario1 = new Usuario("Lionel", "Informatica");
        Usuario usuario2 = new Usuario("Wayne", "Futbol");
        Usuario usuario3 = new Usuario("Killian", "Videojuegos");
        Usuario usuario4 = new Usuario("Benzema", "Futbol");
        Usuario usuario5 = new Usuario("Guason", "Cine");
        Usuario usuario6 = new Usuario("Peter", "Cine");
        Usuario usuario7 = new Usuario("Hulk", "Informatica");
        Usuario usuario8 = new Usuario("Thor", "Videojuegos");

        Usuario[] usuarios = {usuario1, usuario2, usuario3, usuario4, usuario5, usuario6, usuario7, usuario8};

        ejercicio47.aficiones(usuarios);
    }
}
