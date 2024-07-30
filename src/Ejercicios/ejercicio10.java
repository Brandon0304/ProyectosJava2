package Ejercicios;

public class ejercicio10 {
    private static final int largewasher = 4000;
    private static final int smallwasher = 3000;
    private static final double discount = 0.03;

    public static double calculateCost(int washerType, int hours, int numWashers) {
        int rate;
        switch (washerType) {
            case 1:
                rate = largewasher;
                break;
            case 2:
                rate = smallwasher;
                break;
            default:
                return 0;
        }

        double totalCost = rate * hours * numWashers;

        if (numWashers > 3) {
            totalCost -= totalCost * discount;
        }

        return totalCost;
    }
}
