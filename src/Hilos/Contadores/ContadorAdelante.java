package Hilos.Contadores;

public class ContadorAdelante implements Runnable{
    private String nombre;
    public ContadorAdelante(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(this.nombre + ": " + i);
        }
    }
}
