package p01_fundamentos;

import java.util.Scanner;

public class VentaSoftware {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Venta de software");
        System.out.println("Tabla de descuentos");
        System.out.println("Cantidad \t\t Descuento");
        System.out.println("10-19\t\t 20%");
        System.out.println("20-49 \t\t 30%");
        System.out.println("50-99 \t\t 40%");
        System.out.println("100 o mas \t\t 50%");
        System.out.println("Dame cantidad de paquetes: ");
        int paquetes = entrada.nextInt();
        if (paquetes < 1) {
            System.out.println("Numero de paquetes no valido");
            return;
        }
        int descuento = 0;
        if (paquetes >= 10 && paquetes <= 19) {
            descuento = 20;
        } else if (paquetes >= 20 && paquetes <= 49) {
            descuento = 30;
        } else if (paquetes >= 50 && paquetes <= 99) {
            descuento = 40;
        } else if (paquetes >= 100) {
            descuento = 50;
        }

        double ventaTotal = (paquetes * 99);
        double ventaConDescuento = ventaTotal - (ventaTotal * (descuento / 100.0));
        System.out.println("La venta total es de: " + ventaConDescuento);
    }
}
