package p07_Colecciones.ComparadorPersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenamientoListaPersonas {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Pedro", "Picapiedra", 40));
        listaPersonas.add(new Persona("Pablo", "Mármol", 30));
        listaPersonas.add(new Persona("Vilma", "De Picapiedra", 35));
        listaPersonas.add(new Persona("Betty", "Mármol", 25));
        listaPersonas.add(new Persona("Tony", "Stark", 56));

        // Imprimir
        System.out.println("Elementos desordenados:");
        listaPersonas.forEach(persona -> System.out.println(persona));
        System.out.println();

        // Ordenar por edad
        listaPersonas.sort(new ComparadorEdad());
        listaPersonas.forEach(System.out::println);
        System.out.println();

        // Ordenar por nombre
        Collections.sort(listaPersonas, new ComparadorNombre());
        listaPersonas.forEach(persona -> System.out.println(persona));
        System.out.println();
    }
}
