package p00_fundamentos;

public class AlumnoDatos {
    public static void main(String[] args) {
        // Declarar variables de un alumno
        String nombre = "José Luis";
        String apellidos = "García M";
        String carrera = "Ingeniería en Computación";
        double promedio = 8.4;
        String procedencia = "Atlacomulco";

        // Imprimir cada dato en líneas separadas
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(carrera);
        System.out.println(promedio);
        System.out.println(procedencia);
        System.out.println();

        // Imprimir en formato con texto explicativo
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio de la preparatoria: " + promedio);
        System.out.println("Lugar de procedencia: " + procedencia);
    }
}

