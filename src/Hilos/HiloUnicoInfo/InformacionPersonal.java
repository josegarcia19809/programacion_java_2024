package Hilos.HiloUnicoInfo;

public class InformacionPersonal implements Runnable{
    @Override
    public void run() {
        System.out.println("Nombre: José Luis García"
        +"Dirección: San Miguel T.");
    }
}
