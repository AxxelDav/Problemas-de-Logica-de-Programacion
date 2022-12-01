package ejercicio12;

public class Ejercicio12 {

    public void hastaCero(int num){
        System.out.println("--- Del " + num + " al 0");
        for (int i = num; i>=0; i-=8){
            System.out.println("- n°" + i);
        }
        System.out.println("--- FIN ---");
    }
}
