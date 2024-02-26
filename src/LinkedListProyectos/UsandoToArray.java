package LinkedListProyectos;

import java.util.Arrays;
import java.util.LinkedList;

public class UsandoToArray {
    public static void main(String[] args) {
        String[] colores = {"amarillo", "azul", "negro"};
        // Convertir el arreglo colores a un LinkedList
        LinkedList<String> listaColores =
                new LinkedList<>(Arrays.asList(colores));

        System.out.println("listaColores");
        listaColores.forEach(color -> {
            System.out.print(color + " ");
        });

        // Convertir el LinkedList a un arreglo
        String[] ArregloColores =
                listaColores.toArray(new String[listaColores.size()]);

        // Imprimir ArregloColores // imprimirArregloColores
        imprimirArregloColores(ArregloColores);
    }

    public static void imprimirArregloColores(String[] arreglo) {
        System.out.println();
        for (String color : arreglo) {
            System.out.print(color + " ");
        }
    }
}
