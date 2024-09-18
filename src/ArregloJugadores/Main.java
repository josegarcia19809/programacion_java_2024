package ArregloJugadores;

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static Jugador[] listaJugadores = new Jugador[20];
    static int contador = 0;

    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    pedirDatos();
                    break;
                case 2:
                    verRegistros();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }// fin de switch
        } while (opcion != 3);
    }

    public static void menu() {
        System.out.println("-".repeat(100));
        System.out.println("Jugadores");
        System.out.println("1.- Meter datos");
        System.out.println("2.- Ver registros");
        System.out.println("3.- Salir");
        System.out.print("Dame tu opción: ");
    }

    public static void pedirDatos() {
        System.out.print("Dame el número: ");
        int numerox = entrada.nextInt();

        System.out.print("Dame el nombre: ");
        entrada.nextLine();
        String nombrex = entrada.nextLine();

        System.out.print("Dame la posición: ");
        String posicionx = entrada.nextLine();

        System.out.print("Dame el salario: ");
        double salariox = entrada.nextDouble();

        System.out.print("Dame goles anotados: ");
        int golesx = entrada.nextInt();

        // Crear a un nuevo Jugador, toUpperCase() es para convertir a mayúsculas
        Jugador j1 = new Jugador(numerox, nombrex.toUpperCase(), posicionx.toUpperCase(), salariox, golesx);
        listaJugadores[contador] = j1;
        contador++;
        System.out.println("Agregado");
    }

    public static void verRegistros() {
        // Es con f printf
        System.out.printf("%-8s%-20s%-12s%-10s%8s\n",
                "CLAVE", "NOMBRE", "POSICIÓN", "SALARIO", "GOLES");
        System.out.println("-".repeat(100));
        for (int i = 0; i < contador; i++) {
            System.out.printf("%-8d%-20s%-12s%-10.2f%8d",
                    listaJugadores[i].getNumero(),
                    listaJugadores[i].getNombre(),
                    listaJugadores[i].getPosicion(),
                    listaJugadores[i].getSalario(),
                    listaJugadores[i].getGoles());
            System.out.println();
        }
    }
}
