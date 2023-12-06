package Herencia2;
import java.util.ArrayList;
public class Concesionario {
    private String nameCompany;
    private Gerente gerent;
    private String adressCompany;
    private String telfCompany;
    private ArrayList<Vendedor> salesSttaf = new ArrayList<>();
    private ArrayList<Auto> cars = new ArrayList<>();
    public Concesionario(String n, Gerente g, String adr, String tel){
        nameCompany = n;
        gerent = g;
        adressCompany = adr;
        telfCompany = tel;
    }
    public void addAuto(Auto car){
        cars.add(car);
    }
    public void addVendedor(Vendedor vend){
        salesSttaf.add(vend);
    }
    public String getName(){
        return nameCompany;
    }
    public Gerente getGerente(){
        return gerent;
    }
    public String getAdress(){
        return adressCompany;
    }
    public String getTelf(){
        return telfCompany;
    }
    public void imprimirEstatus (){
        System.out.println("----------------DATOS---------------------");
        System.out.println("Datos de la Empresa:" );
        System.out.println(this);
        System.out.println("-------------------------------------");
        System.out.println("Datos del gerente: ");
        gerent.display();
        System.out.println("-------------------------------------");
        System.out.println("Vendedores: "); 
        for (Vendedor person: salesSttaf)
           person.display();  
        System.out.println("-------------------------------------");
        System.out.println("Autos: ");
        for (Auto car : cars)
            System.out.println(car);
    }
    public String toString(){
        return "Empresa: "+getName()+"\nDireccion: "+getAdress()+"\nTelf: "+getTelf();
    }
}  
