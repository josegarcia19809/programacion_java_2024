package p00_fundamentos;

import java.util.Scanner;

public class OcupacionEstacionamiento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ocupacion Estacionamiento");

        System.out.print("Ingresa número de niveles: ");
        int niveles = entrada.nextInt();

        if (niveles < 1) {
            System.out.println("Numero no válido de niveles");
            System.out.println("Ejecutar nuevamente...");
            return;
        }
        int totalEspacios = 0;
        int totalOcupados = 0;

        for (int i = 1; i <= niveles; i++) {
            System.out.println();
            System.out.print("¿Cuántos espacios hay en el nivel #" + i + "? ");
            int espacios = entrada.nextInt();
            totalEspacios += espacios;

            System.out.print("¿Cuántos hay ocupados? ");
            int ocupados = entrada.nextInt();
            totalOcupados += ocupados;

        }
        System.out.println();
        System.out.println("Existen " + totalEspacios + " espacios");
        System.out.println(totalOcupados + " lugares están ocupados.");
        int totalDesocupados = totalEspacios - totalOcupados;

        System.out.println(totalDesocupados + " lugares están desocupados.");

        double porcentaje = (double) totalOcupados / (double) totalEspacios * 100.00;
        System.out.printf("Porcentaje de ocupación: %.2f%%", porcentaje);
        System.out.println();
        System.out.println("-".repeat(100));
    }
}
