package Ejercicio5;

public class Salaried extends Employee {
    private double salary;
    public Salaried(String n, double s) {
        super(n);
        salary = s;
    }
    public void setnrodayPay(int n) {
        setpayDay(n);
        if (n % 15 == 0) {
            System.out.println(this);
        }
    }
    public double getPay() {
        return salary;
    }
}

