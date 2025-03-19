package p01_fundamentos;

import java.util.Scanner;

public class GastosEnvio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Envios 'El rapidin'");
        System.out.println("Peso del paquete\tPago por envío");
        System.out.println("2kg o menos\t\t\t$1.10");
        System.out.println(">2kg - menos de 6\t$2.20");
        System.out.println(">6kg - menos de 10\t$3.70");
        System.out.println(">10kg - menos de 20\t$4.80");

        // Pedir el peso del paquete
        System.out.print("Dame el peso del paquete: ");
        double peso = entrada.nextDouble();

        // Validar
        if (peso <= 0) {
            System.out.println("No se aceptan pesos menores " +
                    "o igual a cero");
            return; // Se sale del programa
        }

        if (peso > 20) {
            System.out.println("Se excedió el peso máximo de" +
                    " 20 kg");
            return; // Se sale del programa
        }

        // Si pasó las validaciones
        double tarifa = 0.0;
        if (peso <= 2) {
            tarifa = 1.10;
        } else if (peso > 2 && peso <= 6) {
            tarifa = 2.20;
        } else if (peso > 6 && peso <= 10) {
            tarifa = 3.70;
        } else if (peso > 10 && peso <= 20) {
            tarifa = 4.80;
        }

        System.out.println("La tarifa es de " + tarifa +
                " de un paquete que pesa " + peso + " kg.");
    }
}
