package Ejercicios;
import javax.swing.JOptionPane;

public class ejercicio18Main {
    public static void main(String[] args) {
        boolean emitePitido = JOptionPane.showConfirmDialog(null, "Does the computer beep when starting?", "Computer status", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean discoDuroGira = JOptionPane.showConfirmDialog(null, "Does the hard drive spins?", "Computer status", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        ejercicio18 computadora = new ejercicio18(emitePitido, discoDuroGira);
        String estado = computadora.determineStatus();

        JOptionPane.showMessageDialog(null, estado);
    }
}
