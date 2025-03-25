package p01_arreglos;

import java.util.Scanner;

public class ArregloCalificacionesDemo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int ESTUDIANTES = 3;
        int[] calificaciones = new int[ESTUDIANTES];
        System.out.println("Ingresa las calificaciones de los " + ESTUDIANTES +
                " estudiantes");

        // Lee las calificaciones de los estudiantes
        System.out.print("Calificación estudiante 1: ");
        calificaciones[0] = entrada.nextInt();

        System.out.print("Calificación estudiante 2: ");
        calificaciones[1] = entrada.nextInt();

        System.out.print("Calificación estudiante 3: ");
        calificaciones[2] = entrada.nextInt();

        // Imprimir las calificaciones
        System.out.println("Las calificaciones que ingresaste son: ");
        System.out.println("Estudiante 1: " + calificaciones[0]);
        System.out.println("Estudiante 2: " + calificaciones[1]);
        System.out.println("Estudiante 3: " + calificaciones[2]);
    }
}
