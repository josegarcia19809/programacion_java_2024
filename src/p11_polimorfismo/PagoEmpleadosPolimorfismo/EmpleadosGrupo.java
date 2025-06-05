package p11_polimorfismo.PagoEmpleadosPolimorfismo;

import p11_polimorfismo.FacturacionRestaurante.Plato;
import p11_polimorfismo.FacturacionRestaurante.PlatoPrincipal;

public class EmpleadosGrupo {
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

        System.out.println(empleadoTemporal1);
        System.out.println(empleadoTemporal2);
        System.out.println("========================================");

        double total =
                empleadoBase1.calcularSalario() +
                        empleadoBase2.calcularSalario() +
                        empleadoEjecutivo1.calcularSalario() +
                        empleadoEjecutivo2.calcularSalario() +
                        empleadoHoras1.calcularSalario() +
                        empleadoHoras2.calcularSalario() +
                        empleadoTemporal1.calcularSalario() +
                        empleadoTemporal2.calcularSalario();

        System.out.println("\nSalario de los otros empleados a pagar: $" + total);

        Empleado empleadoPorComision;
        for (int noLista = 1; noLista <= 42; noLista++) {
            System.out.println();
            System.out.println("---------------------------------" + noLista);
            double salarioBase = noLista * 80;
            double ventas = noLista * 90;


            empleadoPorComision = new EmpleadoComision("José Luis",
                    salarioBase, ventas, (double) noLista / 100.0);

            System.out.println(empleadoPorComision);

            System.out.printf("Total: %,.2f" , (total + empleadoPorComision.calcularSalario()));
        }
    }
}
