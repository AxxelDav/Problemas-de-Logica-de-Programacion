package ejercicio27;

public class Ejercicio27 {

    public void calcularDias(int num){
        int anio=0, mes=0, dia=0;

        if(num/365 > 1){
            anio = num / 365;
            num = num % 365;
        }
        if(num/30<1){
            dia = num;
            }
        else {
            mes = num / 30;
            dia = num % 30;
        }

        System.out.println("Equivale a " + anio + " años, " +
                                           mes + " meses y " +
                                           dia + " dias.");

    }
}


//Logica del Tutor:
//int anios = num/365;
//int dias = num%365;
//int mes = dias/30;
//dias = dias%30;
//
//System.out.println("Equivale a " + anio + " años, " + mes + " meses y " + dia + " dias.");
