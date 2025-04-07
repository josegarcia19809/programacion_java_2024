package p08_objetos.AutoRentaApp;

public class AutoRenta {
    private String modelo;
    private int anio;
    private double tarifaDiaria;

    // Constructor
    public AutoRenta(String modelo, int anio, double tarifaDiaria) {
        this.modelo = modelo;
        this.anio = anio;
        this.tarifaDiaria = tarifaDiaria;
    }

    // Método para devolver la información con formato
    public String obtenerDatos() {
        String salida = String.format("%-20s %-10d $%-15.2f",
                this.modelo, this.anio, this.tarifaDiaria);
        return salida;
    }
}


