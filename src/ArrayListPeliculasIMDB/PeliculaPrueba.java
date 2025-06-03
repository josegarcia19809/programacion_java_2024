package ArrayListPeliculasIMDB;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaPrueba {
    static ArrayList<Pelicula> peliculas = new ArrayList<>();
    static String nombreArchivo = "peliculas.txt";

    public static void crearArchivoSiNoExiste() {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                PrintWriter nuevoArchivo = new PrintWriter(archivo);
                nuevoArchivo.close();
            } catch (Exception e) {
                System.err.println("No se pudo crear el archivo");
                System.exit(1);
            }
        }
    }

    public static void cargarPeliculasDesdeArchivo() {
        peliculas.clear();
        try {
            File archivo = new File(nombreArchivo);
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                Pelicula p = Pelicula.desdeArchivo(linea);
                peliculas.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }


    public static void mostrarPeliculas(ArrayList<Pelicula> lista) {
        System.out.printf("%-4s | %-50s | %-15s | %-4s | %-12s%n",
                "ID", "Nombre", "Género", "Año", "Calificación");
        System.out.println(".".repeat(100));
        for (Pelicula p : lista) {
            System.out.printf(p.toString());
        }
    }


    public static void mostrarTodasLasPeliculas() {
        mostrarPeliculas(peliculas);
    }

    public static void buscarPorGenero(String genero) {
        ArrayList<Pelicula> filtradas = new ArrayList<>();
        for (Pelicula p : peliculas) {
            if (p.getGenero().equalsIgnoreCase(genero)) {
                filtradas.add(p);
            }
        }
        mostrarPeliculas(filtradas);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        crearArchivoSiNoExiste();
        cargarPeliculasDesdeArchivo();

        int opcion;
        do {
            System.out.println("\n--- MENÚ DE PELÍCULAS ---");
            System.out.println("1. Mostrar todas las películas");
            System.out.println("2. Buscar por género");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1 -> mostrarTodasLasPeliculas();
                case 2 -> {
                    System.out.print("Género a buscar: ");
                    String genero = sc.nextLine();
                    buscarPorGenero(genero);
                }
                case 3 -> {
                    System.out.println("¡Hasta luego!");
                }
                default -> System.out.println("Opción no válida");
            }

        } while (opcion != 3);
    }
}

