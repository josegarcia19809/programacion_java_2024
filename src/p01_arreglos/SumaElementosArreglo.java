package p01_Arreglos;

import java.util.Scanner;

public class SumaElementosArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] temperaturas = new int[8];
        int total = 0;
        double promedio;

        for (int i = 0; i < 8; i++) {
            System.out.print("Dame el valor " + (i + 1) + ": ");
            temperaturas[i] = entrada.nextInt();
            total = total + temperaturas[i];
        }
        System.out.println();
        System.out.println("-".repeat(100));

        System.out.println("Las temperaturas son:");
        for (int temperatura : temperaturas) {
            System.out.print(temperatura + " ");
        }

        promedio = total / 8.0;
        System.out.println("El promedio es: " + promedio);
    }
}
