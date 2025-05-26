package ArrayListRegistroVehiculos;

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;


public class VehiculosOperaciones {
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private String nombreArchivo;

    // Constructor
    public VehiculosOperaciones(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        crearArchivoSiNoExiste(nombreArchivo);
        cargarVehiculosDesdeArchivo();
    }

    public static void crearArchivoSiNoExiste(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                // Crear archivo vacío
                PrintWriter nuevoArchivo = new PrintWriter(archivo);
                nuevoArchivo.close();
            } catch (IOException e) {
                System.out.println("No se pudo crear el archivo");
                System.exit(1);
            }
        }
    }

    public void cargarVehiculosDesdeArchivo() {
        vehiculos.clear();
        try {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists()) {
                return;
            }
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                Vehiculo nuevoVehiculo = Vehiculo.desdeArchivo(linea);
                vehiculos.add(nuevoVehiculo);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo " +
                    e.getMessage());
        }
    }

    public void guardarVehiculosEnArchivo() {
        try {
            File archivo = new File(nombreArchivo);
            PrintWriter escritor = new PrintWriter(archivo);

            for (Vehiculo v : vehiculos) {
                escritor.println(v.formatoArchivo());
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("Error al guardar en el archivo " +
                    nombreArchivo);
        }
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

    public void mostrarTodosLosVehiculos() {
        mostrarVehiculos(vehiculos);
    }

    public void buscarVehiculosPorMarca(String marca) {
        ArrayList<Vehiculo> listaPorMarca = new ArrayList<>();
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getMarca().equals(marca)) {
                listaPorMarca.add(vehiculos.get(i));
            }
        }
        mostrarVehiculos(listaPorMarca);
    }
}
