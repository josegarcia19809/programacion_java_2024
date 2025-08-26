package p00_fundamentos;

import java.util.Scanner;

/*
 * Programa para calcular el número de calorías consumidas a partir del número
 * de galletas que se comieron
 * */
public class CaloriasConsumidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántas galletas consumiste?: ");
        int galletasConsumidas = entrada.nextInt();

        double caloriasPorGalleta = (300 * 10) / 40.0;

        double caloriasConsumidas = caloriasPorGalleta * galletasConsumidas;

        System.out.println("Consumiste " + caloriasConsumidas + " calorías");
    }
}

