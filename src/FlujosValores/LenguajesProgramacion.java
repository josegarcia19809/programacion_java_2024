package FlujosValores;

import java.util.stream.Stream;

public class LenguajesProgramacion {
    public static void main(String[] args) {
        // Crear el stream directamente desde una colección
        Stream<String> lenguajes = Stream.of("Java", "C++", "Python", "Go");
        lenguajes.forEach(lenguaje -> System.out.println(lenguaje));
        imprimirLinea();

        // Primero creamos un arreglo y luego lo pasamos a un stream
        String[] arregloLenguajes = {"PHP", "Rust", "R", "Scala"};
        Stream<String> lenguajes2 = Stream.of(arregloLenguajes);
        lenguajes2.forEach(System.out::println);
        imprimirLinea();

        // Forma más simplificada
        String[] arregloMasLenguajes = {"JavaScript", "C", "C#", "Swift", "Kotlin"};
        Stream.of(arregloMasLenguajes)
                .forEach(System.out::println);
        imprimirLinea();

    }

    public static void imprimirLinea() {
        System.out.println("----------------------------------");
    }
}
