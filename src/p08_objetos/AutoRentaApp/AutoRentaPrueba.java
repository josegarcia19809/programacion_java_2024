package p08_objetos.AutoRentaApp;

public class AutoRentaPrueba {
    public static void main(String[] args) {
        AutoRenta auto1 = new AutoRenta("Nissan Versa", 2022, 850.00);
        AutoRenta auto2 = new AutoRenta("Toyota Corolla", 2021, 920.00);
        AutoRenta auto3 = new AutoRenta("Mazda CX-5", 2023, 1200.00);

        // Mostrar la información de las 3 instancias
        // Generar el encabezado
        System.out.printf("%-20s %-10s %-15s %n", "Modelo", "Año", "Tarifa");
        System.out.println("-".repeat(50));
        System.out.println(auto1.obtenerDatos());
        System.out.println(auto2.obtenerDatos());
        System.out.println(auto3.obtenerDatos());
    }
}
