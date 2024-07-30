package Ejercicios;
import javax.swing.JOptionPane;

public class ejercicio13Main {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Type the first number:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Type the second number:"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Type the third number:"));

        ejercicio13 numeros = new ejercicio13(numero1, numero2, numero3);

        int mayor = numeros.determineLargest();

        JOptionPane.showMessageDialog(null, "The largest number is: " + mayor);
    }
}
