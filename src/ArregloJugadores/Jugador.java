package ArregloJugadores;

public class Jugador {
    private int numero;
    private String nombre;
    private String posicion;
    private double salario;
    private int goles;
    // Constructor

    public Jugador(int numero, String nombre, String posicion, double salario, int goles) {
        this.numero = numero;
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
        this.goles = goles;
    }

    // Métodos set y get

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", salario=" + salario +
                ", goles=" + goles +
                '}';
    }
}
