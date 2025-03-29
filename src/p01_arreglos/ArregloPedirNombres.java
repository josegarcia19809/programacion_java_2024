package p01_arreglos;

import java.util.Scanner;

public class ArregloPedirNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int PERSONAS = 4;
        String[] nombres = new String[PERSONAS];

        System.out.println("Ingresa los nombres");
        for (int i = 0; i < PERSONAS; i++) {
            System.out.print("Nombre #" + (i + 1) + ": ");
            nombres[i] = entrada.nextLine();
        }

        // Usar un for mejorado para imprimir los nombres
        System.out.println("Los nombres que ingresaste:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
