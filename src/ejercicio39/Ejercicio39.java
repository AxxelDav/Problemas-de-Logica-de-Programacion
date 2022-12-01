package ejercicio39;

public class Ejercicio39 {

    public boolean comprobarEmail(String mail) {
        return mail.contains("@") &&
               mail.contains(".") &&
               mail.indexOf(".") - mail.indexOf("@") > 2;
    }
}
