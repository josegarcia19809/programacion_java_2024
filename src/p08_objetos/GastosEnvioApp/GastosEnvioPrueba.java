package p08_objetos.GastosEnvioApp;

import java.util.Scanner;

public class GastosEnvioPrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Paquetería 'Envio rápido de mercancias");

        System.out.print("Dame peso del paquete: ");
        double pesoPaquete = entrada.nextDouble();

        // Creamos una instancia de GastosEnvio
        GastosEnvio gastos = new GastosEnvio(pesoPaquete);
        System.out.printf("Los gastos de este envio son: $%.2f",
                gastos.calcularGastosEnvio());
    }
}
