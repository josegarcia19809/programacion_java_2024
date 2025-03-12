package p01_fundamentos;

import java.util.Scanner;

public class CalculadoraGramosGrasa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora de calorías grasas");
        System.out.print("Dame cantidad de Calorías Totales: ");
        double calorias = entrada.nextDouble();
        System.out.print("Dame cantidad de gramos de Grasa: ");
        double gramosGrasa = entrada.nextDouble();

        if (calorias < 0 || gramosGrasa < 0) {
            System.out.println("Los datos deben ser mayores que cero");
            return;
        }

        double caloriasGrasa = gramosGrasa * 9;

        if (caloriasGrasa > calorias) {
            System.out.println("El total de calorías de las grasas no deben ser mayores que " +
                    "el total de calorías");
            return;
        }

        double porcentajeCaloriasGrasa = (caloriasGrasa / calorias) * 100.0;

        System.out.println("Porcentaje Calorias Grasa: " + porcentajeCaloriasGrasa + "%");

        if (porcentajeCaloriasGrasa <= 15) {
            System.out.println("Tu alimento es bajo en grasas");
        }
    }
}
