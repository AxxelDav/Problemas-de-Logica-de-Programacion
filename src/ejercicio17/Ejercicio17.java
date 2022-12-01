package ejercicio17;

public class Ejercicio17 {

    public void buzzLightyear(int num){

        int i = 1;

        while (i<=num){
            esMultiplo(i);
            i++;
        }
    }


    public void esMultiplo(int n){
        if (n%3 == 0 && n%5 != 0){
            System.out.println("buzz");
        }
        else if (n%5 == 0 && n%3 != 0){
            System.out.println("lightyear");
        }
        else if (n%5 == 0 && n%3 == 0){
            System.out.println("BuzzLightyear");
        }
        else {
            System.out.println(n);
        }
    }



}
