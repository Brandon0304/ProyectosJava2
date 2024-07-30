package Ejercicios;

public class ejercicio12 {
    private double physics;
    private double chemistry;
    private double biology;
    private double mathematics;
    private double computerScience;

    public ejercicio12(double physics, double chemistry, double biology, double mathematics, double computerScience) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
        this.mathematics = mathematics;
        this.computerScience = computerScience;
    }

    public double calculateAverage() {
        return (physics + chemistry + biology + mathematics + computerScience) / 5;
    }

    public String determineGrade(double average) {
        if (average >= 0 && average <= 5.9) {
            return "Poor";
        } else if (average >= 6 && average <= 8) {
            return "Good";
        } else if (average >= 8 && average <= 10) {
            return "Excellent";
        } else {
            return "Average out of range";
        }
    }
}