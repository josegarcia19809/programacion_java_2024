package p00_fundamentos;

import java.util.Scanner;

public class PizzaPI {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.println("🍕Pizza Pi");
        System.out.print("Dime el diámetro de la pizza en pulgadas: ");
        double diametro = entrada.nextDouble();

        double radio = diametro / 2.0;

        // Área = π * r²
        double area = PI * Math.pow(radio, 2.0);

        double rebanadas = area / 14.125;

        System.out.printf("Rebanadas: %.1f", rebanadas);

    }
}
