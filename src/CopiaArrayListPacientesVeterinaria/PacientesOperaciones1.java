package CopiaArrayListPacientesVeterinaria;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PacientesOperaciones1 {
    ArrayList<PacienteVeterinario1> pacientes = new ArrayList<>();
    private String nombreArchivo;

    public PacientesOperaciones1(String nombreArchivo) {
//        // 🔹 Datos precargados
//        pacientes.add(new PacienteVeterinario1(101, "Max", "Perro", 5, "Alergia en la piel"));
//        pacientes.add(new PacienteVeterinario1(102, "Luna", "Gato", 3, "Infección urinaria"));
//        pacientes.add(new PacienteVeterinario1(103, "Rocky", "Perro", 8, "Problemas dentales"));
//        pacientes.add(new PacienteVeterinario1(104, "Pelusa", "Conejo", 2, "Parásitos intestinales"));
//        pacientes.add(new PacienteVeterinario1(105, "Tigre", "Gato", 6, "Fractura en la pata"));
//        pacientes.add(new PacienteVeterinario1(106, "Nube", "Perro", 1, "Vacunación pendiente"));
//        pacientes.add(new PacienteVeterinario1(107, "Copito", "Conejo", 4, "Problemas respiratorios"));
        this.nombreArchivo = nombreArchivo;
        crearArchivoSiNoExiste(nombreArchivo);
        cargarPacientesDesdeArchivo();

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

    public ArrayList<PacienteVeterinario1> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<PacienteVeterinario1> pacientes) {
        this.pacientes = pacientes;
    }

    public void ingresarPaciente(PacienteVeterinario1 nuevoPaciente) {
        pacientes.add(nuevoPaciente);
    }

    public void cargarPacientesDesdeArchivo() {
        pacientes.clear();
        try {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists()) {
                return; // No hay archivo aún
            }

            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                PacienteVeterinario1 paciente = PacienteVeterinario1.desdeArchivo(linea);
                pacientes.add(paciente);
            }
            lector.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void guardarPacientesEnArchivo() {
        try {
            File archivo = new File(nombreArchivo);
            PrintWriter escritor = new PrintWriter(archivo);

            for (PacienteVeterinario1 e : pacientes) {
                escritor.println(e.formatoArchivo());
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public void mostrarPacientes(ArrayList<PacienteVeterinario1> listaPacientes) {
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
        ArrayList<PacienteVeterinario1> listaPorEspecie = new ArrayList<>();
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getEspecie().equals(especie)) {
                listaPorEspecie.add(pacientes.get(i));
            }
        }
        mostrarPacientes(listaPorEspecie);
    }
}
