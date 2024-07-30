package Ejercicios;

public class ejercicio11 {
    private int number;

    public ejercicio11(int number) {
        this.number = number;
    }

    public int getValue() {
        return number;
    }

    public void setValue(int value) {
        this.number = value;
    }

    public String determineEvenOrOdd() {
        if (number % 2 == 0) {
            return "The number " + number + " is even.";
        } else {
            return "The number " + number + " is odd.";
        }
    }
}


