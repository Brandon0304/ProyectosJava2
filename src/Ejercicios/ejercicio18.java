package Ejercicios;

public class ejercicio18 {
    private boolean emitsBeep;
    private boolean hardDriveSpins;

    public ejercicio18(boolean emitsBeep, boolean hardDriveSpins) {
        this.emitsBeep = emitsBeep;
        this.hardDriveSpins = hardDriveSpins;
    }

    public String determineStatus() {
        if (emitsBeep && hardDriveSpins) {
            return "Contact the support technician.";
        } else if (emitsBeep && !hardDriveSpins) {
            return "Check the drive connections.";
        } else if (!emitsBeep && !hardDriveSpins) {
            return "Bring the computer to the central repair facility.";
        } else if (!emitsBeep && hardDriveSpins) {
            return "Check the speaker connections.";
        } else {
            return "Unknown status.";
        }
    }
}
