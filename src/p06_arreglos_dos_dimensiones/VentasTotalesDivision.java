package p06_arreglos_dos_dimensiones;

import java.util.Scanner;

public class VentasTotalesDivision {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int DIVISIONES = 3;
        final int TRIMESTRES = 4;

        double ventasTotales = 0;
        double[][] ventas = new double[DIVISIONES][TRIMESTRES];

        System.out.println("Programa para calcular total de ventas de una empresa " +
                "con 3 divisiones");
        for (int i = 0; i < DIVISIONES; i++) {
            for (int j = 0; j < TRIMESTRES; j++) {
                System.out.printf("Dame ventas de la division %d del trimeste %d $: ",
                        (i + 1), (j + 1));
                ventas[i][j] = entrada.nextDouble();
            }
        }

        // Calcular la venta total de todas las divisiones
        for (int i = 0; i < DIVISIONES; i++) {
            for (int j = 0; j < TRIMESTRES; j++) {
                ventasTotales = ventasTotales + ventas[i][j];
            }
        }
        System.out.printf("Ventas: $%.2f", ventasTotales);
    }
}
