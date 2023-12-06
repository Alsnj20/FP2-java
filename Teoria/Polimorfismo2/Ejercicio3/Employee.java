package Ejercicio3;

public class Employee {
    private String name;
    public Employee(String n){
        name = n;
    }
    public double getPay(){
        return 0.0;
    }
    public void addHours(double n){
        if(this instanceof Hourly)this.addHours(n);
    }
    public String toString(){
        return "\nNombre: "+name+"\nSalario: "+getPay(); 
    }  
}
