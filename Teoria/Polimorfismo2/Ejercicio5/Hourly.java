package Ejercicio5;
public class Hourly extends Employee {
    private double hourlyRate;
    private final int HOURS_DAY = 8;
    private int amountWorkDaysWeek = 4;
    public Hourly(String n, double rate) {
        super(n);
        hourlyRate = rate;
    }
    public double getPay() {
        double pay = hourlyRate * HOURS_DAY * amountWorkDaysWeek;
        return pay;
    }
    public void setnrodayPay(int n) {
        setpayDay(n);
        if(n % 7 == 4){
        amountWorkDaysWeek = (n < 7) ? 4 : 5;
        System.out.println(this);
        }
    }
}