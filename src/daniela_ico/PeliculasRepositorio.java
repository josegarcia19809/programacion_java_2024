package daniela_ico;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// 1. CLASE MODELO: PeliculaDetalle (Define los 6 campos)

class PeliculaDetalle {
    // 6 Campos del Requerimiento Original
    private String titulo;
    private String director;
    private int anioLanzamiento;
    private int duracion;
    private String genero;
    private float calificacion;

    public PeliculaDetalle(String titulo, String director, int anioLanzamiento, int duracion, String genero, float calificacion) {
        this.titulo = titulo.trim(); // Limpieza de título
        this.director = director;
        this.anioLanzamiento = anioLanzamiento;
        this.duracion = duracion;
        this.genero = genero;
        this.calificacion = calificacion;
    }

    // Getters
    public String getTitulo() { return this.titulo; }
    public String getDirector() { return this.director; }
    public int getDuracion() { return this.duracion; }
    public int getAnioLanzamiento() { return this.anioLanzamiento; }
    public String getGenero() { return this.genero; }
    public float getCalificacion() { return this.calificacion; }

    //Metodo para mostrar la información detallada (para la Opción 4: Buscar).

    public void mostrarInfo() {
        System.out.println("  ---------------------------------------");
        System.out.println("  | Título:       | "   + titulo          );
        System.out.println("  | Director:     | "   + director        );
        System.out.println("  | Año:          | "   + anioLanzamiento );
        System.out.println("  | Duración:     | "   + duracion + " min");
        System.out.println("  | Género:       | "   + genero          );
        System.out.println("  | Calificación: | " + String.format("%.1f", calificacion));
        System.out.println("  ---------------------------------------");
    }

    //Metodo que genera la cadena de texto para el REPORTE DE TABLA (Opción 3 y 5).

    public String formatoReporteTabla() {
        return String.format(
                "  %-35s | Dir: %-23s | Año: %-4d | Duracion: %-4d min | Genero: %-15s | Calif: %.1f |",
                titulo, director, anioLanzamiento, duracion, genero, calificacion
        );
    }

    // Metodo para convertir a formato de archivo (usando , como separador)
    public String formatoArchivo() {
        return titulo + "," + director + "," + anioLanzamiento + "," +
                duracion + "," + genero + "," + calificacion;
    }
}


// 2. CLASE PRINCIPAL: Main consola (Lógica y Persistencia)

class RepositorioPelis {
    private static final String ARCHIVO = "PeliculasIniciales.txt";

    // Métodos de Persistencia
    //Carga las películas desde el archivo.

    public static ArrayList<PeliculaDetalle> cargarPeliculas(String nombreArchivo) {
        ArrayList<PeliculaDetalle> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            br.readLine();
            String linea;
            int count = 0;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 6) {
                    try {
                        String titulo = datos[0].trim();
                        // Prevenir duplicados del archivo al cargar
                        if (buscarPeliculaPorNombre(titulo, lista) == null) {
                            lista.add(new PeliculaDetalle(
                                    titulo,
                                    datos[1],
                                    Integer.parseInt(datos[2]),
                                    Integer.parseInt(datos[3]),
                                    datos[4],
                                    Float.parseFloat(datos[5])
                            ));
                            count++;
                        }
                    } catch (NumberFormatException e) {
                        System.err.println(" Error al pasar número en la línea: " + linea + ". Registro omitido.");
                    }
                }
            }
            // Se asegura que el número se concatene correctamente.
            System.out.println("🟢" + count + " películas cargadas con éxito desde el archivo.");

        } catch (FileNotFoundException e) {
            System.out.println("⚠ Archivo " + nombreArchivo + " no encontrado. Se iniciará vacío.");
        } catch (IOException e) {
            System.out.println("🛑 Error al leer el archivo: " + e.getMessage());
        }
        return lista;
    }

    //Guarda la lista actual de películas en el archivo.

    public static void guardarPeliculas(String nombreArchivo, ArrayList<PeliculaDetalle> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            bw.write("Título,Director,Año de lanzamiento,Duración,Género,Calificación");
            bw.newLine();

            for (PeliculaDetalle p : lista) {
                bw.write(p.formatoArchivo());
                bw.newLine();
            }
            System.out.println("Cambios guardados en " + nombreArchivo + ".");
        } catch (IOException e) {
            System.out.println("❌ Error al guardar archivo: " + e.getMessage());
        }
    }

    //Búsqueda simple para verificar duplicados o encontrar una película.

    public static PeliculaDetalle buscarPeliculaPorNombre(String titulo, ArrayList<PeliculaDetalle> lista) {
        String tituloBuscado = titulo.trim();
        for (PeliculaDetalle p : lista) {
            // Asegura que el título almacenado también se compare de forma limpia
            if (p.getTitulo().trim().equalsIgnoreCase(tituloBuscado)) {
                return p;
            }
        }
        return null;
    }

    //Muestra el reporte general en formato de tabla alineada.

    public static void mostrarReporte(ArrayList<PeliculaDetalle> listaPeliculas) {
        if (listaPeliculas.isEmpty()) {
            System.out.println("--- El repositorio está vacío. ---");
            return;
        }

        int totalRegistros = listaPeliculas.size();

        // Cabecera con el formato preferido por el usuario
        System.out.println("\n\n🎬 =================================================== REPORTE GENERAL DE PELÍCULAS (" + totalRegistros + ") ====================================================");
        System.out.println("                Título                |            Director          |    Año    |       Duracion     |          Género         |    Calif   |");
        System.out.println("  ------------------------------------|------------------------------|-----------|--------------------|-------------------------|------------|");

        for (PeliculaDetalle p : listaPeliculas) {
            // Llama al metodo para imprimir el formato de tabla
            System.out.println(p.formatoReporteTabla());
        }
        System.out.println("==============================================================================================================================================");
        System.out.println("Total de películas cargadas: " + totalRegistros);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // La lista se inicializa al cargar los datos.
        ArrayList<PeliculaDetalle> listaPeliculas = cargarPeliculas(ARCHIVO);
        int opcion;
        System.out.println(" 🍿 REPOSITORIO DE PELÍCULAS 🍿");
        System.out.println("Elaborado por: \nDanna Paola Bruno, Daniela Nieves y Emmanuel Hugo ");

        do {
            System.out.println("\n--- MENÚ PRINCIPAL 🍿 ---");
            System.out.println("1. Agregar película ➕🟢 ");
            System.out.println("2. Eliminar película ❌🛑 ");
            System.out.println("3. Reporte general 🎞 ");
            System.out.println("4. Buscar por nombre 🔎");
            System.out.println("5. Ordenar por Año de lanzamiento 📑");
            System.out.println("0. Salir del sistema ➡ ");
            System.out.print("Seleccione una opción 🫳🏻: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("❌ Error: Introduce un número válido para la opción.");
                sc.nextLine();
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine().trim();

                    // Validacion de duplicados
                    if (buscarPeliculaPorNombre(titulo, listaPeliculas) != null) {
                        System.out.println("🚫 Error: La película '" + titulo + "' ya existe.");
                        break;
                    }

                    // Entrada de datos
                    System.out.print("Director: ");
                    String director = sc.nextLine().trim();

                    try {
                        System.out.print("Año de lanzamiento: ");
                        int anioLanzamiento = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Duración (minutos, Entero): ");
                        int duracion = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Género: ");
                        String genero = sc.nextLine().trim();
                        System.out.print("Calificación (Decimal): ");
                        float calificacion = Float.parseFloat(sc.nextLine().trim());

                        // Agregar si todos los datos son válidos
                        listaPeliculas.add(new PeliculaDetalle(titulo, director, anioLanzamiento, duracion, genero, calificacion));
                        System.out.println("➕ Película agregada con éxito.");
                        guardarPeliculas(ARCHIVO, listaPeliculas);

                    } catch (NumberFormatException e) {
                        System.out.println("❌ Error: Por favor, introduce números enteros para Año/Duración y un decimal para Calificación.");
                    }
                    break;
                case 2:
                    System.out.print("Título a eliminar: ");
                    String eliminar = sc.nextLine();

                    // Usamos removeIf con la misma lógica de comparación
                    boolean eliminado = listaPeliculas.removeIf(p -> p.getTitulo().equalsIgnoreCase(eliminar.trim()));
                    if (eliminado) {
                        System.out.println("🛑Película eliminada.");
                        guardarPeliculas(ARCHIVO, listaPeliculas);
                    } else {
                        System.out.println(" No se encontró la película.");
                    }
                    break;
                case 3:
                    mostrarReporte(listaPeliculas);
                    break;
                case 4:
                    System.out.print("Título a buscar: ");
                    String buscarTitulo = sc.nextLine();

                    PeliculaDetalle encontrada = buscarPeliculaPorNombre(buscarTitulo, listaPeliculas);

                    if (encontrada != null) {
                        System.out.println("\n✅ Película encontrada:");
                        encontrada.mostrarInfo();
                    } else {
                        System.out.println(" No se halló la película.");
                    }
                    break;
                case 5:
                    // ordenar por año de lanzamiento
                    listaPeliculas.sort((p1, p2) -> Integer.compare(p1.getAnioLanzamiento(), p2.getAnioLanzamiento()));

                    mostrarReporte(listaPeliculas);
                    break;
                case 0: // La opción 0 es la salida
                    guardarPeliculas(ARCHIVO, listaPeliculas);
                    System.out.println("\n Saliendo del sistema. ¡Gracias por usar el Repositorio ❤!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
