package Hilos.HiloUnicoInfo;

public class InformacionPersonalPrueba {
    public static void main(String[] args) {
        Thread info=new Thread(new InformacionPersonal());
        info.start();
    }
}
