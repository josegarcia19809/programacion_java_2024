package p03_metodos;

public class FuncionPrecioDescuento {
    public static void calcularPrecioConDescuento(double precio, int porcentaje) {
        double descuento = precio * (porcentaje / 100.0);
        double precioConDescuento = precio - descuento;
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento: " + descuento);
        System.out.println("Precio con descuento: " + precioConDescuento);

    }

    public static void main(String[] args) {
        calcularPrecioConDescuento(3000.00, 30);
    }
}

