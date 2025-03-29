package p01_arreglos;

import java.util.Arrays;

public class OrdenarNombres {
    public static void main(String[] args) {
        String[] nombres = {"Zara", "Pedro", "Ana", "Luis", "Carlos"};
        System.out.println("Orden original:");

        // Usar un for mejorado para imprimir los nombres
        for (String nombre : nombres) {
            System.out.printf("%s%n", nombre);
        }

        Arrays.sort(nombres);

        // Usar un for comun y corriente para imprimir los nombres
        System.out.println("-".repeat(100));
        System.out.println("Nombres ordenados");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
