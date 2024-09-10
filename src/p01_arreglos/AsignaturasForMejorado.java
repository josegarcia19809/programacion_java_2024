package p01_arreglos;

public class AsignaturasForMejorado {
    public static void main(String[] args) {
        String[] asignaturas = {
                "Estructura de datos",
                "Fundamentos de SI",
                "Costos empresariales",
                "Sistemas electrónicos"
        };

        for (String asignatura : asignaturas) {
            System.out.println(asignatura.toUpperCase());
        }
    }
}
