package p01_arreglos;

public class ConteoVocales {
    public static void main(String[] args) {
        String[] palabras = {"elefante", "computadora", "universidad", "aeroplano",
                "guitarra"};

        // Usar un for mejorado para imprimir  las palabras
        for (String palabra : palabras) {
            System.out.printf("%s ", palabra);
            int contadorVocales = 0;
            for (char letra : palabra.toCharArray()) {
                if ("aeiou".indexOf(letra) != -1) {
                    contadorVocales++;
                }
            }
            System.out.print(" - ");
            System.out.println("Total de vocales: " + contadorVocales);
        }
    }
}
