package p00_fundamentos;

import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("🛒 Tienda en línea - envíos");

        // Pide monto de compra
        System.out.print("Dame monto de compra: ");
        double monto = entrada.nextDouble();

        // Pide si es miembro premium
        System.out.print("Eres miembro premium? (true/false): ");
        boolean esPremium = entrada.nextBoolean();

        // Tendrá envío gratuito?
        if (monto >= 500 && esPremium) {
            System.out.println("✅ Tiene envío gratuito");
        } else {
            System.out.println("❌ No tiene envío gratuito");
        }
        System.out.println(".".repeat(100));
    }
}





