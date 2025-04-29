package p03_metodos;

import java.util.Scanner;

public class DescuentoProducto {

    public static double calcularPrecioConDescuento(double precioProducto, int porcentaje) {
        double cantidadADescontar = precioProducto * (porcentaje / 100.0);
        double precioFinal = precioProducto - cantidadADescontar;
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tienda de ropa");

        System.out.print("Dame precio del producto: ");
        double precioProducto = entrada.nextDouble();

        System.out.print("Dame porcentaje de descuento: ");
        int porcentaje = entrada.nextInt();

        double cantidadAPagar = calcularPrecioConDescuento(precioProducto, porcentaje);
        System.out.println("Cantidad a pagar: " + cantidadAPagar);


    }
}




