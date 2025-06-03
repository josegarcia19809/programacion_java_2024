package p11_polimorfismo.PagoEmpleadosPolimorfismo;

public class EmpleadoBase extends Empleado {

    public EmpleadoBase(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cargo: Empleado Base, Salario total: $" +
                calcularSalario();
    }
}


