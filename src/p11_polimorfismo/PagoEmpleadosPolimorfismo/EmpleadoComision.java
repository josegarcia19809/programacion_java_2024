package p11_polimorfismo.PagoEmpleadosPolimorfismo;

public class EmpleadoComision extends Empleado {
    private double ventas;
    private double porcentajeComision;

    public EmpleadoComision(String nombre, double salarioBase, double ventas,
                            double porcentajeComision) {
        super(nombre, salarioBase);
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (ventas * porcentajeComision);
    }

    @Override
    public String toString() {
        return String.format(
                "Nombre: %s, Cargo: Empleado por Comisión, Ventas: $%.2f, Comisión: %.2f%%, Salario total: $%.2f",
                nombre, ventas, porcentajeComision * 100, calcularSalario()
        );
    }

}

