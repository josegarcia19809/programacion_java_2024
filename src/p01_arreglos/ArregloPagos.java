package p01_arreglos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ArregloPagos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Crear un objeto DecimalFormat para
        // formatear números
        DecimalFormat dollar =
                new DecimalFormat("#,##0.00");
        final int EMPLEADOS = 5;
        int[] horas = new int[EMPLEADOS];

        // Pedir las horas trabajadas para cada empleado
        System.out.println("Introduce las horas " +
                "trabajadas de los " + EMPLEADOS +
                " empleados\nquienes ganan lo mismo " +
                "por cada hora trabajada");
        for (int i = 0; i < EMPLEADOS; i++) {
            System.out.print("Empleado " + (i + 1) + ": ");
            horas[i] = entrada.nextInt();
        }

        // Pedir la tarifa de pago por cada hora trabajada
        System.out.print("Introduce cuánto ganan por " +
                "hora los empleados: ");
        double pagoHora = entrada.nextDouble();

        for (int i = 0; i < EMPLEADOS; i++) {
            double sueldoBruto = horas[i] * pagoHora;
            System.out.println("Empleado #" + (i + 1) +
                    " gana $" + dollar.format(sueldoBruto));
        }
    }
}
