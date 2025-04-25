package p09_agregacion.EmpresaEmpleado;

public class Empresa {
    private String nombreEmpresa;
    private String tipoProduccion;
    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;

    // Constructor
    public Empresa(String nombre, String tipo, Empleado e1, Empleado e2, Empleado e3) {
        this.nombreEmpresa = nombre;
        this.tipoProduccion = tipo;
        this.empleado1 = e1;
        this.empleado2 = e2;
        this.empleado3 = e3;
    }

    @Override
    public String toString() {
        String salida = String.format("Nombre: %s, tipo de producción: %s",
                this.nombreEmpresa, this.tipoProduccion);
        salida += "\n";
        salida += String.format("%6s %15s %10s %15s",
                "Clave", "Nombre", "Salario", "Puesto");
        salida += "\n";
        salida += "-".repeat(60);
        salida += "\n";

        salida += String.format("%s %n", this.empleado1.toString());
        salida += String.format("%s %n", this.empleado2.toString());
        salida += String.format("%s %n", this.empleado3.toString());
        return salida;
    }
}
