package p01_arreglos;

import java.util.Scanner;

public class ArrayDemo2_horas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int EMPLEADOS = 3;
        int[] horas = new int[EMPLEADOS];

        System.out.println("Ingresa las horas trabajadas de los " + EMPLEADOS + " empleados");
        for (int i = 0; i < EMPLEADOS; i++) {
            System.out.print("Empleado #" + (i + 1) + ": ");
            horas[i] = entrada.nextInt();
        }

        System.out.println("Las horas trabajadas son:");
        for (int i = 0; i < EMPLEADOS; i++) {
            System.out.println(horas[i]);
        }
    }
}
