package Ejercicios;

import javax.swing.*;

public class Exercise9 {
    private int number;

    public Exercise9(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String valueX() {
        if (number > 0) {
            JOptionPane.showMessageDialog(null, "The number " + number + " is positive");
        } else if (number < 0) {
            JOptionPane.showMessageDialog(null, "The number " + number + " is negative");
        } else {
            JOptionPane.showMessageDialog(null, "The number is zero");
        }
        return valueX();
    }
}
