package p07_Colecciones.ComparadorEmpleado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenamientoListaEmpleados {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Pedro", "Picapiedra", 1200));
        empleados.add(new Empleado("Pablo", "Mármol", 800));
        empleados.add(new Empleado("Vilma", "De Picapiedra", 12000));
        empleados.add(new Empleado("Betty", "Mármol", 700));
        empleados.add(new Empleado("Tony", "Stark", 80000));

        System.out.println("Elementos desordenados:");
        empleados.forEach(empleado -> System.out.println(empleado));
        System.out.println("-".repeat(40));

        // Ordenar por salario
        Collections.sort(empleados, new ComparadorSalario());
        System.out.println("Elementos ordenados por salario:");
        empleados.forEach(empleado -> System.out.println(empleado));
        System.out.println("-".repeat(40));

        // Ordenar por apellido
        Collections.sort(empleados, new ComparadorApellido());
        System.out.println("Elementos ordenados por apellido:");
        empleados.forEach(empleado -> System.out.println(empleado));
        System.out.println("-".repeat(40));
    }
}
