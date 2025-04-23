package IntegradorGestionVacantes.VacantePaquete;

import java.util.Scanner;

public class VacantePrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declarar variables para pedir los datos
        int idx;
        String titulox, descripcionx, requisitosx, ubicacionx, tipoTrabajox;
        double salariox;

        System.out.println("Primera vacante");
        System.out.print("Dame id: ");
        idx = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Titulo de la vacante: ");
        titulox = entrada.nextLine();

        System.out.print("Descripción de la vacante: ");
        descripcionx = entrada.nextLine();

        System.out.print("Requisitos: ");
        requisitosx = entrada.nextLine();

        System.out.print("Ubicación: ");
        ubicacionx = entrada.nextLine();

        System.out.print("Tipo de trabajo: ");
        tipoTrabajox = entrada.nextLine();

        System.out.print("Salario ofrecido: ");
        salariox = entrada.nextDouble();

        // Crear una vacante
        Vacante vacante1 = new Vacante(idx, titulox,
                descripcionx, requisitosx, ubicacionx, tipoTrabajox, salariox);
//        Vacante vacante1 = new Vacante(1, "Desarrollador Java",
//                "Desarrollo de aplicaciones",
//                "Java, Spring Boot, MySQL",
//                "Ciudad de México",
//                "Tiempo completo",
//                18000.0);
//
//        Vacante vacante2 = new Vacante(2, "Diseñador UX/UI",
//                "Diseño de interfaces web",
//                "Figma, HTML, CSS, trabajo en equipo",
//                "Monterrey",
//                "Remoto",
//                15000.0);
//
//        Vacante vacante3 = new Vacante(3, "Analista de Datos",
//                "Análisis de datos financieros",
//                "Python, SQL, Power BI",
//                "Guadalajara",
//                "Medio tiempo",
//                12000.0);

        // Encabezado
        System.out.printf("%4s %25s %30s %25s %20s %20s %12s%n", "id", "titulo",
                "Descripción", "requisitos", "ubicacion", "tipo de trabajo", "salario");
        System.out.println("-".repeat(145));
        System.out.println(vacante1.toString());
//        System.out.println(vacante2.toString());
//        System.out.println(vacante3.toString());
    }
}


