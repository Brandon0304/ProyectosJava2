package Ejercicios;

public class ejercicio14 {
    private String gender;
    private int age;

    public ejercicio14(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public int calculateAid() {
        if (gender.equalsIgnoreCase("female")) {
            if (age > 50) {
                return 120000;
            } else if (age >= 30 && age <= 50) {
                return 100000;
            }
        } else if (gender.equalsIgnoreCase("male")) {
            return 40000;
        }
        return 0;
    }
}

