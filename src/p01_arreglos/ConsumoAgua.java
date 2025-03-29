package p01_arreglos;

/**
 * Programa elaborado por José L. García M
 * Fecha: 27 de marzo de 2025
 * Este programa suma el total de litros consumidos durante una semana en un
 * edificio de AquaVida
 */
public class ConsumoAgua {
    public static void main(String[] args) {
        int[] litros = {300, 500, 700, 600, 100, 400, 250};
        int litrosConsumidos = 0;

        for (int litro : litros) {
            litrosConsumidos = litrosConsumidos + litro;
        }

        // Mostrar total de litros consumidos
        System.out.println("Litros consumidos: " + litrosConsumidos);

        // Sacar el promedio y mostrarlo
        int dias = litros.length;
        double promedioConsumo = (double) litrosConsumidos / dias;
        System.out.printf("Promedio %.2f", promedioConsumo);
    }
}
