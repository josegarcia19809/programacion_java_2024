package p03_metodos;

import java.util.Scanner;

public class AumentoPrecio {
    public static double calcularPrecioVenta(double costoMayorista, int porcentajeAumento) {
        double cantidadAAumentar = costoMayorista * porcentajeAumento / 100.0;
        double precioVentaMinorista = costoMayorista + cantidadAAumentar;
        return precioVentaMinorista;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Venta de producto");

        System.out.print("Dame costo mayorista: ");
        double costoMayorista = entrada.nextDouble();

        System.out.print("Dame porcentaje de aumento: ");
        int porcentajeAumento = entrada.nextInt();

        double costoMinorista = calcularPrecioVenta(costoMayorista, porcentajeAumento);

        System.out.println("El costo minorista es de " + costoMinorista);
    }
}
