package p03_metodos;

import javax.swing.JOptionPane;

public class Checkpoint {

    public static void main(String[] args) {
        String input;
        int number;

        input = JOptionPane.showInputDialog("Enter a number."); // Solicita un número
        number = Integer.parseInt(input); // Convierte la entrada a un entero

        if (number < 10)
            method1();  // Si el número es menor a 10, llama a method1
        else
            method2();  // Si el número es 10 o mayor, llama a method2

        System.exit(0);  // Finaliza el programa
    }

    public static void method1() {
        // Muestra este mensaje si el número es menor que 10
        JOptionPane.showMessageDialog(null, "Able was I.");
    }

    public static void method2() {
        // Muestra este mensaje si el número es 10 o mayor
        JOptionPane.showMessageDialog(null, "I saw Elba.");
    }
}
