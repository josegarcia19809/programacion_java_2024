package p00_fundamentos;

import java.util.Scanner;

public class PizzaPIComprar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.println("🍕Pizza Pi");
        System.out.print("Dime el diámetro de la pizza en pulgadas: ");
        double diametro = entrada.nextDouble();

        System.out.print("Dime número de invitados: ");
        int invitados = entrada.nextInt();

        double radio = diametro / 2.0;

        // Área = π * r²
        double area = PI * Math.pow(radio, 2.0);

        double rebadasPorPizza = area / 14.125;
        double rebanadasNecesarias = invitados * 4;

        // Calcular el número de pizzas
        double pizzasAComprar = rebanadasNecesarias / rebadasPorPizza;

        System.out.printf("Pizzas a comprar: %.1f", pizzasAComprar);
    }
}
