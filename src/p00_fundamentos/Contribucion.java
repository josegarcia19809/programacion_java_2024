package p00_fundamentos;

// Este programa calcula la cantidad de dinero que se contribuirá a un plan de retiro
// si se descuenta el 5%, 8% o 10% del salario mensual.

public class Contribucion {
    public static void main(String[] args) {
        // Variables para almacenar el salario mensual y la cantidad de la contribución
        double salarioMensual = 6000.0;
        double contribucion;

        // Calcular y mostrar la contribución del 5%
        contribucion = salarioMensual * 0.05;
        System.out.println("El 5% es $" + contribucion + " por mes.");

        // Calcular y mostrar la contribución del 8%
        contribucion = salarioMensual * 0.08;
        System.out.println("El 8% es $" + contribucion + " por mes.");

        // Calcular y mostrar la contribución del 10%
        contribucion = salarioMensual * 0.10;
        System.out.println("El 10% es $" + contribucion + " por mes.");
        System.out.println("-".repeat(100));
    }
}

