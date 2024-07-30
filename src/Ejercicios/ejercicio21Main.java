package Ejercicios;
import javax.swing.JOptionPane;

public class ejercicio21Main {
    public static void main(String[] args) {
        String tamaño = JOptionPane.showInputDialog("Enter the size of your sandwich (small or big):");

        boolean tocineta = JOptionPane.showConfirmDialog(null, "Do you want bacon? (Additional cost $3000)", "Additional ingredients", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean jalapeño = JOptionPane.showConfirmDialog(null, "Do you want jalapeño? (Free)", "Adittional ingredients", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean pavo = JOptionPane.showConfirmDialog(null, "Do you want turkey? (Additional cost $3000)", "Adittional ingredients", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean queso = JOptionPane.showConfirmDialog(null, "Do you want cheese? (Additional cost $2500)", "Adittional ingredients", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        ejercicio21 pedido = new ejercicio21(tamaño, tocineta, jalapeño, pavo, queso);

        int costoTotal = pedido.getTotalCost();

        if (costoTotal == 0) {
            JOptionPane.showMessageDialog(null, "Unknown size. Please, enter 'small' or 'big'.");
        } else {
            JOptionPane.showMessageDialog(null, "The total cost for your order is: $" + costoTotal);
        }

    }
}
