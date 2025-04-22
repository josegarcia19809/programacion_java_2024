package IntegradorGestionVacantes.EmpleadorPaquete;

import java.util.Scanner;

public class EmpleadorPrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declarar variables para pedir los datos
        int idx;
        String nombrex, correox, contrasenax, empresax;

        // Pedir datos para el primer empleador
        System.out.println("Primer empleador");
        System.out.print("Dame el id: ");
        idx = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Dame el nombre: ");
        nombrex = entrada.nextLine();

        System.out.print("Dame el correo: ");
        correox = entrada.nextLine();

        System.out.print("Dame su contraseña: ");
        contrasenax = entrada.nextLine();

        System.out.print("Nombre de su empresa: ");
        empresax = entrada.nextLine();

        // Crear una instancia de Empleador
        Empleador empleador1 = new Empleador(idx, nombrex, correox, contrasenax, empresax);

        // Encabezado
        System.out.printf("%6s %20s %25s %12s %15s %n", "id", "nombre", "correo",
                "contraseña", "empresa");
        System.out.println("-".repeat(150));
        System.out.println(empleador1.toString());
    }
}
