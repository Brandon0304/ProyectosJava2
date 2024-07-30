package Ejercicios;
import javax.swing.JOptionPane;

public class ejercicio14Main {
    public static void main(String[] args) {
        String genero = JOptionPane.showInputDialog("Type your gender: (feminine/masculine):");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));

        ejercicio14 ayuda = new ejercicio14(genero, edad);

        int valorAyuda = ayuda.calculateAid();

        JOptionPane.showMessageDialog(null, "The month help value is: " + valorAyuda);

    }
}
