package p09_agregacion.EmpresaEmpleado;

import java.util.Scanner;

public class PruebaEmpresa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int clavex;
        String nombreEmpleadox, puestox;
        double salariox;

        // Datos del empleado 1
        System.out.println("Empleado 1");

        System.out.print("Clave: ");
        clavex = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nombre: ");
        nombreEmpleadox = entrada.nextLine();

        System.out.print("Salario: ");
        salariox = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Puesto: ");
        puestox = entrada.nextLine();

        Empleado empleado1 = new Empleado(clavex, nombreEmpleadox, salariox, puestox);

        System.out.println(".".repeat(50));
        // Datos del empleado 2
        System.out.println("Empleado 2");

        System.out.print("Clave: ");
        clavex = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nombre: ");
        nombreEmpleadox = entrada.nextLine();

        System.out.print("Salario: ");
        salariox = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Puesto: ");
        puestox = entrada.nextLine();

        Empleado empleado2 = new Empleado(clavex, nombreEmpleadox, salariox, puestox);
        System.out.println(".".repeat(50));

        // Datos del empleado 3
        System.out.println("Empleado 3");

        System.out.print("Clave: ");
        clavex = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nombre: ");
        nombreEmpleadox = entrada.nextLine();

        System.out.print("Salario: ");
        salariox = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Puesto: ");
        puestox = entrada.nextLine();

        Empleado empleado3 = new Empleado(clavex, nombreEmpleadox, salariox, puestox);
        System.out.println(".".repeat(50));

        // Pedir los datos de la empresa
        System.out.print("Nombre de la empresa: ");
        String nombreEmpresa = entrada.nextLine();

        System.out.print("Tipo de producción: ");
        String tipoProduccion = entrada.nextLine();

        Empresa miEmpresa = new Empresa(nombreEmpresa, tipoProduccion, empleado1,
                empleado2, empleado3);
        System.out.println();
        System.out.println(".".repeat(50));

        System.out.println("Datos de la empresa");
        System.out.println(miEmpresa.toString());
    }
}
