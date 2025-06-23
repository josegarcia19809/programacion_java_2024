package IntegradorGestionVacantes.AspirantePaquete;


import IntegradorGestionVacantes.VacantePaquete.Vacante;

import java.util.ArrayList;
import java.util.Scanner;

public class AspiranteMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AspiranteServicio servicio = new AspiranteServicio("aspirantes.txt");
        String archivoVacantes = "vacantes.txt";
        String archivoSolicitudes = "solicitudes.txt";

        int opcion;

        do {
            System.out.println("\n===== MENÚ ASPIRANTES =====");
            System.out.println("1. Registrar nuevo aspirante");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Ver vacantes disponibles");
            System.out.println("4. Postularme a vacantes");
            System.out.println("5. Ver mi información");
            System.out.println("6. Ver mis solicitudes");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\n--- Registro de aspirante ---");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String contrasena = sc.nextLine();
                    System.out.print("Habilidades: ");
                    String habilidades = sc.nextLine();

                    boolean registrado = servicio.registrarAspirante(nombre, correo, contrasena, habilidades);
                    if (registrado) {
                        System.out.println("✅ Registro exitoso.");
                    } else {
                        System.out.println("❌ Ya existe un aspirante con ese correo.");
                    }
                }

                case 2 -> {
                    System.out.println("\n--- Inicio de sesión ---");
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String contrasena = sc.nextLine();

                    Aspirante aspirante = servicio.iniciarSesion(correo, contrasena);
                    if (aspirante != null) {
                        System.out.println("✅ Bienvenido, " + aspirante.getNombre());
                    } else {
                        System.out.println("❌ Correo o contraseña incorrectos.");
                    }
                }

                case 3 -> {
                    ArrayList<Vacante> vacantes = servicio.leerVacantesDesdeArchivo(archivoVacantes);
                    servicio.mostrarVacantesDisponibles(vacantes);
                }

                case 4 -> {
                    ArrayList<Vacante> vacantes = servicio.leerVacantesDesdeArchivo(archivoVacantes);
                    servicio.postularAVacantes(vacantes);
                }

                case 5 -> {
                    Aspirante activo = servicio.getAspiranteActivo();
                    if (activo != null) {
                        System.out.println("\n--- Aspirante activo ---");
                        System.out.println("ID: " + activo.getId());
                        System.out.println("Nombre: " + activo.getNombre());
                        System.out.println("Correo: " + activo.getCorreo());
                        System.out.println("Habilidades: " + activo.getHabilidades());
                    } else {
                        System.out.println("⚠️ No has iniciado sesión.");
                    }
                }

                case 6 -> {
                    servicio.verMisSolicitudes(archivoSolicitudes);
                }

                case 7 -> System.out.println("👋 Fin del programa.");
                default -> System.out.println("⚠️ Opción inválida.");
            }

        } while (opcion != 0);
    }
}

