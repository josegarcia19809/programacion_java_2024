package CopiaArrayListPacientesVeterinaria;

import java.util.Scanner;

public class PacientesPrueba1 {
    static Scanner entrada = new Scanner(System.in);
    static PacientesOperaciones1 veterinaria = new PacientesOperaciones1("veterinaria_pacientes.txt");

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

        PacienteVeterinario1 nuevoPaciente = new PacienteVeterinario1(idx, nombrex,
                especiex, edadx, diagnosticox);
        veterinaria.ingresarPaciente(nuevoPaciente);
        veterinaria.guardarPacientesEnArchivo();
    }

    public static void main(String[] args) {
        //pedirDatos();
        veterinaria.mostrarTodosLosPacientes();
//        System.out.println("-".repeat(50));
//        System.out.println();
//        System.out.println("Mostrando la especie Perro");
//        veterinaria.buscarPacientesPorEspecie("Perro");
    }
}
