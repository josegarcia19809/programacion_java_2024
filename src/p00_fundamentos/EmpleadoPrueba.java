package p00_fundamentos;

class Empleado {
    String nombre;
    int idNumero;
    String departamento;
    String puesto;

    public String obtenerDatos() {
        String salida = "Id: " + this.idNumero +
                "\nNombre: " + this.nombre +
                "\nDepartamento: " + this.departamento +
                "\nPuesto: " + this.puesto;
        return salida;
    }
}


public class EmpleadoPrueba {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Susana Mendez";
        empleado1.idNumero = 47899;
        empleado1.departamento = "Contabilidad";
        empleado1.puesto = "Vicepresidente";

        Empleado empleado2 = new Empleado();
        empleado2.nombre = "Marco Jonas";
        empleado2.idNumero = 39119;
        empleado2.departamento = "TI";
        empleado2.puesto = "Programador";

        Empleado empleado3 = new Empleado();
        empleado3.nombre = "Roberto Guadarrama";
        empleado3.idNumero = 81774;
        empleado3.departamento = "Fabricación";
        empleado3.puesto = "Ingeniero";

        System.out.println(empleado1.obtenerDatos());
        System.out.println("-".repeat(100));
        System.out.println(empleado2.obtenerDatos());
        System.out.println("-".repeat(100));
        System.out.println(empleado3.obtenerDatos());
        System.out.println("-".repeat(100));
    }

}
