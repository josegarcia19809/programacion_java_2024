package p01_arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa elaborado por José L. García M
 * Fecha: 27 de marzo de 2025
 * Este programa suma el total de ventas de un negocio durante una semana en
 * la tienda ElectroHogar
 */
public class VentasDiarias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int DIAS = 7;
        double[] ventas = new double[DIAS];

        // Pedir las ventas de cada día
        double totalVentas = 0;
        System.out.println("Dame ventas de cada día");
        for (int i = 0; i < DIAS; i++) {
            System.out.print("Día #" + (i + 1) + ": ");
            ventas[i] = entrada.nextDouble();
            totalVentas = totalVentas + ventas[i];
        }

        // Sacar el mínimo y el máximo
        double minimo = Arrays.stream(ventas).min().getAsDouble();
        double maximo = Arrays.stream(ventas).max().getAsDouble();
        System.out.printf("Venta mínima $%.2f%n", minimo);
        System.out.printf("Venta Máxima $%.2f%n", maximo);
        System.out.printf("Total de ventas $%.2f%n", totalVentas);
    }
}
