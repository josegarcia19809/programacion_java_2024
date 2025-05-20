package IntegradorGestionVacantes.EmpleadorPaquete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpleadorServicio servicio = new EmpleadorServicio("empleadores.txt");
        Empleador empleadorActivo = null;

        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar empleador");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Ver empleador activo");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Registro ---");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String contrasena = sc.nextLine();
                    System.out.print("Empresa: ");
                    String empresa = sc.nextLine();

                    boolean registrado = servicio.registrarEmpleador(nombre, correo, contrasena, empresa);
                    if (registrado) {
                        System.out.println("✅ Registro exitoso.");
                    } else {
                        System.out.println("⚠️ El correo ya está registrado.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Iniciar sesión ---");
                    System.out.print("Correo: ");
                    String correoLogin = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String passLogin = sc.nextLine();

                    empleadorActivo = servicio.iniciarSesion(correoLogin, passLogin);
                    if (empleadorActivo != null) {
                        System.out.println("✅ Sesión iniciada. Bienvenido, " + empleadorActivo.getNombre());
                    } else {
                        System.out.println("❌ Credenciales incorrectas.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Empleador activo ---");
                    if (empleadorActivo != null) {
                        System.out.println("ID: " + empleadorActivo.getId());
                        System.out.println("Nombre: " + empleadorActivo.getNombre());
                        System.out.println("Correo: " + empleadorActivo.getCorreo());
                        System.out.println("Empresa: " + empleadorActivo.getEmpresa());
                    } else {
                        System.out.println("No hay sesión activa.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    return;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}

