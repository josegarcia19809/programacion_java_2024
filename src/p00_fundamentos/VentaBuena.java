package p00_fundamentos;

import java.util.Scanner;

public class VentaBuena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double ventas, bonificacion = 0;

        System.out.print("Dame el total de ventas de este día: ");
        ventas = entrada.nextDouble();
        if (ventas > 50000) {
            bonificacion = 500;
        }
        System.out.println("Tu bonificación es de " + bonificacion);
    }
}
