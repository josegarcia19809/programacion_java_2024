package p11_polimorfismo.FacturacionRestaurante;

public class RestauranteGrupo {
    public static void main(String[] args) {

        String[] nombres = {
                "A.R.V.",
                "A.R.K.",
                "B.L.K.",
                "B.P.V.",
                "C.D.J.",
                "C.V.A.",
                "C.C.D.A.",
                "C.C.L.A.",
                "D.J.D.J.L.A.",
                "D.E.G.",
                "F.P.M.M.",
                "F.E.M.",
                "F.A.C.",
                "F.R.E.N.",
                "G.C.I.",
                "G.G.Y.",
                "G.S.L.N.",
                "G.V.D.",
                "H.E.V.",
                "H.R.H.M.",
                "I.M.H.",
                "L.A.E.",
                "L.F.R.",
                "M.D.L.C.J.C.",
                "M.M.J.C.",
                "M.M.C.",
                "M.C.C.",
                "M.A.E.",
                "M.R.M.A.",
                "O.F.A.L.",
                "P.S.R.",
                "R.Q.M.D.L.A.",
                "R.G.L.",
                "S.L.J.A.",
                "S.L.R.",
                "S.L.B.K.",
                "T.G.A.",
                "U.D.J.F.M.",
                "V.P.D.E.",
                "V.S.C.Y.",
                "V.S.J.F."
        };


        Plato entrada1 = new Entrada("Ensalada", 5.0, 2.0);
        Plato entrada2 = new Entrada("Sopa de verduras", 4.0, 1.0);
        Plato entrada3 = new Entrada("Pan de ajo", 3.0, 0.50);
        Plato entrada4 = new Entrada("Bruschetta", 6.0, 1.50);

        Plato postre1 = new Postre("Pay de piña", 11.0, 4.0);
        Plato postre2 = new Postre("Tarta de manzana", 6.00, 3.0);

        System.out.printf("%s: $%.2f%n", entrada1.getNombre(),
                entrada1.calcularPrecioFinal());
        System.out.printf("%s: $%.2f%n", entrada2.getNombre(),
                entrada2.calcularPrecioFinal());
        System.out.printf("%s: $%.2f%n", entrada3.getNombre(),
                entrada3.calcularPrecioFinal());
        System.out.printf("%s: $%.2f%n", entrada4.getNombre(),
                entrada4.calcularPrecioFinal());
        System.out.printf("%s: $%.2f%n", postre1.getNombre(),
                postre1.calcularPrecioFinal());
        System.out.printf("%s: $%.2f%n", postre2.getNombre(),
                postre2.calcularPrecioFinal());


        double total = entrada1.calcularPrecioFinal() +
                entrada2.calcularPrecioFinal() +
                entrada3.calcularPrecioFinal() +
                entrada4.calcularPrecioFinal() +
                postre1.calcularPrecioFinal() +
                postre2.calcularPrecioFinal();

        Plato platoPrincipal1;
        for (int noLista = 1; noLista <= 41; noLista++) {
            System.out.println();
            System.out.println("---------------------------------" + noLista+
                    " ----"+ nombres[noLista-1]);
            double precioBase = noLista * 80;

            platoPrincipal1 = new PlatoPrincipal("Filete de res", precioBase,
                    noLista);

            System.out.printf("%s: $%.2f%n", platoPrincipal1.getNombre(),
                    platoPrincipal1.calcularPrecioFinal());

            System.out.println("Total: " + (total + platoPrincipal1.calcularPrecioFinal()));
        }

    }
}
