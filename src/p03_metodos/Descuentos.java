package p03_metodos;

public class Descuentos {
    public static void calcularDescuento(double precio, int porcentajeDescuento) {
        double descuento = precio * (porcentajeDescuento / 100.0);
        System.out.printf("El descuento es de %.2f pesos", descuento);
    }

    public static void main(String[] args) {
        calcularDescuento(1000.00, 15);
    }
}
