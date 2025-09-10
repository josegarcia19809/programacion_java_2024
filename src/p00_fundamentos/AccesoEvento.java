package p00_fundamentos;

import java.util.Scanner;

public class AccesoEvento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("🏟️ Acceso a un evento deportivo");

        // Pide si tiene boleto y también pide si es invitado especial
        System.out.print("🎟️ ¿Tienes boleto? (true/false): ");
        boolean tieneBoleto = entrada.nextBoolean();

        System.out.print("⭐️ ¿Eres invitado especial? (true/false): ");
        boolean esInvitadoEspecial = entrada.nextBoolean();

        // Pregunta si lo han vetado
        System.out.print("🚫¿Te han vetado? (true/false): ");
        boolean estaVetado = entrada.nextBoolean();

        if ((esInvitadoEspecial || tieneBoleto) && !estaVetado) {
            System.out.println("🏟️ ¡Bienvenido al estadio, disfruta el partido!");
        } else {
            System.out.println("Acceso no permitido. No cumples los requisitos. ❌");
        }
    }
}
