package Ejercicio1;
public class Employee {
    private String name;
    public Employee(String n){
        name = n;
    }
    /*dummy method*/
    public double getPay(){
        return 0.0;
    }
    public void printPay(){
        System.out.println(name+": "+getPay());
    }
}
