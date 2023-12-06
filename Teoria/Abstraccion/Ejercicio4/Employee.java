package Ejercicio4;
public abstract class Employee {
    private String name;
    public Employee(String n){
        name = n;
    }
    public abstract double getPay();
    public void printPay(){
        if(this instanceof SalariedAndCommissioned){
            ((SalariedAndCommissioned) this).printData();
        }
        System.out.println(name+": "+getPay());
    }
}
