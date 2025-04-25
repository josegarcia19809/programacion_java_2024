package p09_agregacion.EscuelaDirector;

public class Director {
    private String nombre;
    private int edad;
    private String nivelEstudios;
    private double sueldo;

    // Constructor
    public Director(String nombre, int edad, String nivelEstudios, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelEstudios = nivelEstudios;
        this.sueldo = sueldo;
    }

    // Métodos get
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNivelEstudios() {
        return this.nivelEstudios;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    @Override
    public String toString() {
        String salida = String.format("Nombre: %s, edad: %d, Nivel de estudios: %s," +
                        " Sueldo: $%.2f", this.getNombre(), this.getEdad(),
                this.getNivelEstudios(), this.getSueldo());
        return salida;
    }
}
