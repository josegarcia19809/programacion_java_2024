package p03_metodos;

public class FuncionSumar {
    public static void sumar(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("La suma es " + resultado);
    }

    public static void main(String[] args) {
        sumar(3, 4); // 7
        sumar(10, 2.5); // 12.5
        sumar(2.2, 1); // 3.2
        sumar(7.8, 3.2); // 11.0
    }

}
