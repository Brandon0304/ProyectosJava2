package Ejercicios;

public class ejercicio17 {
    private int numCopies;

    public ejercicio17(int numCopies) {
        this.numCopies = numCopies;
    }

    public int determinePricePerCopy() {
        if (numCopies >= 0 && numCopies <= 499) {
            return 120;
        } else if (numCopies >= 500 && numCopies <= 749) {
            return 100;
        } else if (numCopies >= 750 && numCopies <= 999) {
            return 80;
        } else if (numCopies >= 1000) {
            return 50;
        } else {
            return 0;
        }
    }

    public int calculateTotalPrice() {
        int pricePerCopy = determinePricePerCopy();
        return pricePerCopy * numCopies;
    }
}
