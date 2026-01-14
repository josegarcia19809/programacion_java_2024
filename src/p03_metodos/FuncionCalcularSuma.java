package p03_metodos;

public class FuncionCalcularSuma {

    public static int calcularSuma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static double calcularDivision(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static void main(String[] args) {
        int suma = calcularSuma(7, 9);
        System.out.println("La suma es " + suma);

        double division = calcularDivision(7, 3);
        System.out.println("La división es " + division);
    }
}
