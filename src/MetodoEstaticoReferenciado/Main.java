package MetodoEstaticoReferenciado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar las instancias de Persona
        List<Persona> listaPersonas = new ArrayList<>();

        // Crear 10 instancias de Persona y agregarlas al ArrayList
        listaPersonas.add(new Persona("Juan", 25, "juan@example.com"));
        listaPersonas.add(new Persona("María", 30, "maria@example.com"));
        listaPersonas.add(new Persona("Pedro", 40, "pedro@example.com"));
        listaPersonas.add(new Persona("Laura", 35, "laura@example.com"));
        listaPersonas.add(new Persona("Carlos", 28, "carlos@example.com"));
        listaPersonas.add(new Persona("Ana", 22, "ana@example.com"));
        listaPersonas.add(new Persona("Miguel", 45, "miguel@example.com"));
        listaPersonas.add(new Persona("Sofía", 27, "sofia@example.com"));
        listaPersonas.add(new Persona("Diego", 33, "diego@example.com"));
        listaPersonas.add(new Persona("Lucía", 29, "lucia@example.com"));

        // Imprimir la información de las personas en el ArrayList
        System.out.println("Personas sin ordenar");
        listaPersonas.forEach(persona -> System.out.println(persona));

        System.out.println();

        // Método tradicional
        Collections.sort(listaPersonas,
                (persona1, persona2) -> persona1.getEdad().compareTo(persona2.getEdad()));

        // Pero como ya tenemos el método
        Collections.sort(listaPersonas,
                (persona1, persona2) -> Persona.compararPorEdad(persona1, persona2));

        // Método referenciado
        Collections.sort(listaPersonas, Persona::compararPorEdad);
        System.out.println("Personas ordenadas por edad");
        listaPersonas.forEach(persona -> System.out.println(persona));
    }
}


