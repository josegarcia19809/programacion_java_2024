package p01_arreglos;

import java.util.stream.IntStream;

public class SeguimientoPasos {
    public static void main(String[] args) {

        int[] pasosPorDia = {500, 1000, 200, 300, 12, 1500, 500};

        int totalPasos = 0;
        for (int pasos : pasosPorDia) {
            totalPasos = totalPasos + pasos;
        }
        System.out.println("Total de pasos: " + totalPasos);
        double promedioPasos = totalPasos / 7.0;
        System.out.printf("Promedio: %.1f%n", promedioPasos);

        // Para sacar el indice donde se tenga el valor máximo usando stream
        int indiceMaximo = IntStream
                .range(0, pasosPorDia.length)
                .reduce((i, j) -> pasosPorDia[i] >= pasosPorDia[j] ? i : j)
                .orElse(-1);

        System.out.println();

        String[] diasSemana = {"domingo", "lunes", "martes", "miércoles", "jueves",
                "viernes", "sábado"};

        System.out.println("Día de mayor cantidad de pasos: " + diasSemana[indiceMaximo]);
    }
}
