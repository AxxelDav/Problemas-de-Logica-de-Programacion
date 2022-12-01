package ejercicio36;

public class Ejercicio36 {

    public void cuentaLetras(String texto){
        int consonantes = 0;
        int vocales = 0;

        for(String letra: texto.toLowerCase().split("")){
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
                vocales++;
            }
            else consonantes++;
        }
        System.out.println("Consonantes: " + consonantes);
        System.out.println("Vocales: " + vocales);
    }

}
