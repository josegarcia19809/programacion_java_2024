package IntegradorGestionVacantes.EmpleadorPaquete;


import java.util.Scanner;

public class EmpleadorVacantePrueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpleadorServicio servicio = new EmpleadorServicio("empleadores.txt");

        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar empleador");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Ver empleador activo");
            System.out.println("4. Agregar vacante");
            System.out.println("5. Ver mis vacantes");
            System.out.println("6. Ver solicitudes");
            System.out.println("7. Cerrar sesión");
            System.out.println("8. Salir");
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

                    if (servicio.iniciarSesion(correoLogin, passLogin) != null) {
                        System.out.println("✅ Sesión iniciada. Bienvenido, " +
                                servicio.getEmpleadorActivo().getNombre());
                    } else {
                        System.out.println("❌ Credenciales incorrectas.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Empleador activo ---");
                    Empleador activo = servicio.getEmpleadorActivo();
                    if (activo != null) {
                        System.out.println("ID: " + activo.getId());
                        System.out.println("Nombre: " + activo.getNombre());
                        System.out.println("Correo: " + activo.getCorreo());
                        System.out.println("Empresa: " + activo.getEmpresa());
                    } else {
                        System.out.println("No hay sesión activa.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Agregar Vacante ---");
                    if (servicio.getEmpleadorActivo() == null) {
                        System.out.println("⚠️ Debe iniciar sesión primero.");
                        break;
                    }

                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Requisitos: ");
                    String requisitos = sc.nextLine();
                    System.out.print("Ubicación: ");
                    String ubicacion = sc.nextLine();
                    System.out.print("Tipo de trabajo (Presencial/Remoto/Híbrido): ");
                    String tipo = sc.nextLine();
                    System.out.print("Salario: ");
                    double salario = Double.parseDouble(sc.nextLine());

                    servicio.agregarVacante(titulo, descripcion, requisitos, ubicacion, tipo, salario);
                    break;

                case 5:
                    System.out.println("\n--- Mis Vacantes ---");
                    servicio.verVacantesDelEmpleadorActivo();
                    break;

                case 6:
                    System.out.println("\n--- Solicitudes ---");
                    servicio.verSolicitudesRecibidas("solicitudes.txt", "vacantes.txt");
                    break;

                case 7:
                    servicio.cerrarSesion();
                    System.out.println("✅ Sesión cerrada.");
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    return;


                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}

