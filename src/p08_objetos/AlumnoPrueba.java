package p08_objetos;

class Alumno {
    String noCuenta;
    String nombre;
    String asignatura;
    double parcial1;
    double parcial2;

    public String obtenerDatos() {
        String salida = "Tu cuenta es " + this.noCuenta +
                "\nTe llamas " + this.nombre +
                "\nTu asignatura es " + this.asignatura +
                "\nTus calificaciones son: " +
                "\n\tPrimer parcial: " + this.parcial1 +
                "\n\tSegundo parcial: " + this.parcial2;
        return salida;
    }
}

public class AlumnoPrueba {
    public static void main(String[] args) {
        // Crear un objeto o instancia que se
        // llame alumno1
        Alumno alumno1 = new Alumno();
        alumno1.noCuenta = "20103601";
        alumno1.nombre = "Juan Pérez";
        alumno1.asignatura = "Programación I";
        alumno1.parcial1 = 10.0;
        alumno1.parcial2 = 1.5;

        System.out.println(alumno1.obtenerDatos());
        System.out.println("-".repeat(100));

        // Crear otra instancia que se llame alumno2
        Alumno alumno2 = new Alumno();
        alumno2.noCuenta = "20103602";
        alumno2.nombre = "María López";
        alumno2.asignatura = "Programación I";
        alumno2.parcial1 = 8.0;
        alumno2.parcial2 = 6.0;

        System.out.println(alumno2.obtenerDatos());
        System.out.println("-".repeat(100));

        // Ejercicio: crear otros 2 alumnos y 2 alumnas
    }
}






