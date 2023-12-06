package Ejercicio2;

public class Employee {
    private String name;
    public Employee(String n){
        name = n;
    }
    public double getPay(){
        return 0.0;
    }
    public void addHours(double n){
        n +=0;
    }
    public String toString(){
        return "\n"+name+" "+getPay();
    }  
}
