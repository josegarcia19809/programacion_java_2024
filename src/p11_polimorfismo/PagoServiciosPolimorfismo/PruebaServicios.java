package p11_polimorfismo.PagoServiciosPolimorfismo;

public class PruebaServicios {
    public static void imprimirLinea() {
        System.out.println("-".repeat(100));
    }

    public static void main(String[] args) {
        ServicioElectricidad servicioElectricidad = new ServicioElectricidad("Luz", 150, 1.25);
        ServicioGas servicioGas = new ServicioGas("Gas", 50, 0.95);
        ServicioAgua servicioAgua = new ServicioAgua("Agua", 30, 0.85);

        imprimirLinea();
        System.out.println(servicioElectricidad);
        System.out.println(servicioAgua);
        System.out.println(servicioGas);
        imprimirLinea();
    }
}
