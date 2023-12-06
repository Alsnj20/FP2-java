package AgregacionComposicion;

public class Vendedor {
    private String name;
    private String telephone;
    private int count;
    private double sale;
    public Vendedor(String n, String t, int c, double total){
        name = n;
        telephone = t;
        count = c;
        sale = total;
    }
    public String getName(){
        return name;
    }
    public String getTelephone(){
        return telephone;
    }
    public int getCount(){
        return count;
    }
    public double getSale(){
        return sale;
    }
    public String toString(){
        return "Nombre: "+getName()+"|Telf: "+getTelephone()+"|Cant: "+getCount()+"|Total: "+getSale();
    }
}
