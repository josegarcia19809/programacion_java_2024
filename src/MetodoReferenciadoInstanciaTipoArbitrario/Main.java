package MetodoReferenciadoInstanciaTipoArbitrario;

import MetodoEstaticoReferenciado.Persona;
import MetodoReferenciadoInstancia.ProveedorComparaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar las instancias de Persona
        List<Persona> personas = new ArrayList<>();

        // Crear 10 instancias de Persona y agregarlas al ArrayList
        personas.add(new Persona("Juan", 25, "juan@example.com"));
        personas.add(new Persona("María", 30, "maria@example.com"));
        personas.add(new Persona("Pedro", 40, "pedro@example.com"));
        personas.add(new Persona("Laura", 35, "laura@example.com"));
        personas.add(new Persona("Carlos", 28, "carlos@example.com"));
        personas.add(new Persona("Ana", 22, "ana@example.com"));
        personas.add(new Persona("Miguel", 45, "miguel@example.com"));
        personas.add(new Persona("Sofía", 27, "sofia@example.com"));
        personas.add(new Persona("Diego", 33, "diego@example.com"));
        personas.add(new Persona("Lucía", 29, "lucia@example.com"));

        // Imprimir la información de las personas en el ArrayList
        System.out.println("Personas sin ordenar");
        personas.forEach(persona -> System.out.println(persona));
        System.out.println();

        System.out.println("Personas ordenadas por nombre:");

        System.out.println("Personas ordenadas por edad:");
        Collections.sort(personas, Persona::compararPorEdad2);
        // (persona1, persona2)-> persona1.compararPorEdad2(persona2) --equivalente
        personas.forEach(System.out::println); // También es un método referenciado
    }
}
