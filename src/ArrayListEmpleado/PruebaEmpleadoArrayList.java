package ArrayListEmpleado;

import java.util.ArrayList;

public class PruebaEmpleadoArrayList {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------");
        // Crear un ArrayList de Empleados: listaEmpleados
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        // Agregar 3 elementos a la lista
        listaEmpleados.add(new Empleado(123, "José", "García"));
        listaEmpleados.add(new Empleado(345, "Rox", "Sanchéz"));
        listaEmpleados.add(new Empleado(456, "Fabiola", "Velez"));

        // Imprimir la lista
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado.toString());
        }
        System.out.println("-------------------------------");

        // Recuperar el Empleado en la posición 1
        System.out.println("Empleado en la posición 1: ");
        System.out.println(listaEmpleados.get(1));
        System.out.println("-------------------------------");

        // Comprobar si el ArrayList está vacío
        System.out.println("¿Está vacío el ArrayList de Empleados?");
        System.out.println(listaEmpleados.isEmpty());
        System.out.println("-------------------------------");

        // Reemplazar un elemento existente
        listaEmpleados.set(1, new Empleado(678, "Arturo", "Morales"));

        // Imprimir la lista, esta es otra forma
        listaEmpleados.forEach(empleado -> System.out.println(empleado));
        System.out.println("-------------------------------");

        // Añadir un elemento en el índice 1
        listaEmpleados.add(1, new Empleado(4567, "Eva", "Luna"));
        listaEmpleados.forEach(empleado -> System.out.println(empleado));
        System.out.println("-------------------------------");

        // Remover al Empleado del índice 2
        listaEmpleados.remove(2);
        listaEmpleados.forEach(empleado -> System.out.println(empleado));
        System.out.println("-------------------------------");

        //Pregunta si el ArrayList contiene a cierto Empleado
        System.out.print("El ArrayList contiene al Empleado: 678, 'Arturo', 'Morales': ");
        System.out.println(listaEmpleados.contains(new Empleado(678, "Arturo", "Morales")));

        //Pregunta por el indice de cierto Empleado
        System.out.print("Indice del Empleado 4567, 'Eva', 'Luna': ");
        System.out.println(listaEmpleados.indexOf(new Empleado(4567, "Eva", "Luna")));

    }
}
