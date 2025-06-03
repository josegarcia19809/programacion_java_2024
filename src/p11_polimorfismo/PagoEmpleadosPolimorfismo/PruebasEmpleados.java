package p11_polimorfismo.PagoEmpleadosPolimorfismo;

public class PruebasEmpleados {
    public static void main(String[] args) {

        // Empleados Base
        EmpleadoBase empleadoBase1 = new EmpleadoBase("Pedro Fernández", 2000);
        EmpleadoBase empleadoBase2 = new EmpleadoBase("Lucía Gómez", 2500);

        // Empleados Ejecutivos
        EmpleadoEjecutivo empleadoEjecutivo1 = new EmpleadoEjecutivo("Ana López", 5000, 1000);
        EmpleadoEjecutivo empleadoEjecutivo2 = new EmpleadoEjecutivo("Javier Díaz", 5200, 1500);

        // Empleados por Horas
        EmpleadoPorHoras empleadoHoras1 = new EmpleadoPorHoras("Miguel Torres", 160, 12.5);
        EmpleadoPorHoras empleadoHoras2 = new EmpleadoPorHoras("Elena Ruiz", 140, 13.0);

        // Empleados por Comisión
        EmpleadoComision empleadoComision1 = new EmpleadoComision("Luis Bravo", 1800, 20000, 0.10);
        EmpleadoComision empleadoComision2 = new EmpleadoComision("Paula Herrera", 1900, 25000, 0.12);

        // Empleados Temporales
        EmpleadoTemporal empleadoTemporal1 = new EmpleadoTemporal("Sofía Vega", 1500, true);
        EmpleadoTemporal empleadoTemporal2 = new EmpleadoTemporal("Tomás Gil", 1500, false);

        System.out.println("========== LISTA DE EMPLEADOS ==========");
        System.out.println(empleadoBase1);
        System.out.println(empleadoBase2);
        System.out.println();

        System.out.println(empleadoEjecutivo1);
        System.out.println(empleadoEjecutivo2);
        System.out.println();

        System.out.println(empleadoHoras1);
        System.out.println(empleadoHoras2);
        System.out.println();

        System.out.println(empleadoComision1);
        System.out.println(empleadoComision2);
        System.out.println();

        System.out.println(empleadoTemporal1);
        System.out.println(empleadoTemporal2);
        System.out.println("========================================");
    }
}
