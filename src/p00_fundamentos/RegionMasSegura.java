package p00_fundamentos;

import java.util.Scanner;

public class RegionMasSegura {
    static Scanner entrada = new Scanner(System.in);

    public static int obtenerNumAccidentes(String nombreRegion) {
        int accidentes = -1;
        while (accidentes < 0) {
            System.out.print("Dame número de accidentes de la región " +
                    nombreRegion + ": ");
            accidentes = entrada.nextInt();
        }
        return accidentes;
    }

    public static void encontrarMenor(int norte, int sur, int este, int oeste,
                                      int central) {
        String regionMasSegura = "Norte";
        int cantidadMenorAccidentes = norte;

        if (sur < cantidadMenorAccidentes) {
            regionMasSegura = "Sur";
            cantidadMenorAccidentes = sur;
        }

        if (este < cantidadMenorAccidentes) {
            regionMasSegura = "Este";
            cantidadMenorAccidentes = este;
        }
        if (oeste < cantidadMenorAccidentes) {
            regionMasSegura = "Oeste";
            cantidadMenorAccidentes = oeste;
        }

        if (central < cantidadMenorAccidentes) {
            regionMasSegura = "Central";
            cantidadMenorAccidentes = central;
        }

        System.out.println("Región más segura: " + regionMasSegura);
        System.out.println("Número de accidentes: " + cantidadMenorAccidentes);

    }

    public static void main(String[] args) {
        int accidentesNorte = obtenerNumAccidentes("Norte");
        int accidentesSur = obtenerNumAccidentes("Sur");
        int accidentesEste = obtenerNumAccidentes("Este");
        int accidentesOeste = obtenerNumAccidentes("Oeste");
        int accidentesCentral = obtenerNumAccidentes("Central");
        encontrarMenor(accidentesNorte, accidentesSur, accidentesEste, accidentesOeste,
                accidentesCentral);
    }
}
