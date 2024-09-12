package p01_arreglos;

// Este programa demuestra cómo pasar elementos individuales de un arreglo como argumentos a un método
public class PasoDeElementos {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40};
        mostrarValor(numeros[0]); // 5
        mostrarValor(numeros[3]); // 20

    }

    public static void mostrarValor(int n) {
        System.out.print(n + " ");
    }
}
