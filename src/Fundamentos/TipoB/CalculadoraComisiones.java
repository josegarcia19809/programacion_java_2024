package Fundamentos.TipoB;

public class CalculadoraComisiones {

    public static void main(String[] args) {
        int factorVenta = 50;

        int totalComision = 0;
        final int ETAPAS_VENTA = 5;

        int comisionBaseEtapa = 2 * factorVenta;

        for (int etapa = 1; etapa <= ETAPAS_VENTA; etapa++) {
            totalComision += comisionBaseEtapa * etapa;
        }

        System.out.println(totalComision);
    }
}
