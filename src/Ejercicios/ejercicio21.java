package Ejercicios;

public class ejercicio21 {
    private String size;
    private boolean bacon;
    private boolean jalapeño;
    private boolean turkey;
    private boolean cheese;
    private int baseCost;
    private int totalCost;

    public ejercicio21(String size, boolean bacon, boolean jalapeño, boolean turkey, boolean cheese) {
        this.size = size;
        this.bacon = bacon;
        this.jalapeño = jalapeño;
        this.turkey = turkey;
        this.cheese = cheese;
        calculateBaseCost();
        calculateTotalCost();
    }

    private void calculateBaseCost() {
        if (size.equals("small")) {
            baseCost = 6000;
        } else if (size.equals("large")) {
            baseCost = 12000;
        } else {
            baseCost = 0;
        }
    }

    private void calculateTotalCost() {
        totalCost = baseCost;
        if (bacon) {
            totalCost += 3000;
        }
        if (turkey) {
            totalCost += 3000;
        }
        if (cheese) {
            totalCost += 2500;
        }
    }

    public int getTotalCost() {
        return totalCost;
    }
}
