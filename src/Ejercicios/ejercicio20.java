package Ejercicios;

public class ejercicio20 {
    private String operator;
    private int internationalMinutes;
    private int fixedCharge;
    private int internationalMinuteRate;
    private int dataPackageRate;

    public ejercicio20(String operator, int internationalMinutes) {
        this.operator = operator;
        this.internationalMinutes = internationalMinutes;
        setRates();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
        setRates();
    }

    public int getInternationalMinutes() {
        return internationalMinutes;
    }

    public void setInternationalMinutes(int internationalMinutes) {
        this.internationalMinutes = internationalMinutes;
    }

    private void setRates() {
        switch (operator.toLowerCase()) {
            case "tigo":
                this.fixedCharge = 45000;
                this.internationalMinuteRate = 200;
                this.dataPackageRate = 12000;
                break;
            case "claro":
                this.fixedCharge = 30000;
                this.internationalMinuteRate = 100;
                this.dataPackageRate = 18000;
                break;
            case "movistar":
                this.fixedCharge = 40000;
                this.internationalMinuteRate = 250;
                this.dataPackageRate = 8000;
                break;
            default:
                this.fixedCharge = 0;
                this.internationalMinuteRate = 0;
                this.dataPackageRate = 0;
                break;
        }
    }

    public int calculateTotalCost() {
        if (fixedCharge == 0) {
            return -1;
        }
        int costOfInternationalMinutes = internationalMinutes * internationalMinuteRate;
        return fixedCharge + costOfInternationalMinutes + dataPackageRate;
    }
}
