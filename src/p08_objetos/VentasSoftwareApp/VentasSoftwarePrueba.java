package p08_objetos.VentasSoftwareApp;

import java.util.Scanner;

public class VentasSoftwarePrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(".".repeat(100));
        System.out.println("Ventas de software");

        System.out.print("Paquetes vendidos: ");
        int paquetes = entrada.nextInt();

        // Crear una instancia de VentasSoftware
        VentasSoftware ventas = new VentasSoftware(paquetes);

        System.out.printf("Total de ventas: $ %.2f %n", ventas.obtenerTotalVenta());

    }
}
