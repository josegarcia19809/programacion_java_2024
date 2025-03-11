package p00_fundamentos;

import java.util.Scanner;

public class ServiciosTelefonicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar paquete al usuario
        System.out.println("Seleccione el paquete de suscripción (A, B o C): ");
        String paquete = entrada.next().toUpperCase();

        // Validar el paquete ingresado
        if (!paquete.equals("A") && !paquete.equals("B") && !paquete.equals("C")) {
            System.out.println("Error: Paquete inválido. Debe elegir A, B o C.");
            return;
        }

        // Solicitar minutos usados solo si el paquete es válido
        System.out.println("Ingrese la cantidad de minutos utilizados: ");
        int minutosUsados = entrada.nextInt();

        int minutosAdicionales;
        double pagoTotal = 0;

        // Calcular el pago Total según el paquete elegido
        if (paquete.equals("A")) {
            pagoTotal = 39.99;
            if (minutosUsados > 450) {
                minutosAdicionales = minutosUsados - 450;
                pagoTotal += minutosAdicionales * 0.45;
            }
        } else if (paquete.equals("B")) {
            pagoTotal = 59.99;
            if (minutosUsados > 900) {
                minutosAdicionales = minutosUsados - 900;
                pagoTotal += minutosAdicionales * 0.40;
            }
        } else if (paquete.equals("C")) {
            pagoTotal = 69.99; // Minutos ilimitados
        }

        // Mostrar el total a pagar
        System.out.printf("El pago Total es: $%.2f%n", pagoTotal);

        entrada.close();
    }
}
