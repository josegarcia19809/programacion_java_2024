package p03_metodos;

import java.util.Scanner;

public class CalculadoraCaloriasMalas {
    static Scanner entrada = new Scanner(System.in);

    public static double obtenerPeso(String producto) {
        double peso = 0;
        while (peso <= 0) {
            System.out.printf("Dame peso en libras de %s: ", producto);
            peso = entrada.nextDouble();
        }
        return peso;
    }

    public static double calcularCaloriasGrasa(double peso) {
        return peso * 4100;
    }

    public static double calcularCaloriasAzucar(double peso) {
        return peso * 936;
    }

    public static double calcularCaloriasMalas() {
        double pesoAzucar = obtenerPeso("Azúcar");
        double pesoGrasas = obtenerPeso("Grasas");

        double caloriasAzucar = calcularCaloriasAzucar(pesoAzucar);
        double caloriasGrasas = calcularCaloriasGrasa(pesoGrasas);

        return caloriasAzucar + caloriasGrasas;
    }

    public static void main(String[] args) {
        double caloriasMalas = calcularCaloriasMalas();
        System.out.println("Calorías malas: " + caloriasMalas);
    }
}
