package ArrayListVideojuegos;

import java.util.Scanner;

public class VideojuegoPrueba {
    static Scanner entrada = new Scanner(System.in);
    static VideojuegosOperaciones favoritos = new VideojuegosOperaciones();

    public static void imprimirLinea() {
        System.out.println();
        System.out.println("-".repeat(100));
    }

    public static void pedirDatos() {
        System.out.println("Videojuego");

        System.out.print("Dame el id: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Dame el nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Dame la plataforma: ");
        String plataforma = entrada.nextLine();

        System.out.print("Dame el año: ");
        int anio = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Dame el género: ");
        String genero = entrada.nextLine();

        Videojuego nuevoJuego = new Videojuego(id, nombre, plataforma, anio, genero);

        favoritos.agregarVideojuego(nuevoJuego);
    }

    public static void menu() {
        imprimirLinea();
        System.out.println("Videojuegos favoritos");
        System.out.println("1.- Agregar videojuego");
        System.out.println("2.- Mostrar videojuegos");
        System.out.println("3.- Buscar por plataforma");
        System.out.println("4.- Buscar por género");
        System.out.println("5.- Listar videojuegos lanzados en o después de cierto año");
        System.out.println("6.- Buscar por nombre");
        System.out.println("7.- Salir");
        System.out.print("Elige tu opción: ");
    }

    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    pedirDatos();
                    favoritos.mostrarTodosLosVideojuegos();
                    break;

                case 2:
                    favoritos.mostrarTodosLosVideojuegos();
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 7);
    }
}
