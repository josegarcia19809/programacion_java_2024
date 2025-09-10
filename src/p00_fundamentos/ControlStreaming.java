package p00_fundamentos;

import java.util.Scanner;

public class ControlStreaming {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;
        boolean estaBloqueado;
        System.out.println("📽️Control de acceso en una plataforma de streaming");

        // 🎬 Solicitar la edad del usuario
        System.out.print("¿Cuál es tu edad? ");
        edad = entrada.nextInt();

        // 🚫 Solicitar si el usuario está bloqueado
        System.out.print("¿Estás bloqueado en la plataforma? (true/false): ");
        estaBloqueado = entrada.nextBoolean();

        // ✅ Verificar condiciones para acceder
        if (edad >= 18 && !estaBloqueado) {
            System.out.println("🍿 ¡Puedes ver la película para adultos!");
        } else {
            System.out.println("🚫 Acceso denegado. No cumples los requisitos.");
        }
    }
}

