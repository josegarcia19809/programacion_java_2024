package p10_herencia.inventarioProductos;

import java.util.ArrayList;
import java.util.Scanner;

public class InventarioPrueba {
    static ArrayList<Producto> inventario = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    public static void pedirDatos() {
        System.out.println("Nuevo producto");
        System.out.println("¿Qué tipo de producto deseas agregar?");
        System.out.println("1. Producto normal");
        System.out.println("2. Producto menudeo");
        System.out.print("Elige una opción: ");
        int tipo = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Dame nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Dame precio: ");
        double precio = entrada.nextDouble();

        System.out.print("Dame cantidad: ");
        int cantidad = entrada.nextInt();

        Producto nuevoProducto;

        if (tipo == 2) {
            System.out.print("Dame el porcentaje de aumento: ");
            int porcentaje = entrada.nextInt();
            nuevoProducto = new ProductoMenudeo(nombre, precio, cantidad, porcentaje);
        } else {
            nuevoProducto = new Producto(nombre, precio, cantidad);
        }

        inventario.add(nuevoProducto);
    }

    public static void imprimirLineaPuntos() {
        System.out.println();
        System.out.println(".".repeat(100));
    }

    public static void mostrarInventario() {
        imprimirLineaPuntos();
        for (Producto productoX : inventario) {
            System.out.println("Nombre: " + productoX.getNombre());
            System.out.println("Cantidad: " + productoX.getCantidad());
            System.out.println("Precio: " + productoX.getPrecio());

            if (productoX instanceof ProductoMenudeo) {
                ProductoMenudeo productoMenudeoX = (ProductoMenudeo) productoX;
                System.out.println("Porcentaje aumento: " +
                        productoMenudeoX.getPorcentajeAumento());
            } else {
                System.out.println("Porcentaje aumento: No aplica");
            }

            System.out.println();
        }
    }

    public static void calcularTotalInventario() {
        double total = 0;

        for (Producto p : inventario) {
            double precioFinal = p.getPrecio();

            if (p instanceof ProductoMenudeo) {
                ProductoMenudeo pm = (ProductoMenudeo) p;
                precioFinal += precioFinal * pm.getPorcentajeAumento() / 100.0;
            }

            total += p.getCantidad() * precioFinal;
        }

        System.out.println("Total del inventario: " + total);
    }

    public static void menu() {
        System.out.println();
        System.out.println("------------------------Inventario de negocio");
        System.out.println("                        Tech store");
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
