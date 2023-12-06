package Ejercicio2;
public class AppPayroll {
    public static void main(String[] args) {
        Employee[] employees = new Employee[100];
        employees[0] = new Hourly("Anna", 25.0);
        employees[1] = new Salaried("Simon", 4800);
        employees[2] = new Hourly("Donovan", 20.0);
        for (int i = 0; i < employees.length && employees[i] !=null; i++) {
            if(employees[i] instanceof Hourly) employees[i].addHours(160.0);
            if(employees[i] != null) System.out.println(employees[i]);
        }
    }
}
