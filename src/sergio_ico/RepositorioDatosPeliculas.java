package sergio_ico;

import java.io.*;
import java.util.*;
class PeliculaLanzamiento {
    String titulo;
    String director;
    int anioLanzamiento;
    int duracion;
    String sinopsis;
    String idioma;

    public PeliculaLanzamiento(String titulo, String director, int anioLanzamiento, int duracion, String sinopsis, String idioma) {
        this.titulo = titulo;
        this.director = director;
        this.anioLanzamiento = anioLanzamiento;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.idioma = idioma;
    }
    public String toString() {
        return "Titulo: " + titulo + "\nDirector: " + director + "\nAño: " + anioLanzamiento +
                "\nDuración: " + duracion + " minutos" + "\nSinopsis: " + sinopsis +
                "\nIdioma: " + idioma + "\n";
    }
}
public class RepositorioDatosPeliculas {
    static final String ARCHIVO = "peliculas.txt";
    static ArrayList<PeliculaLanzamiento> lista = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Por Sergio Garduño Arriaga");
        cargarArchivo();
        menuPrincipal();
    }
    static void cargarArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 6) {
                    lista.add(new PeliculaLanzamiento(
                            partes[0], partes[1], Integer.parseInt(partes[2]),
                            Integer.parseInt(partes[3]), partes[4], partes[5]
                    ));
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo. Asegúrate de que exista con 30 películas.");
        }
    }
    static void guardarArchivo() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO))) {
            for (PeliculaLanzamiento p : lista) {
                pw.println(p.titulo + ";" + p.director + ";" + p.anioLanzamiento + ";" + p.duracion + ";" + p.sinopsis + ";" + p.idioma);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar en el archivo.");
        }
    }

    static void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE PELÍCULAS ---");
            System.out.println("1. Agregar película");
            System.out.println("2. Eliminar película");
            System.out.println("3. Reporte general");
            System.out.println("4. Buscar por nombre");
            System.out.println("5. Ordenar por año de lanzamiento");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> agregar(sc);
                case 2 -> eliminar(sc);
                case 3 -> reporte();
                case 4 -> buscar(sc);
                case 5 -> ordenar();
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }

    static void agregar(Scanner sc) {
        System.out.print("Título: ");
        String titulo = sc.nextLine();

        for (PeliculaLanzamiento p : lista) {
            if (p.titulo.equalsIgnoreCase(titulo)) {
                System.out.println("Esta película ya está registrada.");
                return;
            }
        }

        System.out.print("Director: ");
        String director = sc.nextLine();
        System.out.print("Año de lanzamiento: ");
        int anio = sc.nextInt(); sc.nextLine();
        System.out.print("Duración (minutos): ");
        int duracion = sc.nextInt(); sc.nextLine();
        System.out.print("Sinopsis: ");
        String sinopsis = sc.nextLine();
        System.out.print("Idioma: ");
        String idioma = sc.nextLine();

        lista.add(new PeliculaLanzamiento(titulo, director, anio, duracion, sinopsis, idioma));
        guardarArchivo();
        System.out.println("Película agregada exitosamente.");
    }

    static void eliminar(Scanner sc) {
        System.out.print("Ingresa el título a eliminar: ");
        String titulo = sc.nextLine();

        Iterator<PeliculaLanzamiento> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().titulo.equalsIgnoreCase(titulo)) {
                it.remove();
                guardarArchivo();
                System.out.println("Película eliminada.");
                return;
            }
        }
        System.out.println("No se encontró la película.");
    }

    static void reporte() {
        if (lista.isEmpty()) {
            System.out.println("No hay películas registradas.");
            return;
        }
        for (PeliculaLanzamiento p : lista) {
            System.out.println(p);
        }
    }

    static void buscar(Scanner sc) {
        System.out.print("Ingresa el título a buscar: ");
        String titulo = sc.nextLine();

        for (PeliculaLanzamiento p : lista) {
            if (p.titulo.equalsIgnoreCase(titulo)) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("No se encontró la película.");
    }

    static void ordenar() {
        lista.sort(Comparator.comparingInt(p -> p.anioLanzamiento));
        guardarArchivo();
        System.out.println("Películas ordenadas por año de lanzamiento.");
    }
}
