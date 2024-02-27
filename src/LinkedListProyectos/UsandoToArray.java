package LinkedListProyectos;

import java.util.Arrays;
import java.util.LinkedList;

// Ver arreglos como objetos List y convertir objetos List en arreglos.
public class UsandoToArray {
    public static void main(String[] args) {
        String[] colores = {"negro", "azul", "amarillo"};
        // Convertir el arreglo colores a un LinkedList
        LinkedList<String> listaColores = new LinkedList<>(Arrays.asList(colores));

        // Agregando elementos
        listaColores.addLast("rojo"); // Lo agrega como último elemento
        listaColores.add("rosa"); // lo agrega al final
        listaColores.add(3, "verde"); // lo agrega en el 3er índice
        listaColores.addFirst("cyan"); // lo agrega como primer elemento

        // === Iterar sobre el LinkedList usando Java 8 forEach y lambda ===
        System.out.println("Valores del LinkedList listaColores: ");
        listaColores.forEach(color -> {
            System.out.print(color + " ");
        });

        // Convertir el LinkedList a un arreglo
        String[] ArregloColores = listaColores.toArray(new String[listaColores.size()]);

        // Crear una función que se llame imprimirArregloColores y pasarle el arreglo
        System.out.println("\n");
        System.out.println("Valores del arreglo ArregloColores:");
        imprimirArregloColores(ArregloColores);
    }

    public static void imprimirArregloColores(String[] arreglo) {
        for (String color : arreglo) {
            System.out.print(color + " ");
        }
    }
}
