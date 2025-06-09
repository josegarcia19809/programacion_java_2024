package p11_polimorfismo.PagoServiciosPolimorfismo;


public class ServiciosGrupo {
    public static void imprimirLinea() {
        System.out.println("-".repeat(100));
    }

    public static void main(String[] args) {

        String[] nombres = {
                "A.A.L.",
                "A.H.K.",
                "B.T.J.F.",
                "C.C.M.P.",
                "C.R.M.",
                "C.B.M.",
                "C.B.H.",
                "C.E.A.",
                "C.G.M.",
                "D.L.C.V.N.",
                "F.M.G.",
                "F.C.G.",
                "F.D.R.E.",
                "G.M.Y.",
                "G.S.D.C.",
                "G.C.K.",
                "H.A.D.",
                "H.M.B.",
                "M.H.J.M.",
                "M.M.J.",
                "M.M.E.D.J.",
                "M.M.T.D.J.",
                "M.V.L.",
                "M.S.C.",
                "P.R.B.D.",
                "P.G.V.",
                "R.R.E.",
                "R.H.P.",
                "R.M.A.L.",
                "S.L.J.C.",
                "S.S.A.",
                "S.R.J.",
                "S.G.M.",
                "S.M.S.",
                "T.S.A.A.Y.",
                "T.A.G.",
                "T.N.M."
        };


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
        for (int noLista = 1; noLista <= 37; noLista++) {
            System.out.println();
            System.out.println("---------------------------------" + noLista +
                    " - " + nombres[noLista - 1]);
            double consumo = noLista * 80;
            double tarifaXGB = noLista * 100.0 / 90.0;

            servicioInternet = new ServicioInternet("Internet", consumo, tarifaXGB);

            System.out.println(servicioInternet);
            System.out.println("Porcentaje de Aumento: " + noLista + "%");

            System.out.printf("Total: %,.2f", (total + servicioInternet.calcularPago()));
        }
    }
}
