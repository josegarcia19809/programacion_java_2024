package p00_fundamentos;

import java.util.Scanner;

public class CaloriasGalleta {
    public static void estaEnRiesgo() {
        System.out.println("Cuidate, ya casi ☠️");
    }

    public static void noEstaEnRiesgo() {
        System.out.println("Todo bien 👍🏼");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double CALORIAS_POR_GALLETA = 75.0;

        System.out.println("Calorías por galleta 🍪🔥");

        System.out.print("¿Cuántas galletas te comiste? ");
        int galletas = entrada.nextInt();

        double caloriasConsumidas = galletas * CALORIAS_POR_GALLETA;

        System.out.println("Calorías consumidas " +
                caloriasConsumidas);

        if (caloriasConsumidas > 500) {
            estaEnRiesgo();
        } else {
            noEstaEnRiesgo();
        }
    }
}
