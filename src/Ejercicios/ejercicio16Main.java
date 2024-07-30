package Ejercicios;
import javax.swing.JOptionPane;

public class ejercicio16Main {
    public static void main(String[] args) {
        int angulo1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first angle:"));
        int angulo2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second angle:"));
        int angulo3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third angle:"));

        ejercicio16 triangulo = new ejercicio16(angulo1, angulo2, angulo3);

        boolean isvalid = triangulo.sumOfAngles();

        if (triangulo.sumOfAngles()) {
            JOptionPane.showMessageDialog(null, "The typed angles make a valid triangle.");
        } else {
            JOptionPane.showMessageDialog(null, "The typed angles don't make a valid triangle.");
        }
    }
}
