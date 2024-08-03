package Ejercicios;

import javax.swing.*;

public class ejercicio22Main {
    public static void main(String[] args) {


        ejercicio22 x = new ejercicio22();

        x.jugador1 = JOptionPane.showInputDialog(null,"Type the first name");
        x.jugador2 = JOptionPane.showInputDialog(null,"Type the second name");
        JOptionPane.showMessageDialog(null, "Let's get started!");

        x.mostrarCarta1();
        x.mostrarCarta2();
        x.mostrarCarta2jugado1();
        x.mostrarCarta2jugador2();

        x.cartaAdiciona1();
        x.cartaAdiciona2();
        x.calcularPuntaje();
        x.determinarGanador();
        }
}