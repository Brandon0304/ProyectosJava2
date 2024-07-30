package Ejercicios;

public class ejercicio16 {
    private int angle1;
    private int angle2;
    private int angle3;

    public ejercicio16(int angle1, int angle2, int angle3) {
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }

    public boolean sumOfAngles() {
        return (angle1 + angle2 + angle3) == 180;
    }
}
