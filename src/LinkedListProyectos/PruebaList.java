package LinkedListProyectos;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PruebaList {
    public static void main(String[] args) {
        // Crear una lista enlazada y agregarle elementos
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("negro");
        lista1.add("amarillo");
        lista1.add("verde");
        lista1.add("azul");
        lista1.add("violeta");
        lista1.add("plateado");

        // Crear otra lista y agregarle elementos
        LinkedList<String> lista2 = new LinkedList<>();
        lista2.add("dorado");
        lista2.add("blanco");
        lista2.add("cafe");
        lista2.add("azul");
        lista2.add("gris");
        lista2.add("plateado");

        // Concatenar las 2 listas
        lista1.addAll(lista2);
        // Libera los recursos de lista2
        lista2 = null;
        // Imprimir lista1
        imprimirLista(lista1);

        // Convierte cada elemento de lista1 a mayúsculas
        convertirCadenasAMayusculas(lista1);
        imprimirLista(lista1);

        System.out.println("Eliminando elementos 4 a 6");
        eliminarElementos(lista1, 4, 7);// elimina los elementos 4 a 6 de la lista
        imprimirLista(lista1);

        imprimirListaInversa(lista1);
    }

    public static void imprimirLista(LinkedList<String> lista) {
        System.out.println("\nLista");
        for (String color : lista) {
            System.out.printf("%s ", color);
        }
        System.out.println();
    }

    public static void convertirCadenasAMayusculas(LinkedList<String> lista) {
        ListIterator<String> iterator = lista.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next();// Obtiene el elemento
            iterator.set(color.toUpperCase());// Convierte a mayúsculas
        }
    }

    // obtener una sublista y utilizar el método clear para eliminar los elementos
    // de la misma
    public static void eliminarElementos(List<String> lista, int inicio, int fin) {
        lista.subList(inicio, fin).clear();// elimina los elementos
    }

    public static void imprimirListaInversa(List<String> lista) {
        ListIterator<String> iterator = lista.listIterator(lista.size());
        System.out.println("Lista inversa");
        // Imprime la lista en orden inverso
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}
