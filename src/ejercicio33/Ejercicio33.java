package ejercicio33;

import java.time.LocalDateTime;

public class Ejercicio33 {

    public void encender() throws InterruptedException {
        int hora = LocalDateTime.now().getHour();
        int minutos = LocalDateTime.now().getMinute();
        int segundos = LocalDateTime.now().getSecond();
        int l = 0;

        while(l < 100){
            System.out.printf("%02d", hora);
            System.out.printf(":" + "%02d", minutos);
            System.out.printf(":" + "%02d", segundos);
            System.out.println("");
            Thread.sleep(1000);
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    hora ++;
                    minutos = 0;
                }
            }
            l++;
        }
    }
}

//Esto es menos optimo
//Otra forma es NO trabajar con variables, sino llamar directamente a los LocalDateTime.now().get....() con un Thread.sleep(1000);
//        int i = 0;
//        while (i < 100) {
//        Thread.sleep(1000);
//        System.out.printf("%02d", LocalDateTime.now().getHour());
//        System.out.printf(":" + "%02d", LocalDateTime.now().getMinute());
//        System.out.printf(":" + "%02d", LocalDateTime.now().getSecond());
//        System.out.println("");
//        i++;
//        }
