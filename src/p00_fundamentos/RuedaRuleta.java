package p01_fundamentos;

import java.util.Scanner;

public class RuedaRuleta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Colores rueda ruleta");
        System.out.print("Dame número de casilla: ");
        int casilla = entrada.nextInt();

        // Validar que la casilla esté en el rango 0-36
        if (casilla < 0 || casilla > 36) {
            System.out.println("Casilla fuera de rango");
            return;
        }

        // Comprobar el color
        if (casilla == 0) {
            System.out.println("Verde");
        } else if (casilla >= 1 && casilla <= 10) {
            if (casilla % 2 == 0) {
                System.out.println("Negra");
            } else {
                System.out.println("Roja");
            }
        } else if (casilla >= 11 && casilla <= 18) {
            if (casilla % 2 == 1) {
                System.out.println("Negra");
            } else {
                System.out.println("Roja");
            }
        } else if (casilla >= 19 && casilla <= 28) {
            if (casilla % 2 == 0) {
                System.out.println("Negra");
            } else {
                System.out.println("Roja");
            }
        } else if (casilla >= 29 && casilla <= 36) {
            String color = casilla % 2 == 1 ? "Negra" : "Roja";
            System.out.println(color);
        }
    }
}
