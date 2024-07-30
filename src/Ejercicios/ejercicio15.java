package Ejercicios;

import javax.swing.*;

public class ejercicio15 {
    public int days;
    public int cost;

    public int calculateCost(int days) {
        if (days == 15) {
            return 18000;
        } else if (days == 30) {
            return 18000;
        } else if (days == 90) {
            return 86000;
        } else {
            return 0;
        }
    }
}
