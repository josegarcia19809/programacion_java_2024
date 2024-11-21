package Tienda_Musica_2024;

import java.util.Scanner;

public class MainApp {
    static Catalogo catalogoTienda = new Catalogo();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        verCatalogo();
        int opcion;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    imprimirLinea();
                    pedirDatosCancion();
                    verCatalogo();
                    break;
                case 2:
                    verCatalogo();
                    break;
                case 3:
                    buscarCancion();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 4);
    }

    static void imprimirLinea() {
        System.out.println("-".repeat(80));
    }

    static void menu() {
        imprimirLinea();
        System.out.println("Operaciones sobre canciones");
        System.out.println("1.- Añadir una canción");
        System.out.println("2.- Mostrar lista de canciones");
        System.out.println("3.- Buscar cancion");
        System.out.println("4.- Salir");
        System.out.print("Elige tu opción: ");
    }


    static void pedirDatosCancion() {
        int clavex;
        String nombreCancionx, nombreCantantex, generox,
                albumx, portadax, enlacex;
        double preciox;
        System.out.print("Dame la clave de la canción: ");
        clavex = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Dame nombre de la canción: ");
        nombreCancionx = entrada.nextLine();

        System.out.print("Dame nombre del cantante: ");
        nombreCantantex = entrada.nextLine();

        System.out.print("Dame género: ");
        generox = entrada.nextLine();

        System.out.print("Dame nombre del albúm: ");
        albumx = entrada.nextLine();

        System.out.print("Dame nombre de la portada: ");
        portadax = entrada.nextLine();

        System.out.print("Dame enlace de la canción: ");
        enlacex = entrada.nextLine();

        System.out.print("Dame precio: ");
        preciox = entrada.nextDouble();

        Cancion cancionx = new Cancion(clavex, nombreCancionx, nombreCantantex, generox,
                albumx, preciox, portadax, enlacex);
        catalogoTienda.insertarCancion(cancionx);
    }

    static void buscarCancion() {
        int clavex;
        System.out.print("Dame clave de la canción: ");
        clavex = entrada.nextInt();
        Cancion cancionABuscar = catalogoTienda.buscarPorClave(clavex);
        if (cancionABuscar == null) {
            System.out.println("Canción no encontrada");
        } else {
            imprimirCancion(cancionABuscar);
        }
    }

    static void imprimirCancion(Cancion cancion) {
        imprimirLinea();
        System.out.println("Datos de la canción");
        System.out.println("Nombre: " + cancion.getNombreCancion());
        System.out.println("Cantante: " + cancion.getNombreCantante());
        System.out.println("Género: " + cancion.getGenero());
        System.out.println("Albúm: " + cancion.getAlbum());
        System.out.println("Precio: " + cancion.getPrecio());
    }


    static void verCatalogo() {
        System.out.printf("%-8s|%-30s|%-30s|%-8s\n",
                "Clave", "Nombre canción", "Artista", "Precio");
        imprimirLinea();
        for (Cancion cancion : catalogoTienda.getListaCanciones()) {
            System.out.printf("%-8d|%-30s|%-30s|$%-6.2f\n",
                    cancion.getClave(), cancion.getNombreCancion(),
                    cancion.getNombreCantante(), cancion.getPrecio());
        }
    }
}


