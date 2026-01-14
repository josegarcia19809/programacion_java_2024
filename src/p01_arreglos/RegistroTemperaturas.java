package p01_arreglos;

import java.util.Scanner;

public class RegistroTemperaturas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] temperaturas = new int[8];
        int total = 0;

        // Pedir las 8 temperaturas
        for (int i = 0; i < 8; i++) {
            System.out.print("Dame la temperatura #" + (i + 1) + ": ");
            temperaturas[i] = entrada.nextInt();

            total = total + temperaturas[i];
        }
        System.out.println();
        System.out.println("-".repeat(100));

        // Mostrar las temperaturas
        System.out.println("Las temperaturas son: ");
        for (int temperatura : temperaturas) {
            System.out.print(" " + temperatura);
        }
        // Calcular el promedio
        double promedio = total / 8.0;
        // Mostrar el promedio
        System.out.println();
        System.out.printf("Promedio: %.2f", promedio);
        // DATOS DE PRUEBA: 4, 5, 6, 7, 8, 9, 8, 7
        // PROMEDIO: 6.75

    }
}
