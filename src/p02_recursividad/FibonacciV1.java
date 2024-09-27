package p02_recursividad;

public class FibonacciV1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static long fibonacci(long n) {
        // Casos base
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Caso recursivo
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
