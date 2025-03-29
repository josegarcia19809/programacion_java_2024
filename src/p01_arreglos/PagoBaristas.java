package p01_arreglos;

import java.util.Scanner;

/*
 * Elaborado por José L. García M
 * Fecha: jueves 27 de marzo de 2025
 * Este programa calcula el salario total de cada uno de los baristas de Megan
 * */
public class PagoBaristas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int EMPLEADOS = 6;
        int[] horas = new int[EMPLEADOS];

        // Pedir las horas trabajadas de cada empleado
        System.out.println("Horas de los empleados");
        for (int i = 0; i < EMPLEADOS; i++) {
            System.out.print("Empleado #" + (i + 1) + ": ");
            horas[i] = entrada.nextInt();
        }
        System.out.print("Dame pago por hora: ");
        double pagoPorHora = entrada.nextDouble();

        System.out.println("Pagos de los empleados de MEGAN");
        // Calcular el salario de cada trabajador
        for (int i = 0; i < EMPLEADOS; i++) {
            double pagoTotal = horas[i] * pagoPorHora;
            System.out.printf("Pago del empleado %d: $%.2f%n", (i + 1), pagoTotal);
        }
    }
}
