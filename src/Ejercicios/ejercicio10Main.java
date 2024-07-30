package Ejercicios;
import javax.swing.JOptionPane;

public class ejercicio10Main {
    public static void main(String[] args) {
        ejercicio10 WasherRental = new ejercicio10();
        String input = JOptionPane.showInputDialog("Enter the washer type (1 for large, 2 for small):");
        int washerType = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the number of hours:");
        int hours = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the number of washers rented:");
        int numWashers = Integer.parseInt(input);

        double cost = WasherRental.calculateCost(washerType, hours, numWashers);

        if (cost == 0) {
            JOptionPane.showMessageDialog(null, "Invalid washer type.");
        } else {
            JOptionPane.showMessageDialog(null, "The total cost is: " + cost);
        }
    }
}
