package p08_objetos.AlumnoInformacion;

public class AlumnoPrueba {
    public static void main(String[] args) {
        // Crear una instancia u objeto
        Alumno alumno1 = new Alumno();

        // Establecer sus datos
        alumno1.establecerNoCuenta("20103601");
        alumno1.establecerNombre("Juan Pérez");
        alumno1.establecerAsignatura("Programación I");
        alumno1.establecerPrimerParcial(10.0);
        alumno1.establecerSegundoParcial(1.5);
        System.out.println(alumno1.obtenerDatos());
        System.out.println("-".repeat(100));

        // Crear otra instancia que se llame alumno2
        Alumno alumno2 = new Alumno();
        alumno2.establecerNoCuenta("20103602");
        alumno2.establecerNombre("Maria Lopez");
        alumno2.establecerAsignatura("Programacion I");
        alumno2.establecerPrimerParcial(8.0);
        System.out.println(alumno2.obtenerDatos());
        System.out.println("-".repeat(100));

        // Ejercicio: crear otros 2 alumnos y 2 alumnas
    }
}
