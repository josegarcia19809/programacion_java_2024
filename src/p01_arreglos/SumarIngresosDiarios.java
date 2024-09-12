package p01_arreglos;

public class SumarIngresosDiarios {
    public static void main(String[] args) {
        double[] ventasDiarias = {500.00, 750.00, 600.00, 900.00, 100.00, 300.00, 1000.0};
        double totalVentasDiarias = sumarVentas(ventasDiarias);
        System.out.println("El total de ventas es " + totalVentasDiarias);
        System.out.println("\n" + "-".repeat(100));
    }

    public static double sumarVentas(double[] ventas) {
        double totalVentas = 0;
        for (double venta : ventas) {
            totalVentas = totalVentas + venta;
        }
        return totalVentas;
    }
}
