package p01_arreglos;

import java.util.Scanner;

public class BuscarProducto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] productos = {
                "Laptop", "Teléfono", "Teclado", "Mouse", "Tablet", "iPhone"
        };
        System.out.print("Dame producto a buscar: ");
        String buscar = entrada.nextLine().toLowerCase();

        for (String producto : productos) {
            if (producto.toLowerCase().contains(buscar)) {
                System.out.println("- " + producto);
            }
        }
    }
}
