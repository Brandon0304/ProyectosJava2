package Ejercicios;
import javax.swing.JOptionPane;

public class ejercicio20Main {
    public static void main(String[] args) {
        String operador = JOptionPane.showInputDialog("Enter your operator (Claro, Tigo or Movistar):");

        int minutosInternacionales = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of international minutes consumed:"));

        ejercicio20 celuMovil = new ejercicio20(operador, minutosInternacionales);

        int costoTotal = celuMovil.calculateTotalCost();

        if (costoTotal == -1) {
            JOptionPane.showMessageDialog(null, "Unknown operator. Please, enter Claro, Tigo o Movistar.");
        } else {
            JOptionPane.showMessageDialog(null, "Total cost is: $" + costoTotal);
        }

    }
}

