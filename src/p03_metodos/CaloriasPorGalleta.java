package p03_metodos;

import java.util.Scanner;

/*
 * Una bolsa de galletas contiene 40 galletas. La información de la bolsa dice que tiene 10 porciones
 * y que cada porción tiene 300 calorias. Una persona dice que si ha comido más de 500 calorias está en riesgo.
 * Escribir 2 métodos que manden mensajes al respecto
 * estaEnRiesgo()
 * noEstaEnRiesgo()
 * El programa preguntará cuántas galletas ha comido
 * */
public class CaloriasPorGalleta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double caloriasPorGalleta = 75;

        System.out.println("Cuántas galletas te comiste?");
        int galletas = entrada.nextInt();

        double caloriasConsumidas = galletas * caloriasPorGalleta;

        if (caloriasConsumidas > 500) {
            estaEnRiesgo();
        } else {
            noEstaEnRiesgo();
        }

    }

    public static void estaEnRiesgo() {
        System.out.println("Cuidate. Ya casi ☠️");
    }

    public static void noEstaEnRiesgo() {
        System.out.println("Todo bien. 👍🏼");
    }
}
