package p00_fundamentos;

import java.util.Scanner;

public class CuentaRestaurante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuenta de un Restaurante");
        final int PORCENTAJE_PROPINA = 20;

        System.out.print("Dame costo de la comida: ");
        double costoComida = entrada.nextDouble();

        double propina = costoComida * (PORCENTAJE_PROPINA / 100.0);
        double pagoTotal = costoComida + propina;

        System.out.println("Costo comida: " + costoComida);
        System.out.println("Propina: " + propina);
        System.out.println("Pago total: " + pagoTotal);
    }
}
