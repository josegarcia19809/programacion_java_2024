package p03_metodos;

public class Descuentos {
    public static void calcularDescuento(double cantidad, int porcentaje) {
        double descuento = cantidad * (porcentaje / 100.0);
        System.out.println("El descuento es de " + descuento);
    }

    public static void main(String[] args) {
        calcularDescuento(1000.00, 20);
    }
}
