package p11_polimorfismo.PagoEmpleadosPolimorfismo;

public class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cargo: Empleado, Salario total: $" + calcularSalario();
    }
}

