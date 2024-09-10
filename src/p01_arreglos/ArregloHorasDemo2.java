package p01_arreglos;

import java.util.Scanner;

public class ArregloHorasDemo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int EMPLEADOS = 15;
        int[] horas = new int[EMPLEADOS];

        for (int i = 0; i < EMPLEADOS; i++) {
            System.out.print("Ingresa las horas trabajadas " +
                    "del trabajador #" + (i + 1) + ": ");
            horas[i] = teclado.nextInt();
        }

        // Mandar a pantalla
        System.out.println("Horas ingresadas");
        for (int i = 0; i < EMPLEADOS; i++) {
            System.out.println("Trabajador " + (i+1) + ": " +
                    horas[i]);
        }

    }
}
