package Ejercicios;
import javax.swing.JOptionPane;

public class ejercicio17Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the number of copies:");
        int numCopies = Integer.parseInt(input);

        ejercicio17 order = new ejercicio17(numCopies);

        int pricePerCopy = order.determinePricePerCopy();
        int totalPrice = order.calculateTotalPrice();

        String message = "Number of copies: " + numCopies + "\n"
                + "Price per copy: " + (pricePerCopy <= 0 ? "Invalid number of copies" : pricePerCopy) + "\n"
                + "Total price: " + (pricePerCopy <= 0 ? "N/A" : totalPrice);

        JOptionPane.showMessageDialog(null, message);
    }
}
