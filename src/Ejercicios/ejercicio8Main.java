package Ejercicios;

import javax.swing.*;

public class ejercicio8Main {
    public static void main(String[] args) {
    ejercicio8 x = new ejercicio8();
    String userr = JOptionPane.showInputDialog(null, "Type your name:");

    String workedhours = JOptionPane.showInputDialog(null, "Type quantity of worked hours");
    int horass = Integer.parseInt(workedhours);
    String mensaje = x.message();
    JOptionPane.showMessageDialog(null, mensaje);
    }
}

