package p00_fundamentos;

import java.util.Scanner;

public class VentasTotalesFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para calcular ventas del negocio");

        System.out.print("¿De cuántos días tienes cifras de ventas? ");
        int dias = entrada.nextInt();

        double totalVentas = 0.0;
        for (int i = 1; i <= dias; i++) {
            System.out.printf("Dame ventas del día #%d: ", i);
            double ventas = entrada.nextDouble();

            totalVentas = totalVentas + ventas;
        }
        // Mostrar el total de ventas en formato de pesos
        System.out.printf("Total de ventas: %.2f", totalVentas);
    }
}
