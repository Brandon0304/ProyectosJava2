package Ejercicios;
import javax.swing.JOptionPane;

public class ejercicio12Main {
    public static void main(String[] args) {
        double fisica = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación de Física:"));
        double quimica = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación de Química:"));
        double biologia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación de Biología:"));
        double matematicas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación de Matemáticas:"));
        double informatica = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación de Informática:"));

        ejercicio12 estudiante = new ejercicio12(fisica, quimica, biologia, matematicas, informatica);

        double promedio = estudiante.calculateAverage();


    }
}
