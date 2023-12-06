package Herencia2;
public class Gerente extends Person{
    private int age;
    private String adress;
    private double salary; 
    public Gerente(String f,String l, int id, String number,int edad, String dir, double salario ){
        super(f, l, id, number);
        this.age = edad;
        adress = dir;
        salary = salario;
    }
    public int getAge(){
        return age;
    }
    public String getAdrees(){
        return adress;
    }
    public double getSalary(){
        return salary;
    }    
    public void display(){
        super.display();
        System.out.println("Edad: "+getAge()+"\nDireccion: "+getAdrees()+"\nSalario: "+getSalary());
    }
    public String toString(){
        return super.toString()+
        "\nEdad: "+getAge()+"\nDireccion: "+getAdrees()+"\nSalario: "+getSalary();
    }
}
