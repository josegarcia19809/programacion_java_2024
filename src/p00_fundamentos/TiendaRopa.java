package p00_fundamentos;

import java.util.Scanner;

public class TiendaRopa {

    public static double calcularPrecioConDescuento(double precioOriginal,
                                                    double porcentajeDescuento) {
        double descuento = precioOriginal * (porcentajeDescuento / 100.0);
        double precioConDescuento = precioOriginal - descuento;
        return precioConDescuento;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("👗Tienda de ropa, usada pero no robada👖");

        System.out.print("Dame el precio de la prenda: ");
        double precioPrenda = entrada.nextDouble();

        System.out.print("Dame el porcentaje de descuento: ");
        double porcentajeADescontar = entrada.nextDouble();

        double precioFinalPrenda = calcularPrecioConDescuento(precioPrenda,
                porcentajeADescontar);

        System.out.printf("💲El precio de la prenda con descuento es de $%.2f",
                precioFinalPrenda);
    }
}
