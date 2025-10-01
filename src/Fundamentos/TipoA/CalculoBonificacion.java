package Fundamentos.TipoA;

public class CalculoBonificacion {
    public static void main(String[] args) {
        int numeroLista = 23;
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

        System.out.println("--- Evaluación de Bonificación ---");
        System.out.println("ID del Empleado: " + id_empleado);
        System.out.printf("Años de Servicio: %.1f%n", tiempo_servicio);
        System.out.printf("Factor de Rendimiento Base: %.2f%n", factor_rendimiento);
        System.out.println("Área de Trabajo (" + tipo_area + "): " + nombre_area);
        System.out.println("Multiplicador de Área: " + multiplicador_bono);

        System.out.println("---------------------------------");
        System.out.printf("Bonificación Total Estimada: $%.2f%n", bonificacion_final);
    }
}