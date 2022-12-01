package ejercicio2;

public class Ejercicio2 {

    private String palabra;

    public Ejercicio2(String palabra){
        this.palabra = palabra;
    }

    public Ejercicio2() {
    }

    public boolean esPalindromo() {

        boolean bandera = false;
        for(int i = 0; i<= this.palabra.length()/2; i++){
            int cont1 = 0;
            int cont2 = this.palabra.length()-1;
            char letra = this.palabra.charAt(cont1);
            char letra2 = this.palabra.charAt(cont2);

            if(this.palabra.charAt(cont1) == this.palabra.charAt(cont2)){
                bandera = true;
            } else{
                bandera= false;
            }
            cont1++;
            cont2--;
        }
        return bandera;
    }

}

//Una solución MEJOR es dar vuelta toda la palabra y compararla con la original.
//String palabra = "MannaM";
//    String palabra2;
//
//    StringBuilder p = new StringBuilder(palabra);
//        palabra2 = p.reverse().toString();
//                System.out.println("¿Es Palindromo?: " + (palabra.equals(palabra2) ? "Si" : "No"));