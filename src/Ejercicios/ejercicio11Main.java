package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio11Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number:");
        int number = Integer.parseInt(input);

        ejercicio11 exercise = new ejercicio11(number);

        String result = exercise.determineEvenOrOdd();

        JOptionPane.showMessageDialog(null, result);
    }
}


