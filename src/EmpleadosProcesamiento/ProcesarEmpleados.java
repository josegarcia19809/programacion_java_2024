package EmpleadosProcesamiento;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProcesarEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados = {
                new Empleado("José", "García", 5000, "TI"),
                new Empleado("Rosario", "Vázquez", 7600, "TI"),
                new Empleado("Luis", "Prieto", 10000, "TI"),
                new Empleado("Luis", "Vázquez", 4500, "Ventas"),
                new Empleado("Gabriela", "Prieto", 6000, "Ventas"),
                new Empleado("Vianney", "Rodríguez", 65000, "Marketing"),
                new Empleado("Francisco", "Vázquez", 50000, "Marketing"),
                new Empleado("Irma", "Domínguez", 7500, "Ventas"),
                new Empleado("Rosario", "Prieto", 100000, "Marketing")
        };

        List<Empleado> listaEmpleados = Arrays.asList(empleados);

        // Mostrar a todos los empleados
        System.out.println("Lista de todos los empleados");
        imprimirEncabezado();
        listaEmpleados.forEach(System.out::println);
        imprimirRenglon();

        // Ordenamiento de objetos Empleado según varios campos

        // Funciones para obtener primer nombre y apellido de un empleado
        Function<Empleado, String> porPrimerNombre = Empleado::getPrimerNombre;
        Function<Empleado, String> porApellidopaterno = Empleado::getApellidoPaterno;

        // Comparator para comparar Empleados primero por apellido paterno, y luego por
        // primer nombre
        Comparator<Empleado> apellidoLuegoNombre =
                Comparator.comparing(porApellidopaterno).thenComparing(porPrimerNombre);

        // Ordena Empleados por apellido paterno, y luego por nombre
        System.out.println("Empleados en orden ascendente por apellido y luego por " +
                "nombre");
        imprimirEncabezado();
        listaEmpleados.stream().sorted(apellidoLuegoNombre)
                .forEach(System.out::println);
        imprimirRenglon();

        // Ordena Empleados en forma descendente por apellido paterno, y luego por nombre
        System.out.println("Empleados en orden descendente por apellido y luego por " +
                "nombre");
        imprimirEncabezado();
        listaEmpleados.stream().sorted(apellidoLuegoNombre.reversed())
                .forEach(System.out::println);
        imprimirRenglon();

        // Agrupación de Objetos Empleado por departamento
        System.out.println("Empleados por departamento");
        Map<String, List<Empleado>> agrupadosPorDepartamento =
                listaEmpleados.stream()
                        .collect(Collectors.groupingBy(
                                Empleado::getDepartamento
                        ));
        agrupadosPorDepartamento.forEach(
                (departamento, empleadosEnDepartamento) ->
                {
                    System.out.println(departamento);
                    empleadosEnDepartamento.forEach(
                            empleado -> System.out.printf("   %s%n",
                                    empleado.toString())
                    );
                }
        );
        imprimirRenglon();

        // Cuenta el número de empleados en cada departamento
        System.out.println("Conteo de empleados por departamento:");
        Map<String, Long> conteoEmpleadosPorDepartamento =
                listaEmpleados.stream()
                        .collect(Collectors.groupingBy(Empleado::getDepartamento,
                                TreeMap::new, Collectors.counting()));

        conteoEmpleadosPorDepartamento.forEach(
                (departamento, conteo) -> {
                    System.out.printf("%s tiene %d empleados%n",
                            departamento, conteo);
                }
        );
        imprimirRenglon();

    }

    public static void imprimirRenglon() {
        System.out.println();
        System.out.println("-".repeat(100));
    }

    public static void imprimirEncabezado() {
        System.out.printf("%-12s %-12s %12s %12s%n", "Nombre", "Apellidos", "salario",
                "departamento");
        System.out.println("-".repeat(100));
    }
}
