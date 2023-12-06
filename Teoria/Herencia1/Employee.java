package Herencia1;

public class Employee extends Person{
    private int id;
    public Employee(String n, int cod){
        super(n);
        id = cod;
    }
    public Employee(){
        this(null, 0);
    }
    public void display(){
        System.out.println("Nombre: "+this.getName());
        System.out.println("ID: "+id);
    }
}
