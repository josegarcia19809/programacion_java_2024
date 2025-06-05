package p11_polimorfismo.PagoServiciosPolimorfismo;

import p11_polimorfismo.PagoEmpleadosPolimorfismo.EmpleadoComision;

public class ServiciosGrupo {
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

        double total = servicioElectricidad.calcularPago() +
                servicioGas.calcularPago() +
                servicioAgua.calcularPago();

        System.out.printf("Total de los primeros 3 servicios: $ %.2f%n", total);

        Servicio servicioInternet;
        for (int noLista = 1; noLista <= 42; noLista++) {
            System.out.println();
            System.out.println("---------------------------------" + noLista);
            double consumo = noLista * 80;
            double tarifaXGB = noLista * 100.0 / 90.0;

            servicioInternet = new ServicioInternet("Internet", consumo, tarifaXGB);

            System.out.println(servicioInternet);
            System.out.println("Porcentaje de Aumento: " + noLista + "%");

            System.out.printf("Total: %,.2f", (total + servicioInternet.calcularPago()));
        }
    }
}
