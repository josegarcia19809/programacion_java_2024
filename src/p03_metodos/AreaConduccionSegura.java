package p03_metodos;

import java.util.Scanner;

public class AreaConduccionSegura {
    static Scanner entrada = new Scanner(System.in);

    public static int obtenerNumAccidentes(String region) {
        int accidentes = 0;
        while (accidentes <= 0) {
            System.out.printf("¿Cuántos accidentes se reportaron en la región %s? ",
                    region);
            accidentes = entrada.nextInt();
        }
        return accidentes;
    }

    public static void encontrarMenor(int norte, int sur, int este, int oeste, int central) {
        String zonaMasSegura = "Norte";
        int menorAccidentes = norte;
        if (sur < menorAccidentes) {
            zonaMasSegura = "Sur";
            menorAccidentes = sur;
        }

        if (este < menorAccidentes) {
            zonaMasSegura = "Este";
            menorAccidentes = este;
        }

        if (oeste < menorAccidentes) {
            zonaMasSegura = "Oeste";
            menorAccidentes = oeste;
        }

        if (central < menorAccidentes) {
            zonaMasSegura = "Central";
            menorAccidentes = central;
        }
        System.out.printf("Zona más segura: %s. Hubo %d accidentes%n", zonaMasSegura,
                menorAccidentes);
    }

    public static void main(String[] args) {
        System.out.println("Buscando la región más segura");
        int accidentesNorte = obtenerNumAccidentes("Norte");
        int accidentesSur = obtenerNumAccidentes("Sur");
        int accidentesEste = obtenerNumAccidentes("Este");
        int accidentesOeste = obtenerNumAccidentes("Oeste");
        int accidentesCentral = obtenerNumAccidentes("Central");

        encontrarMenor(accidentesNorte, accidentesSur, accidentesEste, accidentesOeste,
                accidentesCentral);
    }
}
