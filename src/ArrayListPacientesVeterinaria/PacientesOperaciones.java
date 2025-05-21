package ArrayListPacientesVeterinaria;

import java.util.ArrayList;

public class PacientesOperaciones {
    ArrayList<PacienteVeterinario> pacientes = new ArrayList<>();

    public PacientesOperaciones() {
        // 🔹 Datos precargados
        pacientes.add(new PacienteVeterinario(101, "Max", "Perro", 5, "Alergia en la piel"));
        pacientes.add(new PacienteVeterinario(102, "Luna", "Gato", 3, "Infección urinaria"));
        pacientes.add(new PacienteVeterinario(103, "Rocky", "Perro", 8, "Problemas dentales"));
        pacientes.add(new PacienteVeterinario(104, "Pelusa", "Conejo", 2, "Parásitos intestinales"));
        pacientes.add(new PacienteVeterinario(105, "Tigre", "Gato", 6, "Fractura en la pata"));
        pacientes.add(new PacienteVeterinario(106, "Nube", "Perro", 1, "Vacunación pendiente"));
        pacientes.add(new PacienteVeterinario(107, "Copito", "Conejo", 4, "Problemas respiratorios"));
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
