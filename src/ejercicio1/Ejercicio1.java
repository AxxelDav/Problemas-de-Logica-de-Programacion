package ejercicio1;

public class Ejercicio1 {
    private int numero;
    private static final int LIMITE = 10;

    public Ejercicio1(int numero) {
        this.numero = numero;
    }

    public void crearTablaMultiplicar(){
        int i = 0;
        while (i <= this.LIMITE){
            System.out.println(this.numero + " x " + i + " = " + (this.numero * i));
            i++;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
