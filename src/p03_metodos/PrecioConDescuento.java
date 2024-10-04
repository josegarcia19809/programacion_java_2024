package p03_metodos;

public class PrecioConDescuento {
    public static void calcularPrecioConDescuento(double precio, int porcentaje) {
        double descuento = precio * (porcentaje / 100.0);
        double precioConDescuento = precio - descuento;
        System.out.println("Precio con descuento: " + precioConDescuento);

    }

    public static void main(String[] args) {
        calcularPrecioConDescuento(2000.00, 30);
    }
}
