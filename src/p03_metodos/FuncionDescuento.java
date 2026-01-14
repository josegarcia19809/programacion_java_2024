package p03_metodos;

public class FuncionDescuento {
    public static void calcularDescuento(double precio, int porcentajeDescuento) {
        double descuento = precio * (porcentajeDescuento / 100.0);
        System.out.println("El descuento es de " + descuento + " pesos");
    }

    public static void main(String[] args) {
        calcularDescuento(1000, 25);
        calcularDescuento(2000, 25);
        calcularDescuento(1500, 35);

    }
}
