package p01_arreglos;

import java.util.Scanner;

public class TrabajandoConArreglos {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        pedirValores(numeros);
        mostrarArreglo(numeros);
        System.out.println("\n"+"-".repeat(100));
    }

    public static void pedirValores(int[] arreglo) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los valores para el arreglo de tamaño " +
                arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        System.out.println("Mostrando valores: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "\t");
        }
    }
}
