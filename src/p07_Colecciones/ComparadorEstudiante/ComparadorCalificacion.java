package p07_Colecciones.ComparadorEstudiante;

import java.util.Comparator;

public class ComparadorCalificacion implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante estudiante1, Estudiante estudiante2) {
        if (estudiante1.getCalificacion() == estudiante2.getCalificacion()) {
            return 0;
        } else if (estudiante1.getCalificacion() > estudiante2.getCalificacion()) {
            return 1;
        } else {
            return -1;
        }
    }
}
