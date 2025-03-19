package p00_fundamentos;

public class ForNumerosAlCuadrado {
    public static void main(String[] args) {
        final int MINIMO = 1;
        final int MAXIMO = 10;

        System.out.println("Número\t\tCuadrado");
        System.out.println("-".repeat(20));
        for (int numero = MINIMO; numero <= MAXIMO; numero++) {
            int cuadrado = numero * numero;
            System.out.println(numero + "\t\t\t" + cuadrado);
        }
    }
}
