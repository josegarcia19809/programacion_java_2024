package p11_polimorfismo.FacturacionRestaurante;

// Ejemplo de uso
public class Restaurante {
    public static void main(String[] args) {
        Plato entrada1 = new Entrada("Ensalada", 5.0, 2.0);
        Plato entrada2 = new Entrada("Sopa de verduras", 4.0, 1.0);
        Plato entrada3 = new Entrada("Pan de ajo", 3.0, 0.50);
        Plato entrada4 = new Entrada("Bruschetta", 6.0, 1.50);

       // Plato platoPrincipal1 = new PlatoPrincipal("Filete de res", 12.0, 6.0);

        Plato postre1 = new Postre("Pay de piña", 11.0, 4.0);
        Plato postre2 = new Postre("Tarta de manzana", 6.00, 3.0);


        System.out.println("---------------------------------------------Platos de entradas:");
        System.out.printf("%s: $%.2f%n", entrada1.getNombre(),
                entrada1.calcularPrecioFinal());
        System.out.printf("%s: $%.2f%n", entrada2.getNombre(),
                entrada2.calcularPrecioFinal());
        System.out.printf("%s: $%.2f%n", entrada3.getNombre(),
                entrada3.calcularPrecioFinal());
        System.out.printf("%s: $%.2f%n", entrada4.getNombre(),
                entrada4.calcularPrecioFinal());

//        System.out.printf("%s: $%.2f%n", platoPrincipal1.getNombre(),
//                platoPrincipal1.calcularPrecioFinal());

        System.out.println(".".repeat(100));
        System.out.println("---------------------------------Postres:");
        System.out.printf("%s: $%.2f%n", postre1.getNombre(),
                postre1.calcularPrecioFinal());
        System.out.printf("%s: $%.2f%n", postre2.getNombre(),
                postre2.calcularPrecioFinal());

    }
}

