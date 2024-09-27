package p02_recursividad;

public class FactorialV1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("El factorial de " + i +
                    " es " + factorial(i));
        }
    }

    public static long factorial(long n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
