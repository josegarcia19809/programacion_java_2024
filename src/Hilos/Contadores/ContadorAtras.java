package Hilos.Contadores;

public class ContadorAtras implements Runnable{
    private String nombre;
    public ContadorAtras(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void run() {
        for (int i = 1000; i >= 1; i--) {
            System.out.println("\t\t"+this.nombre + ": " + i);
        }
    }
}
