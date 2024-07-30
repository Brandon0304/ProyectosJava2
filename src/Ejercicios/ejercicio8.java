package Ejercicios;

public class ejercicio8 {
    private String user;
    private int hours;
    public int salary;

    public String getUser() {
        return user;
    }

    public void setUsuario(String user, int hours) {
        this.user = user;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int salary(){
        if (hours>=1 && hours<=10){
            salary = hours*30000;
        }else{
            salary = hours*33000;
        }
        return salary;
    }

    public String message(){
        int salary = salary();
        return ("Mr " + user + " the number of hours is " + hours + ", and your salary is equal to " + salary);
    }
}

