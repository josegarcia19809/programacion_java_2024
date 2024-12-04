package p07_Colecciones.ComparadorPersona;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Persona> {
    @Override
    public int compare(Persona persona1, Persona persona2) {
        if (persona1.getNombre().compareTo(persona2.getNombre()) == 0) {
            return 0;
        } else if (persona1.getNombre().compareTo(persona2.getNombre()) > 0) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
