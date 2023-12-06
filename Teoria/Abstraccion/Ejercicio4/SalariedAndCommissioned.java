package Ejercicio4;

public class SalariedAndCommissioned extends Salaried implements Commission {
    private double sales = 0.0;
    public SalariedAndCommissioned(String n, double s){
        super(n, s);
    }
    public void addSales(double s){
        sales +=s;
    }
    public void printData(){
        System.out.println("El salario original es: "+getSalary()+
        " en ventas gano: "+sales*COMISSION_RATE+
        "\ncon descuento por impuestos: "+getSalary()*0.15);
    }
    public double getPay(){
        return super.getPay()+(sales*COMISSION_RATE);
    }
}
