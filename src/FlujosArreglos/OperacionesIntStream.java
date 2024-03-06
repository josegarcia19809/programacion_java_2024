package FlujosArreglos;

import java.util.stream.IntStream;

public class OperacionesIntStream {
    public static void main(String[] args) {
        int[] valores = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        // Mostrar los valores originales
        IntStream.of(valores)
                .forEach(valor -> System.out.printf("%d ", valor));
        imprimirLinea();

        // Obtener la cantidad de elementos
        System.out.printf("Cuenta: %d",
                IntStream.of(valores).count());
        imprimirLinea();

        // Obtener el valor mínimo
        System.out.printf("Mínimo: %d",
                IntStream.of(valores).min().getAsInt());
        imprimirLinea();

        // Obtener el valor máximo
        System.out.printf("Máximo: %d",
                IntStream.of(valores).max().getAsInt());
        imprimirLinea();

        // Obtener la suma de todos los elementos
        System.out.printf("Suma: %d",
                IntStream.of(valores).sum());
        imprimirLinea();

        //Obtener el promedio
        System.out.printf("Promedio: %.2f",
                IntStream.of(valores)
                        .average().getAsDouble());
        imprimirLinea();

        // Suma de todos los valores usando el método reduce
        System.out.printf("Suma mediante reduce: %d",
                IntStream.of(valores)
                        .reduce(0, (x, y) -> x + y)
        );
        imprimirLinea();

        // Suma de todos los cuadrados de los valores con el método reduce 9 + 100 + 36 +...
        System.out.printf("Suma de los cuadrados mediante reduce: %d",
                IntStream.of(valores)
                        .reduce(0, (x, y) -> x + y * y)
        );
        imprimirLinea();

        // Producto de los valores con el método reduce
        System.out.printf("Producto de los valores con el método reduce: %d",
                IntStream.of(valores)
                        .reduce(1, (x, y) -> x * y)
        );
        imprimirLinea();

        // Valores pares mostrados en orden
        System.out.println("Valores pares mostrados en orden:");
        IntStream.of(valores)
                .filter(valor -> valor % 2 == 0)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        imprimirLinea();

        // Valores impares multiplicados por 10 y mostrados en orden
        System.out.println("Valores impares multiplicados por 10 y mostrados en orden:");
        IntStream.of(valores)
                .filter(valor -> valor % 2 == 1)
                .map(valor -> valor * 10)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        imprimirLinea();

        // Suma el rango de enteros del 1 al 10, exclusivo
        System.out.printf("Suma el rango de enteros del 1 al 9: %d", IntStream.range(1, 10).sum());
        imprimirLinea();

        // Suma el rango de enteros del 1 al 10, inclusivo
        System.out.printf("Suma el rango de enteros del 1 al 10: %d", IntStream.rangeClosed(1, 10).sum());
        imprimirLinea();

    }

    public static void imprimirLinea() {
        System.out.println();
        System.out.println("----------------------------------");
    }
}
