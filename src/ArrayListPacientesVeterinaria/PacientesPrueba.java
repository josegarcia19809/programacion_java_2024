package ArrayListPacientesVeterinaria;

import java.util.Scanner;

public class PacientesPrueba {
    static Scanner entrada = new Scanner(System.in);
    static PacientesOperaciones veterinaria = new PacientesOperaciones();

    public static void pedirDatos() {
        System.out.println("Datos del paciente");

        System.out.print("Id: ");
        int idx = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nombre: ");
        String nombrex = entrada.nextLine();

        System.out.print("Especie: ");
        String especiex = entrada.nextLine();

        System.out.print("Edad: ");
        int edadx = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Diagnóstico: ");
        String diagnosticox = entrada.nextLine();

        PacienteVeterinario nuevoPaciente = new PacienteVeterinario(idx, nombrex,
                especiex, edadx, diagnosticox);
        veterinaria.ingresarPaciente(nuevoPaciente);
    }

    public static void main(String[] args) {
        veterinaria.mostrarTodosLosPacientes();
        System.out.println("-".repeat(50));
        System.out.println();
        System.out.println("Mostrando la especie Perro");
        veterinaria.buscarPacientesPorEspecie("Perro");
    }
}
