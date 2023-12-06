package Ejercicio3;
public abstract class Employee {
    private String name;
    public Employee(String n){
        name = n;
    }
    public abstract double getPay();
    public void printPay(){
        System.out.println(name+": "+getPay());
    }
}