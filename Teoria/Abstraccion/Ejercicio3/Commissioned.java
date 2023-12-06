package Ejercicio3;
public class Commissioned extends Employee implements Commission {
    private double sales = 0.0;
    public Commissioned(String n){
        super(n);
    }
    public void addSales(double s){
        sales +=s;
    }
    public double getPay(){
        return COMISSION_RATE*sales;
    }
}
