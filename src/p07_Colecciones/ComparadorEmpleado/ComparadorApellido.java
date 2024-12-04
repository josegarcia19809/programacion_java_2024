package p07_Colecciones.ComparadorEmpleado;

import java.util.Comparator;

public class ComparadorApellido
        implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1,
                       Empleado empleado2) {
        return empleado1.getApellido()
                .compareTo(empleado2.getApellido());
    }
}
