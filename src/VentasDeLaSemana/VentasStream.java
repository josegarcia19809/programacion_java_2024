package VentasDeLaSemana;

import java.util.Random;
import java.util.stream.IntStream;

public class VentasStream {
    public static void main(String[] args) {
        // Semilla para el generador de números aleatorios
        long semilla = 1L;

        // Crear un generador de números aleatorios con la semilla
        Random rand = new Random(semilla);

        // Crear un arreglo de ventas de la semana
        int[] ventasSemana = crearVentasSemana(rand);

        // Imprimir los datos usando un stream
        IntStream.range(0, ventasSemana.length)
                .forEach(i -> System.out.println("Venta " + (i + 1) + ": $" + ventasSemana[i]));

        // Resto del código igual que antes...
    }

    // Método para crear un arreglo de ventas de la semana
    private static int[] crearVentasSemana(Random rand) {
        int[] ventasSemana = new int[7];
        for (int i = 0; i < ventasSemana.length; i++) {
            ventasSemana[i] = rand.nextInt(9000) + 1000; // Generar valores en el rango de $1000 a $9999
        }
        return ventasSemana;
    }
}

