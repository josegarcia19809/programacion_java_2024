package p11_polimorfismo.PagoEmpleadosPolimorfismo;

public class EmpleadoTemporal extends Empleado {
    private boolean contratoCumplido;

    public EmpleadoTemporal(String nombre, double salarioBase, boolean contratoCumplido) {
        super(nombre, salarioBase);
        this.contratoCumplido = contratoCumplido;
    }

    @Override
    public double calcularSalario() {
        return contratoCumplido ? salarioBase : 0;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cargo: Empleado Temporal, Contrato cumplido: " +
                (contratoCumplido ? "Sí" : "No") + ", Salario total: $" + calcularSalario();
    }
}
