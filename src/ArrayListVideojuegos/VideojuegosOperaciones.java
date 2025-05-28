package ArrayListVideojuegos;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class VideojuegosOperaciones {
    ArrayList<Videojuego> juegos = new ArrayList<>();
    private String nombreArchivo;

    // Constructor
    public VideojuegosOperaciones(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        crearArchivoSiNoExiste(nombreArchivo);
        cargarVideojuegosDesdeArchivo();
    }

    private void crearArchivoSiNoExiste(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                // Crear archivo vacío
                PrintWriter nuevoArchivo = new PrintWriter(archivo);
                nuevoArchivo.close();
            } catch (IOException e) {
                System.err.println("No se pudo crear el archivo");
                System.exit(1);
            }
        }
    }

    public void cargarVideojuegosDesdeArchivo() {
        juegos.clear();
        try {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists()) {
                return;
            }
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                Videojuego nuevoJuego = Videojuego.desdeArchivo(linea);
                juegos.add(nuevoJuego);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }

    public void guardarVideojuegoEnArchivo() {
        try {
            File archivo = new File(nombreArchivo);
            PrintWriter escritor = new PrintWriter(archivo);

            for (Videojuego juego : juegos) {
                escritor.println(juego.formatoArchivo());
            }
            escritor.close();

        } catch (Exception e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public void agregarVideojuego(Videojuego nuevoJuego) {
        juegos.add(nuevoJuego);
    }

    private void imprimirLineaPuntos() {
        System.out.println(".".repeat(100));
    }

    private void mostrarVideojuegos(ArrayList<Videojuego> listaJuegos) {
        imprimirLineaPuntos();
        String salida = String.format("%6s %35s %25s %6s %15s",
                "id", "nombre", "plataforma", "año", "genero");
        System.out.println(salida);
        imprimirLineaPuntos();
        for (int i = 0; i < listaJuegos.size(); i++) {
            System.out.println(listaJuegos.get(i));
        }
    }

    public void mostrarTodosLosVideojuegos() {
        mostrarVideojuegos(juegos);
    }

    public void buscarPorPlataforma(String plataforma) {
        ArrayList<Videojuego> listaPlataforma = new ArrayList<>();
        for (int i = 0; i < juegos.size(); i++) {
            if (juegos.get(i).getPlataforma().equals(plataforma)) {
                listaPlataforma.add(juegos.get(i));
            }
        }
        mostrarVideojuegos(listaPlataforma);
    }

}
