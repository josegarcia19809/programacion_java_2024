package p01_arreglos;

import java.util.Scanner;

public class ArregloTemperaturasDemo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int DIAS = 3;
        double[] temperaturas = new double[DIAS];

        System.out.println("Temperaturas");

        System.out.print("Día 1: ");
        temperaturas[0] = entrada.nextDouble();

        System.out.print("Día 2: ");
        temperaturas[1] = entrada.nextDouble();

        System.out.print("Día 3: ");
        temperaturas[2] = entrada.nextDouble();

        System.out.println("Las temperaturas que has ingresado son");

        System.out.println("Día 1: " + temperaturas[0]);
        System.out.println("Día 2: " + temperaturas[1]);
        System.out.println("Día 3: " + temperaturas[2]);
    }
}
