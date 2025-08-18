package p00_fundamentos;

// Este programa calcula los salarios semanales
// incluyendo pago por horas extra.

public class Salarios {
    public static void main(String[] args) {
        double salarioRegular;   // Salario calculado normal
        double pagoBase = 25;    // Tarifa base por hora
        double horasRegulares = 40;  // Horas trabajadas sin extra
        double salarioExtra;     // Salario por horas extra
        double pagoExtra = 37.5; // Tarifa por hora extra
        double horasExtra = 10;  // Horas extra trabajadas
        double salarioTotal;     // Salario total

        // Calcular salarios
        salarioRegular = pagoBase * horasRegulares;
        salarioExtra = pagoExtra * horasExtra;
        salarioTotal = salarioRegular + salarioExtra;

        // Mostrar resultados
        System.out.println("El salario de esta semana es $" + salarioTotal);
    }
}

