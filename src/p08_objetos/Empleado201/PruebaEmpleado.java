package p08_objetos.Empleado201;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.establecerNombre("Susana Mendez");
        empleado1.establecerIdNumero(47899);
        empleado1.establecerDepartamento("contabilidad");
        empleado1.establecerPuesto("Vicepresidente");

        Empleado empleado2 = new Empleado();
        empleado2.establecerNombre("Marco Jonas");
        empleado2.establecerIdNumero(39119);
        empleado2.establecerDepartamento("TI");
        empleado2.establecerPuesto("Programador");

        Empleado empleado3 = new Empleado();
        empleado3.establecerNombre("Roberto Guadarrama");
        empleado3.establecerIdNumero(81774);
        empleado3.establecerDepartamento("fabricación");
        empleado3.establecerPuesto("Ingeniero");

        System.out.println(empleado1.obtenerDatos());
        System.out.println(empleado2.obtenerDatos());
        System.out.println(empleado3.obtenerDatos());

    }
}
