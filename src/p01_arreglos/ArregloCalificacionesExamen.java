package p01_arreglos;

/*
 * Este programa pedirá cuántos exámenes se aplicaron y después creará un arreglo de
 * calificaciones de ese tamaño.
 * Se pedirán las calificaciones y después se mostrarán con un for mejorado.
 * También se usará la librería Arrays
 * */

import java.util.Scanner;
import java.util.Arrays;

public class ArregloCalificacionesExamen {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroExamenes;
        int[] calificaciones;

        System.out.print("¿Cuántos examenes se aplicaron? ");
        numeroExamenes = entrada.nextInt();

        // Crear el arreglo con un tamaño según el número de exámenes
        calificaciones = new int[numeroExamenes];

        // Pedir cada una de las calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Dame la calificacion " + (i + 1) + ": ");
            calificaciones[i] = entrada.nextInt();
        }

        System.out.println("-".repeat(100));
        System.out.println("Las calificaciones de los exámenes son: ");
        for (int calificacion : calificaciones) {
            System.out.print(calificacion + " ");
        }
        System.out.println();
        System.out.println("-".repeat(100));
        System.out.println(Arrays.toString(calificaciones));
    }
}
