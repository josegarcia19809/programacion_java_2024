package p03_metodos;

/*
 * Este programa mostrará las expectativas de salario de un programador principiante
 * Crear los métodos para mostrar los siguientes datos:
 * -nombre:   mostrarNombre()
 * -edad:     visualizarEdad()
 * -salario esperado: imprimirSalarioEsperado()
 * Después se mandarán llamar estos métodos
 * */
public class ProgramadorPrincipiante {
    public static void main(String[] args) {
        mostrarNombre();
        visualizarEdad();
        imprimirSalarioEsperado();
    }

    public static void mostrarNombre() {
        System.out.println("Mi nombre es José L García");
    }

    public static void visualizarEdad() {
        System.out.println("Tengo 44 años");
    }

    public static void imprimirSalarioEsperado() {
        System.out.println("Espero ganar $4000 al día");
    }

}
