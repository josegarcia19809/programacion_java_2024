package Fundamentos.TipoA;

public class RevisionA {
    public static void main(String[] args) {
        for (int numeroLista  = 1; numeroLista  <= 17; numeroLista ++) {
            System.out.println("Numero Lista: "+".".repeat(50) + numeroLista);
            int id_empleado = numeroLista * 2;
            double tiempo_servicio = id_empleado * 0.5;
            double factor_rendimiento = (double)(id_empleado * id_empleado) / 100.0;
            int tipo_area = (id_empleado % 3) + 1;
            double multiplicador_bono = 1.0;
            String nombre_area = "Soporte";

            if (tipo_area == 1) {
                multiplicador_bono = 1.5;
                nombre_area = "Investigación y Desarrollo (I+D)";
            } else if (tipo_area == 2) {
                multiplicador_bono = 1.2;
                nombre_area = "Ventas y Marketing";
            } else if (tipo_area == 3) {
                multiplicador_bono = 1.0;
                nombre_area = "Operaciones y Logística";
            }

            double bonificacion_final = (tiempo_servicio * multiplicador_bono * factor_rendimiento) / 50.0;

            System.out.println("Área de Trabajo (" + tipo_area + "): " + nombre_area);
            System.out.println("Multiplicador de Área: " + multiplicador_bono);
            System.out.printf("Bonificación Total Estimada: $%.2f%n", bonificacion_final);

            System.out.println();

            int cantidadInicial = numeroLista * 20;

            int stockBase = cantidadInicial;

            int totalUnidades = 0;
            final int SEMANAS_PEDIDO = 5;

            int incrementoSemanal = 2 * stockBase;

            for (int semana = 1; semana <= SEMANAS_PEDIDO; semana++) {
                totalUnidades += incrementoSemanal * semana;
            }
            System.out.println(totalUnidades);
            System.out.println();
        }
    }
}
