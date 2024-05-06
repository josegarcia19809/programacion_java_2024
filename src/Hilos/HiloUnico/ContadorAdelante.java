package Hilos.HiloUnico;

public class ContadorAdelante implements Runnable {
    private String nombre;
    public ContadorAdelante(String nombre){
        if(nombre != null){
            this.nombre = nombre;
        }
        System.out.println("Hilo");
    }

    @Override
    public void run() {
        for(int i = 1; i <= 1000; i++){
            System.out.print("\t" + nombre + " "+i+"\n");
        }
        System.out.println();
    }
}
