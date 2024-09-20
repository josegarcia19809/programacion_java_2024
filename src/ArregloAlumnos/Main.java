package ArregloAlumnos;

public class Main {
    public static void main(String[] args) {
        // Declarar un arreglo de tipo Alumno de tamaño 3 que se llame listaAlumnos
        Alumno[] listaAlumnos = new Alumno[3];

        listaAlumnos[0] = new Alumno("Luis", 23, 98);

        Alumno alumno1 = new Alumno("Maria", 22, 70);
        listaAlumnos[1] = alumno1;

        Alumno alumno2 = new Alumno("Rox", 21, 100);
        listaAlumnos[2] = alumno2;

        for (int i = 0; i <= 2; i++) {
            System.out.println(listaAlumnos[i]);
        }

        System.out.println("-".repeat(100));

        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
        System.out.println("-".repeat(100));

        // Asignar un nuevo nombre al alumno de la posición cero: Julia
        listaAlumnos[0].setNombre("Julia");

        imprimirArreglo(listaAlumnos);

        // Cómo imprimir el promedio de Julia?
        // "El promedio de Julia es 98"
        System.out.println("El promedio de " + listaAlumnos[0].getNombre() + " es " +
                listaAlumnos[0].getPromedio());

        // Sacar un promedio global de los 3 alumnos
        double total = 0.0;
        for (int i = 0; i < listaAlumnos.length; i++) {
            total += listaAlumnos[i].getPromedio();
        }

        double promedio = total / 3;
        System.out.printf("Promedio del grupo: %.1f", promedio);

    }

    public static void imprimirArreglo(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        System.out.println("-".repeat(100));
    }
}
