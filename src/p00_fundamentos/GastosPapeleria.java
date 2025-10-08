package p00_fundamentos;

import java.util.Scanner;

public class GastosPapeleria {
    static Scanner entrada = new Scanner(System.in);

    public static void cobrarVentaLapices() {
        final double PRECIO_LAPIZ = 4;

        System.out.print("¿Cuántos lápices quieres? ");
        int cantidad = entrada.nextInt();

        double totalVentaLapices = PRECIO_LAPIZ * cantidad;
        System.out.printf("✏️Cobro de lapices: $%.2f%n", totalVentaLapices);
        imprimirLinea();
    }

    private static void imprimirLinea() {
        System.out.println("-".repeat(100));
    }

    public static void cobrarVentaGomas() {
        final double PRECIO_GOMA = 2.50;

        System.out.print("¿Cuántas gomas quieres? ");
        int cantidad = entrada.nextInt();

        double totalVentaGomas = PRECIO_GOMA * cantidad;
        System.out.printf("✏️Cobro de gomas: $%.2f%n",
                totalVentaGomas);
        imprimirLinea();
    }

    public static void cobrarVentaBrujulas() {
        final double PRECIO_BRUJULA = 12.00;

        System.out.print("¿Cuántas brújulas quieres? ");
        int cantidad = entrada.nextInt();

        double totalVentaBrujulas = PRECIO_BRUJULA * cantidad;
        System.out.printf("🧭Cobro de brújulas: $%.2f%n",
                totalVentaBrujulas);
        imprimirLinea();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=================================");
            System.out.println("   Papelería Potros 🐎");
            System.out.println("=================================");
            System.out.println("1. Cobrar venta de lápices ✏️");
            System.out.println("2. Cobrar venta de gomas 🧽");
            System.out.println("3. Cobrar venta de brújulas 🧭");
            System.out.println("4. Salir 🚪");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cobrarVentaLapices();
                    break;
                case 2:
                    cobrarVentaGomas();
                    break;
                case 3:
                    cobrarVentaBrujulas();
                    break;
                case 4:
                    System.out.println("Gracias por su visita 🐴💼");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente ❌");
            }

            System.out.println();
        } while (opcion != 4);

        sc.close();
    }
}










