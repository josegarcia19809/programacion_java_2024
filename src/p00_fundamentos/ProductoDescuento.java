package p00_fundamentos;

import java.util.Scanner;

public class ProductoDescuento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int porcentajeDescuento = 10;
        System.out.print("Dame el precio del producto: ");
        double precioInicial = entrada.nextDouble();
        double precioConDescuento = precioInicial - (precioInicial * porcentajeDescuento / 100);
        System.out.println("El precio con descuento es:" + precioConDescuento);
    }
}
