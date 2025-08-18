package p00_fundamentos;

// Este programa calcula el precio de venta de un artículo después de aplicar un
// descuento del 20%.

public class Descuento {
    public static void main(String[] args) {
        // Variables para almacenar el precio regular, el monto del descuento y
        // el precio de venta
        double precioRegular = 59.0;
        double descuento;
        double precioVenta;

        // Calcular el 20% de descuento
        descuento = precioRegular * 0.20;

        // Calcular el precio de venta
        precioVenta = precioRegular - descuento;

        // Mostrar resultados
        System.out.println("Precio regular: $" + precioRegular);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Precio de venta: $" + precioVenta);
        System.out.println("-".repeat(100));
    }
}

