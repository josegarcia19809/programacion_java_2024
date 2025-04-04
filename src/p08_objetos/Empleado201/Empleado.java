package p08_objetos.Empleado201;

public class Empleado {
    private String nombre;
    private int idNumero;
    private String departamento;
    private String puesto;

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerIdNumero(int id) {
        this.idNumero = id;
    }

    public void establecerDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void establecerPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public int obtenerIdNumero() {
        return idNumero;
    }

    public String obtenerDepartamento() {
        return departamento;
    }

    public String obtenerPuesto() {
        return puesto;
    }

    public String obtenerDatos() {
        String salida = "";
        salida += "Nombre: " + this.nombre;
        salida += ", Id: " + this.idNumero;
        salida += ", Departamento: " + this.departamento;
        salida += ", Puesto: " + this.puesto;
        return salida;
    }
}
