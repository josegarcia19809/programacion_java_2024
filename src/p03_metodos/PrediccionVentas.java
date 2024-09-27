package p03_metodos;

/*
 * La división de ventas Este genera el 60% de las ventas
 * La división de ventas Oeste genera el 20% de las ventas
 * La división de ventas Norte genera el 10% de las ventas
 * La división de ventas Sur genera el 10% de las ventas
 * Basandose en esos porcentajes escribe 4 métodos que muestren lo que venderá
 * cada división este año. Se proyecta una venta total de $200,000
 * Escribe 4 métodos, cada métod0 mostrará las ventas de cada división.
 * */
public class PrediccionVentas {
    public static void main(String[] args) {
        double ventasTotales = 200000;
        System.out.printf("La predicción de ventas de este año: %.2f\n", ventasTotales);
        System.out.println("Mostrando predicción de ventas de cada división");
        calcularVentasEste();
        calcularVentasOeste();
        calcularVentasNorte();
        calcularVentasSur();
    }

    public static void calcularVentasEste() {
        double ventasTotales = 200000;
        double ventasEste = ventasTotales * (60 / 100.00);
        System.out.println("Ventas Este: " + ventasEste);
    }

    public static void calcularVentasOeste() {
        double ventasTotales = 200000;
        double ventasOeste = ventasTotales * (20 / 100.00);
        System.out.println("Ventas Oeste: " + ventasOeste);
    }

    public static void calcularVentasNorte() {
        double ventasTotales = 200000;
        double ventasNorte = ventasTotales * (10 / 100.00);
        System.out.println("Ventas Norte: " + ventasNorte);
    }

    public static void calcularVentasSur() {
        double ventasTotales = 200000;
        double ventasSur = ventasTotales * (10 / 100.00);
        System.out.println("Ventas Sur: " + ventasSur);
    }
}
