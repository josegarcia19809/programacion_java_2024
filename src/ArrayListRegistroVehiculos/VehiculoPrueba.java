package ArrayListRegistroVehiculos;

import java.util.Scanner;

public class VehiculoPrueba {
    static Scanner entrada = new Scanner(System.in);
    static VehiculosOperaciones agencia = new VehiculosOperaciones();

    public static void imprimirLinea() {
        System.out.println();
        System.out.println("-".repeat(100));
    }

    public static void pedirDatos() {
        System.out.println("Datos del vehículo");

        System.out.print("Dame el id: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Dame la marca: ");
        String marca = entrada.nextLine();

        System.out.print("Dame el modelo: ");
        String modelo = entrada.nextLine();

        System.out.print("Dame el año: ");
        int anio = entrada.nextInt();

        System.out.print("Dame el precio: ");
        double precio = entrada.nextDouble();

        Vehiculo nuevoVehiculo = new Vehiculo(id, marca, modelo, anio, precio);

        agencia.ingresarVehiculo(nuevoVehiculo);
    }

    public static void menu() {
        imprimirLinea();
        System.out.println("Agencia de vehículos");
        System.out.println("1.- Agregar vehículo");
        System.out.println("2.- Mostrar vehículos");
        System.out.println("3.- Buscar vehículos por marca.");
        System.out.println("7.- Salir");
        System.out.print("Elige tu opción: ");

    }

    public static void main(String[] args) {
        pedirDatos();
        agencia.mostrarVehiculos();
    }
}
