package Ejercicio4;
/*Usando los miembros protected
necesarios en la clase Salaried)
*/
public class Salaried extends Employee {
    private double salary;
    public Salaried(String n, double s){
        super(n);
        salary = s;
    }
    protected double getSalary(){
        return salary;
    }
    public double getPay(){
        return salary-getTaxDiscount(); 
    }
    protected double getTaxDiscount(){
        if(salary >= 10000) return salary*0.15;
        else return 0.0;
    }
}
