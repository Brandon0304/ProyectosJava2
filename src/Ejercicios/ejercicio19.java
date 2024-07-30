package Ejercicios;

public class ejercicio19 {
    private int modelNumber;

    public ejercicio19(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public boolean isDefective() {
        int[] defectiveModels = {119, 179, 189, 190, 191, 192, 193, 194, 195, 221, 780};
        for (int model : defectiveModels) {
            if (modelNumber == model) {
                return true;
            }
        }
        return false;
    }
}
