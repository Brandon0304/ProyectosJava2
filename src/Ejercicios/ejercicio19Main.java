package Ejercicios;
import javax.swing.JOptionPane;

public class ejercicio19Main {
    public static void main(String[] args) {
        int modelNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the model's number of your car:"));

        ejercicio19 automovil = new ejercicio19(modelNumber);

        boolean esDefectuoso = automovil.isDefective();
        JOptionPane.showMessageDialog(null, "Is the car defective?: "+esDefectuoso);
    }

}
