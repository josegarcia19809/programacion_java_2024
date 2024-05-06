package Hilos.Contadores;

public class HilosContadoresPrueba {
    public static void main(String[] args) {
        Thread cuentaAtras=new Thread(new ContadorAtras("Contador--"));

        Thread cuentaAdelante=new Thread(new ContadorAdelante("Contador++"));

        cuentaAtras.start();
        cuentaAdelante.start();
    }
}
