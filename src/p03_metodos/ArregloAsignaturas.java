package p03_metodos;

import java.util.Scanner;

public class ArregloAsignaturas {
    // Llenar un arreglo y devolverlo
    public static String[] llenarArreglo() {
        Scanner entrada = new Scanner(System.in);
        String[] asignaturasLista = new String[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Dame asignatura " + (i + 1) + ": ");
            asignaturasLista[i] = entrada.nextLine();
        }
        return asignaturasLista;
    }

    // Imprimir un arreglo que se recibe como parámetro
    public static void imprimirArreglo(String[] listaAsignaturas) {
        System.out.println();
        System.out.println("-".repeat(100));
        System.out.println("Asignaturas:\n");
        for (String asignatura : listaAsignaturas) {
            System.out.println(asignatura);
        }
    }

    // Main. Declara un arreglo que se llamará asignaturas, usará los métodos anteriores
    public static void main(String[] args) {
        String[] asignaturas;
        asignaturas = llenarArreglo();
        imprimirArreglo(asignaturas);
    }
}
