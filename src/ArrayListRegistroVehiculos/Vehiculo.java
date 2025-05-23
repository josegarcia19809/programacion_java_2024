package ArrayListRegistroVehiculos;

public class Vehiculo {
    private int id;
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    // Constructor

    public Vehiculo(int id, String marca, String modelo, int anio, double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }


    // Getter y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // toString
    @Override
    public String toString() {
        String salida = String.format("%6d %15s %15s %6d %8.2f",
                this.id, this.marca, this.modelo, this.anio, this.precio);
        return salida;
    }
}
