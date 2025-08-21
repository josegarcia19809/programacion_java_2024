package p00_fundamentos;
/*
 * Este programa pedirá al usuario una cantidad de
 * minutos y mostrará cuántas horas completas hay
 * y cuántos minutos sobran.
 *
 * Ejemplo:
 * Entrada: 130 minutos
 * Salida: 2 horas y 10 minutos
 * */

import java.util.Scanner;

public class HorasCompletas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int minutosTotales;
        System.out.print("Dame minutos totales: ");
        minutosTotales = entrada.nextInt();

        int horasCompletas;
        int minutosSobrantes;

        horasCompletas = minutosTotales / 60;
        minutosSobrantes = minutosTotales % 60;

        System.out.println("Horas completas: " + horasCompletas);
        System.out.println("Minutos sobrantes: " + minutosSobrantes);
    }
}
