package p08_objetos.TecnologicoApp;

import java.util.Scanner;

public class TecnologicoPrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Tecnologico tec = new Tecnologico();

        System.out.print("Dame el nombre del tecnológico: ");
        String nombreTecnologico = entrada.nextLine();

        tec.establecerNombre(nombreTecnologico);
        System.out.println(tec.obtenerNombre());
    }
}
