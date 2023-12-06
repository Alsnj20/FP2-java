package Herencia2;
public class Vendedor extends Person {
    private int numberDaysWork;
    private int count;
    private double sale;
    public Vendedor(String f, String l, int id, String t,int days, int cant, double total){
        super(f, l, id, t);
        numberDaysWork = days;
        count = cant;
        sale = total;
    }
    public int getNumberDaysWork(){
        return numberDaysWork;
    }
    public int getCount(){
        return count;
    }
    public double getSale(){
        return sale;
    }
    public void display(){
        super.display();
        System.out.println("Nro de dias Trabajados: "+getNumberDaysWork()+
        "\nProductos Vendidos: "+getCount()+"\nSalario: "+getSale());
    }
}
