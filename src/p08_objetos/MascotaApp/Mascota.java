package p08_objetos.MascotaApp;

public class Mascota {
    private String nombre;
    private String animal;
    private int edad;

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerAnimal(String animal) {
        this.animal = animal;
    }

    public void establecerEdad(int edad) {
        this.edad = edad;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public String obtenerAnimal() {
        return this.animal;
    }

    public int obtenerEdad() {
        return this.edad;
    }

    public String obtenerDatos() {
        String salida = "";
        salida += "Mascota\n";
        salida += "Nombre: " + this.nombre;
        salida += ", Tipo: " + this.animal;
        salida += ", Edad: " + this.edad;
        return salida;
    }
}
