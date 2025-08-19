package p00_fundamentos;

import java.util.Scanner;

public class FacturaRestaurante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cargo, impuesto, propina, total;
        System.out.println("***************Factura del restaurante*****************");

        System.out.print("Dame el cargo por la comida: ");
        cargo = entrada.nextDouble();

        impuesto = cargo * (8.0 / 100);
        propina = (cargo + impuesto) * (18.0 / 100);
        total = cargo + impuesto + propina;

        System.out.println("El cargo por la comida es " + cargo);
        System.out.println("El monto del impuesto es " + impuesto);
        System.out.println("El monto de la propina es " + propina);
        System.out.println("El monto total es " + total);
    }
}

