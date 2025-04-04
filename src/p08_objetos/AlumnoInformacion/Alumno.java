package p08_objetos.AlumnoInformacion;

public class Alumno {
    // Atributos o campos
    private String noCuenta;
    private String nombre;
    private String asignatura;
    private double parcial1;
    private double parcial2;

    // Operaciones o métodos
    public void establecerNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void establecerPrimerParcial(double parcial1) {
        this.parcial1 = parcial1;
    }

    public void establecerSegundoParcial(double parcial2) {
        this.parcial2 = parcial2;
    }

    public String obtenerDatos() {
        String salida = "";
        salida += "Tu cuenta es " + this.noCuenta;
        salida += "\nTe llamas " + this.nombre;
        salida += "\nTu asignatura es " + this.asignatura;
        salida += "\nTus calificaciones son:";
        salida += "\n\tPrimer parcial: " + this.parcial1;
        salida +="\n\tSegundo parcial: " + this.parcial2;
        return salida;
    }
}
