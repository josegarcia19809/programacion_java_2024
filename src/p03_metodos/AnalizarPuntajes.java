package p03_metodos;

import java.util.Random;

/*
 * Escribe un programa que produzca 10 puntajes (entre 0 y 100) y determine
 * cuántos puntajes están por encima, o igual al promedio y cuántos puntajes están
 * por debajo del promedio.
 * */
public class AnalizarPuntajes {
    // metod0 para generar el arreglo
    public static int[] llenarArreglo() {
        int[] numeros = new int[10];
        Random random = new Random(10);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101);
        }
        return numeros;
    }

    // metod0 para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        System.out.println("Puntajes:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    // métod0 que calcule el promedio (se le debe pasar el arreglo como parámetro)
    public static double calcularPromedio(int[] arreglo) {
        double total = 0;
        for (int puntaje : arreglo) {
            total += puntaje;
        }
        return total / arreglo.length;
    }

    // métod0 que devuelva la cantidad de puntajes por debajo del promedio
    // (se le debe pasar el arreglo y el promedio)
    public static int obtenerCantidadDebajoPromedio(int[] arreglo, double promedio) {
        int conteo = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < promedio) {
                conteo++;
            }
        }
        return conteo;
    }

    // métod0 que devuelva la cantidad de puntajes por encima o iguales al promedio
    // (se le debe pasar el arreglo y el promedio)

    public static int obtenerCantidadEncimaOIgualPromedio(int[] arreglo, double promedio) {
        int conteo = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] >= promedio) {
                conteo++;
            }
        }
        return conteo;
    }

    public static void main(String[] args) {
        int[] puntajes = llenarArreglo();
        imprimirArreglo(puntajes);
        double promedio = calcularPromedio(puntajes);
        System.out.println("Promedio: " + promedio);
        System.out.println("Por debajo del promedio: " +
                obtenerCantidadDebajoPromedio(puntajes, promedio));
        System.out.println("Por encima o igual al promedio: " +
                obtenerCantidadEncimaOIgualPromedio(puntajes, promedio));
        System.out.println("-".repeat(100));
    }
}
