package Herencia1;

public class FullTime extends Employee {
    private double salary;
    public FullTime(){
        this(null, 0, 0.0);
    }
    public FullTime(String n, int cod, double s){
        super(n, cod);
        salary = s;
    }
    public void display(){
        super.display();
        System.out.println("Salario: "+salary);
    }
}
