package p08_objetos.Cuenta201;

import java.util.Scanner;

public class CuentaPrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cuenta miCuenta = new Cuenta();

        // Pedir el nombre y asignarlo a miCuenta
        System.out.print("Dame tu nombre: ");
        String nombreUsuario = entrada.nextLine();
        miCuenta.establecerNombre(nombreUsuario);

        // Mostrar el nombre guardado de miCuenta
        System.out.println("Mi nombre es " + miCuenta.obtenerNombre());
        System.out.println("-".repeat(100));

    }
}
