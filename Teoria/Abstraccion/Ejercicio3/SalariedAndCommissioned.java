package Ejercicio3;

public class SalariedAndCommissioned extends Salaried implements Commission {
    private double sales = 0.0;
    public SalariedAndCommissioned(String n, double s){
        super(n, s);
    }
    public void addSales(double s){
        sales +=s;
    }
    public double getPay(){
        return super.getPay()+(sales*COMISSION_RATE);
    }
}
