package p11_polimorfismo.PagoEmpleadosPolimorfismo;

public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, 0); // salarioBase no se usa aquí
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cargo: Empleado por Horas, " +
                "Horas trabajadas: " + horasTrabajadas + ", Tarifa/hora: $" + tarifaPorHora +
                ", Salario total: $" + calcularSalario();
    }
}

