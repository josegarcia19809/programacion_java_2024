package p03_metodos;

public class Sumando {
    public static void mostrarSuma(double num1, double num2) {
        double sumaTotal;
        sumaTotal = num1 + num2;
        System.out.println("La suma es " + sumaTotal);
    }

    public static void main(String[] args) {
        mostrarSuma(10, 5);
        double valor1 = 2.5;
        double valor2 = 3.5;
        mostrarSuma(valor1, valor2);
    }
}
