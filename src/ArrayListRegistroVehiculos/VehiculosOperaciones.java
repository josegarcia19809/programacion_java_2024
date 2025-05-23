package ArrayListRegistroVehiculos;

import java.util.ArrayList;

public class VehiculosOperaciones {
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    // Constructor
    public VehiculosOperaciones() {
        vehiculos.add(new Vehiculo(301, "Toyota", "Corolla", 2020, 220000.00));
        vehiculos.add(new Vehiculo(302, "Honda", "Civic", 2019, 210000.00));
        vehiculos.add(new Vehiculo(303, "Ford", "Mustang", 2021, 450000.00));
        vehiculos.add(new Vehiculo(304, "Nissan", "Sentra", 2018, 180000.00));
        vehiculos.add(new Vehiculo(305, "Chevrolet", "Onix", 2022, 230000.00));
        vehiculos.add(new Vehiculo(306, "Mazda", "CX-5", 2021, 370000.00));
        vehiculos.add(new Vehiculo(307, "Hyundai", "Elantra", 2020, 195000.00));
    }

    public void ingresarVehiculo(Vehiculo nuevoVehiculo) {
        vehiculos.add(nuevoVehiculo);
    }

    private void imprimirLineaPuntos() {
        System.out.println(".".repeat(100));
    }

    private void imprimirCabeceraTabla() {
        String cabecera = String.format("%6s %15s %15s %6s %8s",
                "id", "Marca", "Modelo", "Año", "Precio");
        System.out.println(cabecera);
        imprimirLineaPuntos();
    }

    private void mostrarVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        System.out.println();
        imprimirCabeceraTabla();
        for (int i = 0; i < listaVehiculos.size(); i++) {
            System.out.println(listaVehiculos.get(i));
        }
    }

    public void mostrarVehiculos() {
        mostrarVehiculos(vehiculos);
    }
}
