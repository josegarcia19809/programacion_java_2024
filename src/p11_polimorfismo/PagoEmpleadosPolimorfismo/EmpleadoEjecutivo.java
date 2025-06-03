package p11_polimorfismo.PagoEmpleadosPolimorfismo;

public class EmpleadoEjecutivo extends Empleado {
    private double bono;

    public EmpleadoEjecutivo(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cargo: Empleado Ejecutivo, Bono: $" + bono +
                ", Salario total: $" + calcularSalario();
    }
}

