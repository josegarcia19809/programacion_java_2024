package p07_Colecciones;

import java.util.*;

// Uso de un objeto HashSet para eliminar valores duplicados de un arreglo de cadenas
public class PruebaSet {
    public static void main(String[] args) {
        String[] colores = {"rojo", "blanco", "azul", "verde", "gris", "naranja", "carne",
                "blanco", "cyan", "durazno", "gris", "naranja"};
        List<String> listaColores = Arrays.asList(colores);
        System.out.printf("Lista: %s%n", listaColores);
        imprimirSinDuplicados(listaColores);
    }

    // Crea un objeto set a partir de un objeto Collection para eliminar duplicados
    public static void imprimirSinDuplicados(Collection<String> valores) {
        Set<String> conjuntoColores = new HashSet<>(valores);
        System.out.println("\nLos valores sin duplicados son:");
        for (String color : conjuntoColores) {
            System.out.printf("%s ", color);
        }
        System.out.println();
    }
}
