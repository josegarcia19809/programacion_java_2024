package p11_polimorfismo.PagoServiciosPolimorfismo;

// Clase base
public class Servicio {
    protected String nombre;

    public Servicio(String nombre) {
        this.nombre = nombre;
    }

    public double calcularPago() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Servicio: " + nombre;
    }
}

