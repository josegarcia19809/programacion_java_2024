package p00_fundamentos;

import java.util.Scanner;

public class OcupacionHotelera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ocupación Hotelera");

        System.out.print("¿Cuántos pisos tiene? ");
        int pisos = entrada.nextInt();

        if (pisos < 1) {
            System.out.println("Número no válido");
            System.out.println("Ejecutar nuevamente");
            return;
        }

        int totalHabitaciones = 0;
        int totalOcupadas = 0;
        for (int i = 1; i <= pisos; i++) {
            System.out.println();

            System.out.print("Habitaciones del piso #" + i + ": ");
            int habitaciones = entrada.nextInt();
            totalHabitaciones += habitaciones;

            System.out.print("¿Habitaciones ocupadas? ");
            int ocupadas = entrada.nextInt();
            totalOcupadas += ocupadas;
        }
        int totalDesocupadas = totalHabitaciones - totalOcupadas;

        double porcentajeOcupacion = (double) totalOcupadas / (double) totalHabitaciones
                * 100.0;
        System.out.println();
        System.out.println("Habitaciones: " + totalHabitaciones);
        System.out.println("Ocupadas: " + totalOcupadas);
        System.out.println("Desocupadas: " + totalDesocupadas);
        System.out.printf("Porcentaje ocupadas: %.2f%%", porcentajeOcupacion);
    }
}
