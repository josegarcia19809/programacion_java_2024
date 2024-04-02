package ArrayListMenuFrutas;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Main {
    private static ArrayList<String> listaFrutas = new ArrayList<>();
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion, indice;
        String nombreFruta;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Dame el nombre de la fruta a ingresar: ");
                    nombreFruta = entrada.next();
                    meterFruta(nombreFruta);
                    sort(listaFrutas);
                    mostrarListaFrutas();
                    break;
                case 2:
                    sort(listaFrutas);
                    mostrarListaFrutas();
                    break;

                case 3:
                    System.out.print("Dame el nombre de la fruta a buscar: ");
                    nombreFruta = entrada.next();
                    indice = buscarFruta(nombreFruta);
                    if (indice != -1) {
                        System.out.println("Encontrada en la posición " + indice);
                    } else {
                        System.out.println("No encontrada");
                    }

                    break;
                case 4:
                    sort(listaFrutas);
                    mostrarListaFrutas();
                    System.out.print("Dame el nombre de la fruta a borrar: ");
                    nombreFruta = entrada.next();
                    borrarFruta(nombreFruta);

                    break;
                case 5:
                    sort(listaFrutas);
                    mostrarListaFrutas();
                    System.out.print("Dame el nombre de la fruta a cambiar: ");
                    nombreFruta = entrada.next();
                    cambiarFruta(nombreFruta);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            } // fin de switch

        } while (opcion != 6);
    }

    private static void menu() {
        System.out.println("----------------------");
        System.out.println("Lista de frutas");
        System.out.println("1.- Añadir una fruta");
        System.out.println("2.- Mostrar frutas");
        System.out.println("3.- Buscar una fruta");
        System.out.println("4.- Borrar una fruta");
        System.out.println("5.- Cambiar una fruta");
        System.out.println("6.- Salir");
        System.out.print("Elige tu opción: ");
    }

    private static void meterFruta(String nombreFruta) {
        listaFrutas.add(nombreFruta);
    }

    private static void mostrarListaFrutas() {
        System.out.println("Lista de frutas");
        for (String fruta : listaFrutas) {
            System.out.print(fruta + " ");
        }
        System.out.println();
    }

    private static int buscarFruta(String nombreFruta) {
        for (int index = 0; index < listaFrutas.size(); index++) {
            if (nombreFruta.equals(listaFrutas.get(index))) {
                return index;
            }
        }
        return -1;
    }

    private static void borrarFruta(String nombreFruta) {
        int indice = buscarFruta(nombreFruta);
        if (indice != -1) {
            listaFrutas.remove(indice);
            System.out.println("Fruta eliminada");
        } else {
            System.out.println("Fruta no encontrada");
        }
    }

    private static void cambiarFruta(String nombreFruta) {
        int indice = buscarFruta(nombreFruta);
        if (indice != -1) {
            System.out.print("Dame nuevo nombre: ");
            String nuevoNombre = entrada.next();
            listaFrutas.set(indice, nuevoNombre);
            System.out.println("Nombre cambiado");
        } else {
            System.out.println("Fruta no encontrada");
        }
    }

}