package p01_arreglos;

import java.util.Scanner;

/*
 * Este programa muestra los valores guardados en un arreglo
 * de 3 elementos
 * */
public class ArregloHorasDemo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int EMPLEADOS = 3;
        // Estoy creando un arreglo de 3 elementos
        int[] horas = new int[EMPLEADOS];

        System.out.println("Ingresa las horas trabajadas por los " +
                EMPLEADOS + " empleados");

        // Lee las horas trabajadas de los 3 empleados
        System.out.print("Empleado 1: ");
        horas[0] = teclado.nextInt();

        System.out.print("Empleado 2: ");
        horas[1] = teclado.nextInt();

        System.out.print("Empleado 3: ");
        horas[2] = teclado.nextInt();

        // Muestra los valores almacenados
        System.out.println("Las horas que ingresaste son: ");
        System.out.println(horas[0]);
        System.out.println(horas[1]);
        System.out.println(horas[2]);
    }
}
