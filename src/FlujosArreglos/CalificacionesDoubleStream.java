package FlujosArreglos;

import java.util.stream.DoubleStream;

public class CalificacionesDoubleStream {
    public static void main(String[] args) {
        // Dado el siguiente arreglo de calificaciones
        double[] calificaciones = {3.2, 10.0, 6.7, 5.1, 4.6, 7.8, 8.2, 7.5, 5.8, 8.7};

        // Imprimir las calificaciones originales
        System.out.println("Calificaciones");
        DoubleStream.of(calificaciones)
                .forEach(c -> System.out.printf("%.1f ", c));
        imprimirLinea();

        // Promedio de aquellos que pasaron
        //  10.0, 6.7, 7.8, 8.2, 7.5, 8.7 = 48.9 / 6 = 8.2
        System.out.printf("Promedio de aquellos que pasaron %.1f",
                DoubleStream.of(calificaciones)
                        .filter(c -> c >= 6.0)
                        .average().orElse(0.0));
        imprimirLinea();

        // Número de alumnos reprobados
        System.out.printf("Número de alumnos reprobados %d",
                DoubleStream.of(calificaciones)
                        .filter(c -> c < 6.0)
                        .count());
        imprimirLinea();

        // Calificación máxima de los que están entre 6.0 y 8.0
        System.out.printf("Calificación máxima de los que están entre 6.0 y 8.0: %.1f",
                DoubleStream.of(calificaciones)
                        .filter(c -> c >= 6.0 && c <= 8.0)
                        .max().orElse(0.0));
        imprimirLinea();

        // Calificación mínima de los que están entre 4.0 y 6.0
        System.out.printf("Calificación mínima de los que están entre 4.0 y 6.0: %.1f",
                DoubleStream.of(calificaciones)
                        .filter(c -> c >= 4.0 && c <= 6.0)
                        .min().orElse(0.0));
        imprimirLinea();

        // Sumar un punto a todos y mostrarlos
        DoubleStream.of(calificaciones)
                .map(c -> c + 1)
                .forEach(c -> System.out.print(c + " "));
        imprimirLinea();
    }

    public static void imprimirLinea() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }
}
