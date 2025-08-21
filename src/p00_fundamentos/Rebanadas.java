package p00_fundamentos;

public class Rebanadas {
    public static void main(String[] args) {
        // Rebanadas iniciales
        int rebanadasIniciales = 10;

        // Rebanadas que ordenaron después
        int rebanadasOrdenadas = 20;

        // Número de personas
        int personas = 5;

        // Total de rebanadas
        int totalRebanadas = rebanadasIniciales + rebanadasOrdenadas;

        // Rebanadas por persona
        int rebanadasPorPersona = totalRebanadas / personas;

        // Mostrar resultados
        System.out.println("🍕 Total de rebanadas: " + totalRebanadas);
        System.out.println("👥 Rebanadas por persona: " + rebanadasPorPersona);
    }
}
