package p07_Colecciones.ComparadorEstudiante;

import java.util.Comparator;

public class ComparadorApellido implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante estudiante1, Estudiante estudiante2) {
        return estudiante1.getApellido().compareTo(estudiante2.getApellido());
    }
}
