package p01_arreglos;



/*
 * El siguiente programa calcula las ventas totales de una empresa durante un periodo de tiempo
 * especificado por el usuario (días).
 * Lee las cifras diarias y las guarda en un arreglo. Se va acumulando la venta total en una variable.
 * Al final se muestra el total y las ventas de cada día.
 * */

import java.util.Scanner;

public class ArregloVentasTotales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dias;
        double[] ventas;

        double ventasTotales = 0;

        System.out.print("¿De cuántos días tienes ventas? ");
        dias = entrada.nextInt();

        ventas = new double[dias];

        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Dame venta #" + (i + 1) + ": ");
            ventas[i] = entrada.nextDouble();
            ventasTotales += ventas[i];
        }
        System.out.println();

        System.out.println("-".repeat(100));

        System.out.println("Las ventas fueron: ");
        for (double venta : ventas) {
            System.out.print(venta + " ");
        }
        System.out.println();

        System.out.println("-".repeat(100));

        System.out.println("Ventas totales: " + ventasTotales);
    }
}
