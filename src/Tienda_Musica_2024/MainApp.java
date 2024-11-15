package Tienda_Musica_2024;

import java.util.Scanner;

public class MainApp {
    static Catalogo catalogoTienda = new Catalogo();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        catalogoTienda.verCatalogo(); // Para ver las canciones del catalogo
        int opcion, indice;
        int clave;
        String nombreCancion;
        do {
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    pedirDatosCancion();
                    catalogoTienda.verCatalogo();
                    break;

                case 2:
                    catalogoTienda.verCatalogo();
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("No válido");
                    break;
            } // fin de switch
        } while (opcion != 9);

    }

    private static void menu() {
        imprimirLinea();
        System.out.println("Operaciones sobre canciones");
        System.out.println("1.- Añadir una Canción a la lista");
        System.out.println("2.- Mostrar Lista de Canciones");
        System.out.println("9.- Salir");
        System.out.print("Elige tu opción: ");
    } // fin de menu


    public static void pedirDatosCancion() {
        int clavex;
        String nombreCancionx, nombreCantantex, generox, albumx, portadax;
        double preciox;
        System.out.print("Dame la clave de la canción: ");
        clavex = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Dame el nombre de la canción: ");
        nombreCancionx = entrada.nextLine();
        System.out.print("Dame los nombres de los artistas: ");
        nombreCantantex = entrada.nextLine();
        System.out.print("Dame el género: ");
        generox = entrada.nextLine();
        System.out.print("Dame el nombre del álbum: ");
        albumx = entrada.nextLine();
        System.out.print("Dame el precio de la canción: ");
        preciox = entrada.nextDouble();
        System.out.print("Dame el nombre de la portada: ");
        entrada.nextLine();
        portadax = entrada.nextLine();

        Cancion cancionX = new Cancion(clavex, nombreCancionx, nombreCantantex, generox,
                albumx, preciox, portadax);
        catalogoTienda.insertarCancion(cancionX);
    }

    public static void imprimirLinea() {
        System.out.println("-".repeat(80));
    }
}

