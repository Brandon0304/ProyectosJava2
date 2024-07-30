package Ejercicios;

import javax.swing.*;

public class Exercise9Main {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Type your number");
        int numero = Integer.parseInt(numeroStr);


        Exercise9 num = new Exercise9(numero);

        String mensaje = num.valueX();

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
