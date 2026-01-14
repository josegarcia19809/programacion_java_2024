package p01_arreglos;

public class ArregloNumeros {
    public static void main(String[] args) {
        // Declarar el arreglo
        int[] numeros;
        numeros = new int[6];

        // Asignación de valores en los elementos 0 y 3
        numeros[0] = 20;
        numeros[3] = 30;

        // Mostrando los valores del arreglo
        for (int i = 0; i <= 5; i++) {
            System.out.println("numero: " + numeros[i]);
        }

    }
}

