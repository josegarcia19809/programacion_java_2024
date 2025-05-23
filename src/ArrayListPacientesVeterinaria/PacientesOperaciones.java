package ArrayListPacientesVeterinaria;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PacientesOperaciones {
    ArrayList<PacienteVeterinario> pacientes = new ArrayList<>();
    private String nombreArchivo;

    public PacientesOperaciones(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        crearArchivoSiNoExiste(nombreArchivo);
        cargarPacientesDesdeArchivo();
    }

    private void crearArchivoSiNoExiste(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                // Crear archivo vacío
                PrintWriter nuevoArchivo = new PrintWriter(archivo);
                nuevoArchivo.close();
            } catch (IOException e) {
                System.err.println("No se pudo crear el archivo");
                System.exit(1);
            }
        }
    }

    public void cargarPacientesDesdeArchivo() {
        pacientes.clear();
        try {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists()) {
                return;
            }
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                PacienteVeterinario paciente = PacienteVeterinario.desdeArchivo(linea);
                pacientes.add(paciente);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo " +
                    e.getMessage());
        }
    }

    public void guardarPacientesEnArchivo() {
        try {
            File archivo = new File(nombreArchivo);
            PrintWriter escritor = new PrintWriter(archivo);

            for (PacienteVeterinario paciente : pacientes) {
                escritor.println(paciente.formatoArchivo());
            }
            escritor.close();

        } catch (Exception e) {
            System.out.println("Error al guardar el archivo: " +
                    e.getMessage());
        }
    }

    public ArrayList<PacienteVeterinario> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<PacienteVeterinario> pacientes) {
        this.pacientes = pacientes;
    }

    public void ingresarPaciente(PacienteVeterinario nuevoPaciente) {
        pacientes.add(nuevoPaciente);
    }

    public void mostrarPacientes(ArrayList<PacienteVeterinario> listaPacientes) {
        System.out.println("-".repeat(100));
        System.out.println("Pacientes");
        System.out.println("-".repeat(20));
        for (int i = 0; i < listaPacientes.size(); i++) {
            System.out.println("id: " + listaPacientes.get(i).getIdPaciente());
            System.out.println("Nombre: " + listaPacientes.get(i).getNombre());
            System.out.println("Especie: " + listaPacientes.get(i).getEspecie());
            System.out.println("Edad: " + listaPacientes.get(i).getEdad());
            System.out.println("Diagnóstico: " + listaPacientes.get(i).getDiagnostico());
            System.out.println();
        }
    }

    public void mostrarTodosLosPacientes() {
        mostrarPacientes(pacientes);
    }

    public void buscarPacientesPorEspecie(String especie) {
        ArrayList<PacienteVeterinario> listaPorEspecie = new ArrayList<>();
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getEspecie().equals(especie)) {
                listaPorEspecie.add(pacientes.get(i));
            }
        }
        mostrarPacientes(listaPorEspecie);
    }
}
