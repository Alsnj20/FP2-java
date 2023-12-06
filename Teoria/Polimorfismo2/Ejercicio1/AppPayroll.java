package Ejercicio1;

public class AppPayroll {
    public static void main(String[] args) {
        Employee[] employees = new Employee[100];
        employees[0] = new Hourly("Anna", 25.0);
        employees[1] = new Salaried("Simon", 48000);
        employees[2] = new Hourly("Donovan", 20.0);
        for (int i = 0; i < employees.length && employees[i] !=null; i++) {
            if(employees[i] instanceof Hourly){
                Hourly hour = (Hourly) employees[i];
                hour.addHours(160.0);
            } 
        employees[i].printPay();
        }
    }
}
