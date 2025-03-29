package p01_arreglos;

public class ConversorMayusculasMinusculas {
    public static void main(String[] args) {
        String[] ciudades = {"Ciudad de México", "New York", "Paris", "Londres", "Tokio",
                "San Felipe del Progreso"};
        for (String ciudad : ciudades) {
            System.out.print(ciudad + " - ");
            System.out.print(ciudad.toUpperCase() + " - ");
            System.out.print(ciudad.toLowerCase() + "\n");
        }
    }
}
