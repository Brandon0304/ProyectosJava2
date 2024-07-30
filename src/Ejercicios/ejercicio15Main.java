package Ejercicios;
import javax.swing.JOptionPane;

public class ejercicio15Main {
    public static void main(String[] args) {
        ejercicio15 x = new ejercicio15();
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Enter a number of days (15, 30, 90):"));

        int costo = x.calculateCost(dias);

        if (costo <= 0) {
            JOptionPane.showMessageDialog(null, "Not valid number of days. Please, enter 15, 30 or 90 days.");
        } else {
            JOptionPane.showMessageDialog(null, "The membership cost for " + dias + " days is: " + costo);
        }

    }
}
