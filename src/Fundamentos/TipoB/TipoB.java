package Fundamentos.TipoB;

public class TipoB {
    public static void main(String[] args) {
        int numeroLista = 15;

        double pesoKilogramos = (double) (numeroLista * numeroLista) / 100.0;
        int distanciaKm = numeroLista * 30;
        int tipoServicio = (numeroLista % 3) + 1;

        double factorTarifa = 0.5;
        String nombreServicio = "Estándar";

        if (tipoServicio == 1) {
            factorTarifa = 0.85;
            nombreServicio = "Urgente (48h)";
        } else if (tipoServicio == 2) {
            factorTarifa = 0.5;
            nombreServicio = "Estándar (3-5 días)";
        } else if (tipoServicio == 3) {
            factorTarifa = 0.3;
            nombreServicio = "Económico (1 semana)";
        }

        double costeTotal = (distanciaKm * factorTarifa * pesoKilogramos) / 1000.0;

        System.out.println("--- Parámetros del Envío ---");
        System.out.println("Identificador del Paquete: " + numeroLista);
        System.out.printf("Peso del Paquete: %.2f kg%n", pesoKilogramos);
        System.out.println("Distancia a Recorrer: " + distanciaKm + " km");
        System.out.println("Tipo de Servicio: " + tipoServicio + " (" + nombreServicio + ")");
        System.out.println("Factor de Tarifa Aplicado: " + factorTarifa);

        System.out.println("\n--- Cálculo de Coste ---");
        System.out.printf("El Coste Total del Envío es: $%.2f%n", costeTotal);
    }
}
