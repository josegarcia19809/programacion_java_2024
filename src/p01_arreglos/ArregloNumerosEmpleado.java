package p01_arreglos;

public class ArregloNumerosEmpleado {
    public static void main(String[] args) {
        int[] numerosDeEmpleado = {1234, 2345, 4563, 5432, 7685, 7654};
        System.out.println("-".repeat(100));
        System.out.println("Longitud del arreglo: " + numerosDeEmpleado.length);
        // Mostrar todos los números de empleado
        for (int i = 0; i < numerosDeEmpleado.length; i++) {
            System.out.println("No de empleado #" + (i + 1) + ": " + numerosDeEmpleado[i]);
        }
    }
}
