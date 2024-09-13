package p01_arreglos;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        int[] calificaciones = {85, 90, 88, 92, 100};
        System.out.println("El promedio de las calificaciones es "+
                calcularPromedio(calificaciones));
    }

    public static double calcularPromedio(int[] puntuaciones) {
        double total = 0.0;
        for (double puntuacion : puntuaciones) {
            total = total + puntuacion;
        }
        double promedio = total / puntuaciones.length;
        return promedio;
    }
}
