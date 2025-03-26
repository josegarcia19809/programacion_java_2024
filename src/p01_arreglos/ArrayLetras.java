package p01_arreglos;

// Este programa muestra los valores guardados en un arreglo de 4 elementos

import java.util.Scanner;

public class ArrayLetras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int CANTIDAD_LETRAS = 4; // Número de letras a almacenar

        char[] letras = new char[CANTIDAD_LETRAS]; // Arreglo de caracteres

        System.out.println("Ingresa " + CANTIDAD_LETRAS + " letras:");

        // Leer las letras ingresadas por el usuario
        for (int i = 0; i < CANTIDAD_LETRAS; i++) {
            System.out.print("Letra " + (i + 1) + ": ");
            letras[i] = entrada.next().charAt(0);
        }

        // Mostrar los valores almacenados
        System.out.println("\nLas letras ingresadas son:");
        for (int i = 0; i < CANTIDAD_LETRAS; i++) {
            System.out.println("Letra " + (i + 1) + ": " + letras[i]);
        }

        entrada.close();
    }
}

