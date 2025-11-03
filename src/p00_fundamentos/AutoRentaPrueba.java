package p00_fundamentos;

class AutoRenta {
    private String modelo;
    private int anio;
    private double tarifaDiaria;

    // Constructor
    public AutoRenta(String modelo, int anio, double tarifaDiaria) {
        this.modelo = modelo;
        this.anio = anio;
        this.tarifaDiaria = tarifaDiaria;
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

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void setTarifaDiaria(double tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

    // Método para devolver la información con formato
    public String obtenerDatos() {
        String salida = String.format("%-20s %-10d $%-15.2f",
                this.modelo, this.anio, this.tarifaDiaria);
        return salida;
    }
}

public class AutoRentaPrueba {
    public static void main(String[] args) {
        AutoRenta auto1 = new AutoRenta("Nissan Versa", 2022, 850.00);
        AutoRenta auto2 = new AutoRenta("Toyota Corolla", 2021, 920.00);
        AutoRenta auto3 = new AutoRenta("Mazda CX-5", 2023, 1200.00);

        System.out.println("-".repeat(100));
        // Modificar el año del segundo auto
        auto2.setAnio(2025);

        // Mostrar el dato modificado
        System.out.println("Año actualizado: " + auto2.getAnio());
        System.out.println();

        // ¿Cómo modificas el modelo del tercer auto?

        // Mostrar la información de las 3 instancias
        // Generar el encabezado
        System.out.printf("%-20s %-10s %-15s %n", "Modelo", "Año", "Tarifa");
        System.out.println("-".repeat(50));
        System.out.println(auto1.obtenerDatos());
        System.out.println(auto2.obtenerDatos());
        System.out.println(auto3.obtenerDatos());
    }
}
