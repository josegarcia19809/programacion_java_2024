package ArrayListPacientesVeterinaria;

import java.util.Scanner;

public class PacientesPrueba {
    static Scanner entrada = new Scanner(System.in);
    static PacientesOperaciones veterinaria = new PacientesOperaciones("veterinaria.txt");

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
        veterinaria.guardarPacientesEnArchivo();
    }

    public static void imprimirLinea() {
        System.out.println();
        System.out.println("-".repeat(100));
    }

    public static void mostrarPacientesPorEspecie() {
        entrada.nextLine();
        System.out.print("Dame especie a buscar: ");
        String especie = entrada.nextLine();
        veterinaria.buscarPacientesPorEspecie(especie);
    }

    public static void main(String[] args) {
        veterinaria.mostrarTodosLosPacientes();
        int opcion;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    pedirDatos();
                    veterinaria.mostrarTodosLosPacientes();
                    break;
                case 2:
                    veterinaria.mostrarTodosLosPacientes();
                    break;
                case 3:
                    mostrarPacientesPorEspecie();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (opcion != 6);
    }

    private static void menu() {
        imprimirLinea();
        System.out.println("Pacientes de una veterinaria");
        System.out.println("1. Ingresar paciente");
        System.out.println("2. Mostrar pacientes");
        System.out.println("3. Pacientes por especie");
        System.out.println("4. Buscar pacientes por nombre");
        System.out.println("5. Listar pacientes con edad mayor o igual a cierto valor");
        System.out.println("6. Salir");
        System.out.print("Opción: ");
    }
}
