package p03_metodos;

import java.util.Scanner;

/*
 * Una papelería vende lapices a $4.00 cada uno, gomas a $2.50, y brujulas a $12.00.
 * Escribe 3 métodos para calcular el gasto de cada artículo. Cada métod0 preguntará
 * la cantidad y mostrará el total de ese artículo
 * */
public class GastosPapeleria {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        cobrarVentaLapices();
        cobrarVentaGomas();
        cobrarVentaBrujulas();
    }

    public static void cobrarVentaLapices() {

        double precioLapiz = 4.00;
        System.out.print("Cuántos lápices quieres? ");
        int cantidad = entrada.nextInt();
        double totalVentaLapices = precioLapiz * cantidad;
        System.out.println("Cobro de lapices: " + totalVentaLapices);
        imprimirLinea();
    }

    public static void cobrarVentaGomas() {

        double precioGoma = 2.50;
        System.out.print("Cuántas gomas quieres? ");
        int cantidad = entrada.nextInt();
        double totalVentaGomas = precioGoma * cantidad;
        System.out.println("Cobro de gomas: " + totalVentaGomas);
        imprimirLinea();
    }

    public static void cobrarVentaBrujulas() {

        double precioBrujula = 12;
        System.out.print("Cuántas brujulas quieres? ");
        int cantidad = entrada.nextInt();
        double totalVentaBrujulas = precioBrujula * cantidad;
        System.out.println("Cobro de brujulas: " + totalVentaBrujulas);
        imprimirLinea();
    }

    public static void imprimirLinea() {
        System.out.println("-".repeat(100));
    }
}
