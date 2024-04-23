package Predicados;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OperacionesPersona {
    private ArrayList<Persona> personas;

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public OperacionesPersona() {
        personas = obtenerDatos();
    }

    public ArrayList<Persona> obtenerDatos() {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Luis", "Pérez", 20));
        listaPersonas.add(new Persona("Armando", "Sánchez", 30));
        listaPersonas.add(new Persona("Luis", "Blanco", 40));
        listaPersonas.add(new Persona("Felipe", "Pérez", 70));
        return listaPersonas;
    }

    // Devolver solo el apellido de aquellos que se llaman Armando
    public ArrayList<String> obtenerApellidoPersonasArmando() {
        return personas.parallelStream()
                .filter(persona -> persona.getNombre().equalsIgnoreCase("Armando"))
                .map(persona -> String.format("%15s", persona.getApellidos()))
                .collect(Collectors.toCollection(ArrayList::new));

    }

    // Devolver solo el apellido de aquellos que se llaman Luis
    public ArrayList<String> obtenerApellidoPersonasLuis() {
        // Primero creamos el predicado
        Predicate<Persona> predicadoNombre = p -> p.getNombre().equalsIgnoreCase("Luis");

        return personas.parallelStream()
                .filter(predicadoNombre)
                .map(persona -> String.format("%15s", persona.getApellidos()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Devolver las personas mayores de 18 años y menores de 30
    public ArrayList<Persona> obtenerEntre19Y29() {
        Predicate<Persona> edadMayor18 = p -> p.getEdad() > 18;
        Predicate<Persona> edadMenor30 = p -> p.getEdad() < 30;
        // Usar el método and
        Predicate<Persona> edadMayor18AndMenor30 = edadMayor18.and(edadMenor30);

        return personas.parallelStream()
                .filter(edadMayor18AndMenor30)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Devolver las personas mayores de 65 años o menores de 30
    public ArrayList<Persona> obtenerMayor65Menor30() {
        Predicate<Persona> edadMayor65 = p -> p.getEdad() > 65;
        Predicate<Persona> edadMenor30 = p -> p.getEdad() < 30;
        Predicate<Persona> edadMayor65orMenor30 = edadMayor65.or(edadMenor30);

        return personas.parallelStream()
                .filter(edadMayor65orMenor30)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Devolver las personas no mayores de 40 años
    public ArrayList<Persona> obtenerNoMayor40() {
        Predicate<Persona> edadMayor40 = p -> p.getEdad() > 40;

        // Usar el método Negate
        Predicate<Persona> edadNoMayor40 = edadMayor40.negate();

        return personas.parallelStream()
                .filter(edadNoMayor40)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Devolver las personas que se llamen Luis o que tengan más de 50 años

}
