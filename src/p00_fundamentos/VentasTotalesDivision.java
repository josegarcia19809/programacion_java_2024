package p00_fundamentos;

import java.util.Scanner;

public class VentasTotalesDivision {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int DIVISIONES = 2;
        final int CUATRIMESTRES = 3;

        double[][] ventas = new double[DIVISIONES][CUATRIMESTRES];

        System.out.println("Programa para calcular el total de ventas de una empresa " +
                "con 2 divisiones 💲👨🏼‍💼");
        for (int i = 0; i < DIVISIONES; i++) {
            for (int j = 0; j < CUATRIMESTRES; j++) {
                System.out.printf("Dame ventas de la división %d del cuatrimestre %d $: ",
                        (i + 1), (j + 1));
                ventas[i][j] = entrada.nextDouble();
            }
        }

        // Calcular la venta total de todas las divisiones
        double ventasTotales = 0;
        for (int i = 0; i < DIVISIONES; i++) {
            for (int j = 0; j < CUATRIMESTRES; j++) {
                ventasTotales = ventasTotales + ventas[i][j];
            }
        }

        System.out.printf("Ventas: $%,.2f", ventasTotales);
    }
}
