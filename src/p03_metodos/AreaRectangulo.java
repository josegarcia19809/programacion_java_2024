package p03_metodos;

import java.util.Scanner;

public class AreaRectangulo {
    static Scanner entrada = new Scanner(System.in);

    public static double obtenerLargo() {
        double largo = 0;
        while (largo <= 0) {
            System.out.print("Dame largura del rectángulo: ");
            largo = entrada.nextDouble();
        }
        return largo;
    }

    public static double obtenerAncho() {
        double ancho = 0;
        while (ancho <= 0) {
            System.out.print("Dame anchura del rectángulo: ");
            ancho = entrada.nextDouble();
        }
        return ancho;
    }

    public static double calcularArea(double largura, double anchura) {
        return largura * anchura;
    }

    public static void mostrarDatos(double largura, double anchura, double area) {
        System.out.println("Largura: " + largura);
        System.out.println("Anchura: " + anchura);
        System.out.println("Área: " + area);
    }

    public static void main(String[] args) {
        System.out.println("Área de un rectángulo");

        double larguraRectangulo = obtenerLargo();
        double anchuraRectangulo = obtenerAncho();
        double areaRectangulo = calcularArea(larguraRectangulo, anchuraRectangulo);

        mostrarDatos(larguraRectangulo, anchuraRectangulo, areaRectangulo);
    }


}
