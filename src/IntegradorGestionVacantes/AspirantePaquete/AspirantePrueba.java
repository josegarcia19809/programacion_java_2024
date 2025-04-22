package IntegradorGestionVacantes.AspirantePaquete;

import java.util.Scanner;

public class AspirantePrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Variables para pedir los datos
        int idx;
        String nombrex, correox, contrasenax, habilidadesx;

        // Pedir los datos para el primer objeto
        System.out.println("Primer aspirante");
        System.out.print("Dame el id: ");
        idx = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Dame nombre: ");
        nombrex = entrada.nextLine();

        System.out.print("Dame correo: ");
        correox = entrada.nextLine();

        System.out.print("Dame contraseña: ");
        contrasenax = entrada.nextLine();

        System.out.print("Dime tus habilidades: ");
        habilidadesx = entrada.nextLine();

        Aspirante aspirante1 = new Aspirante(idx, nombrex,
                correox, contrasenax, habilidadesx);

        System.out.printf("%6s %20s %40s %20s %60s %n",
                "id", "nombre", "correo", "contraseña", "habilidades");
        System.out.println("-".repeat(150));
        System.out.println(aspirante1);
    }
}
