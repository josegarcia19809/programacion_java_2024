package p00_fundamentos;

public class OperacionesBasicas {
    public static void main(String[] args) {
        // Declaración de variables
        int numero1 = 50;
        int numero2 = 10;

        // Operaciones aritméticas
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / numero2; // conversión a double

        // Imprimir resultados
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es " + suma);
        System.out.println("La resta de " + numero1 + " - " + numero2 + " es " + resta);
        System.out.println("La multiplicación de " + numero1 + " * " + numero2 +
                " es " + multiplicacion);
        System.out.println("La división de " + numero1 + " / " + numero2 + " es " + division);
    }
}

