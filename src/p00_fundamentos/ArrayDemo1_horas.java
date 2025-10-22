package p00_fundamentos;

import java.util.Scanner;

public class ArrayDemo1_horas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int EMPLEADOS = 3;
        int[] horas = new int[EMPLEADOS];

        System.out.println("Ingresa las horas trabajadas de los " + EMPLEADOS + " empleados");

        System.out.print("Empleado 1: ");
        horas[0] = entrada.nextInt();

        System.out.print("Empleado 2: ");
        horas[1] = entrada.nextInt();

        System.out.print("Empleado 3: ");
        horas[2] = entrada.nextInt();

        System.out.println("Las horas que ingresaste son: ");
        System.out.println(horas[0]);
        System.out.println(horas[1]);
        System.out.println(horas[2]);
    }
}
