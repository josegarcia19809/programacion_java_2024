package p09_agregacion.EmpresaEmpleado;

public class Empleado {
    private int clave;
    private String nombre;
    private double salario;
    private String puesto;

    // Constructor
    public Empleado(int clave, String nombre, double salario, String puesto) {
        this.clave = clave;
        this.nombre = nombre;
        this.salario = salario;
        this.puesto = puesto;
    }

    // Métodos set y get
    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getClave() {
        return this.clave;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getPuesto() {
        return this.puesto;
    }

    @Override
    public String toString() {
        String salida =
                String.format("%6d %15s %10.2f %15s",
                        this.clave, this.nombre, this.salario, this.puesto);
        return salida;
    }
}
