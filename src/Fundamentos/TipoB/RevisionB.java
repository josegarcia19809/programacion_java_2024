package Fundamentos.TipoB;

public class RevisionB {
    public static void main(String[] args) {
        for (int numeroLista = 18; numeroLista <= 34; numeroLista++) {
            System.out.println("Numero Lista: " + ".".repeat(50) + numeroLista);
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
            System.out.println("Tipo de Servicio: " + tipoServicio + " (" + nombreServicio + ")");
            System.out.println("Factor de Tarifa Aplicado: " + factorTarifa);
            System.out.printf("El Coste Total del Envío es: $%.2f%n", costeTotal);

            System.out.println();
            int factorVenta = numeroLista;

            int totalComision = 0;
            final int ETAPAS_VENTA = 5;

            int comisionBaseEtapa = 2 * factorVenta;

            for (int etapa = 1; etapa <= ETAPAS_VENTA; etapa++) {
                totalComision += comisionBaseEtapa * etapa;
            }
            System.out.println(totalComision);
            System.out.println();
        }
    }
}
