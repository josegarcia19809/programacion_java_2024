package p01_arreglos;

import java.util.Scanner;

public class ArregloTemperaturasDemo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int DIAS = 3;

        System.out.println("Temperaturas");
        double[] temperaturas = new double[DIAS];
        for (int i = 0; i < DIAS; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            temperaturas[i] = entrada.nextDouble();
        }

        System.out.println("Temperaturas ingresadas");
        for (int i = 0; i < DIAS; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i]);
        }
    }
}
