package Fundamentos.TipoA;

public class CalculoInventario {

    public static void main(String[] args) {
        int cantidadInicial = 500;

        int stockBase = cantidadInicial;

        int totalUnidades = 0;
        final int SEMANAS_PEDIDO = 5;

        int incrementoSemanal = 2 * stockBase;

        for (int semana = 1; semana <= SEMANAS_PEDIDO; semana++) {
            totalUnidades += incrementoSemanal * semana;
        }

        System.out.println(totalUnidades);
    }
}
