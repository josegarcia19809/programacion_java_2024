package p10_herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class InventarioPrueba {
    static ArrayList<Producto> inventario = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    public static void pedirDatos() {
        System.out.println("Inventario");
        System.out.println("Nuevo producto");

        entrada.nextLine();
        System.out.print("Dame nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Dame precio: ");
        double precio = entrada.nextDouble();

        System.out.print("Dame cantidad: ");
        int cantidad = entrada.nextInt();

        Producto nuevoProducto = new Producto(nombre, precio, cantidad);

        inventario.add(nuevoProducto);
    }

    public static void imprimirLineaPuntos() {
        System.out.println();
        System.out.println(".".repeat(100));
    }

    public static void mostrarInventario() {
        imprimirLineaPuntos();
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println("Nombre: " + inventario.get(i).getNombre());
            System.out.println("Cantidad: " + inventario.get(i).getCantidad());
            System.out.println("Precio: " + inventario.get(i).getPrecio());
            System.out.println("Porcentaje aumento: " + inventario.get(i).getPorcentajeAumento());
            System.out.println();
        }
    }

    public static void calcularTotalInventario() {
        double total = 0;
        for (int i = 0; i < inventario.size(); i++) {
            total += inventario.get(i).getCantidad() *
                    inventario.get(i).getPrecio();
        }
        System.out.println("Total del inventario: " +
                total);
    }

    public static void menu() {
        System.out.println("Inventario de negocio");
        System.out.println("Tech store");
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Calcular total de inventario");
        System.out.println("4. Salir");
        System.out.print("Elige tu opción: ");
    }

    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    pedirDatos();
                    break;
                case 2:
                    mostrarInventario();
                    break;
                case 3:
                    calcularTotalInventario();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo");
                    break;
            }
        } while (opcion != 4);
    }
}
