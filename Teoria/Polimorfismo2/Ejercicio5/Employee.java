package Ejercicio5;

public class Employee {
    private String name;
    private int payDay;
    public Employee(String n) {
        name = n;
    }
    public void setpayDay(int n){
        payDay = n;
    }
    public double getPay() {
        return 0.0;
    }
    public void setnrodayPay(int n) {}

    public String toString() {
        return payDay + " " + name + " " + getPay();
    }
}