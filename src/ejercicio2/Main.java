package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Ejercicio2 palabra1 = new Ejercicio2("oso");
        System.out.println("¿Es Palindromo?: " + (palabra1.esPalindromo() ? "Si" : "No"));
    }
}
