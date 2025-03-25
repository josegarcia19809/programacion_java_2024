package p01_arreglos;

import java.util.Scanner;

public class ArregloCalificacionesDemo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int ESTUDIANTES = 3;
        int[] calificaciones = new int[ESTUDIANTES];
        System.out.println("Ingresa las calificaciones de los " + ESTUDIANTES +
                " estudiantes");
        for (int i = 0; i < ESTUDIANTES; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = entrada.nextInt();
        }

        System.out.println("Las calificaciones que ingresaste son: ");
        for (int i = 0; i < ESTUDIANTES; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
    }
}
