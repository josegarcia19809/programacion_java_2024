package p04_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.sort;

public class ArrayListFrutas {
    static ArrayList<String> frutas = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        inicializar();
        int opcion;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    meterFrutas();
                    break;
                case 2:
                    sort(frutas);
                    mostrarListaFrutas();
                    break;
                case 3:
                    sort(frutas);
                    buscarFrutaPorNombre();
                    break;
                case 4:
                    borrarFruta();
                    break;
                case 5:
                    cambiarNombreFruta();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 6);
    }

    private static void inicializar() {
        frutas.add("manzana");
        frutas.add("pera");
        frutas.add("piña");
        frutas.add("naranja");
        frutas.add("lima");
    }

    private static void menu() {
        System.out.println("-".repeat(30));
        System.out.println("Uso de un ArrayList para una lista de frutas");
        System.out.println("1.- Añadir una fruta a una lista");
        System.out.println("2.- Mostrar frutas");
        System.out.println("3.- Buscar una fruta");
        System.out.println("4.- Borrar una fruta");
        System.out.println("5.- Cambiar una fruta");
        System.out.println("6.- Salir");
        System.out.print("Elige tu opción: ");
    }

    private static void meterFrutas() {
        System.out.print("Dame el nombre de una fruta: ");
        entrada.nextLine();
        String nombreFruta = entrada.nextLine();
        frutas.add(nombreFruta);

    }

    private static void mostrarListaFrutas() {
        System.out.println("Lista de frutas");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    private static void borrarFruta() {
        System.out.print("Dame el nombre de una fruta: ");
        entrada.nextLine();
        String nombreFruta = entrada.nextLine();
        frutas.remove(nombreFruta);
    }

    private static void cambiarNombreFruta() {
        System.out.print("Dame el nombre de una fruta: ");
        entrada.nextLine();
        String nombreFruta = entrada.nextLine();
        int indice = buscarFruta(nombreFruta);
        if (indice != -1) {
            System.out.print("Dame nuevo nombre: ");
            String nuevaFruta = entrada.nextLine();
            frutas.set(indice, nuevaFruta);
            System.out.println("Nombre cambiado");
        } else {
            System.out.print("El nombre de una fruta no existe: ");
        }
    }

    private static void buscarFrutaPorNombre() {
        System.out.print("Dame el nombre de una fruta: ");
        entrada.nextLine();
        String nombreFruta = entrada.nextLine();
        int indice = buscarFruta(nombreFruta);
        if (indice != -1) {
            System.out.println("La fruta está en la posición " + indice);
        } else {
            System.out.print("El nombre de una fruta no existe: ");
        }
    }

    private static int buscarFruta(String nombreFruta) {
        for (int i = 0; i < frutas.size(); i++) {
            if (frutas.get(i).equals(nombreFruta)) {
                return i;
            }
        }
        return -1;
    }
}
