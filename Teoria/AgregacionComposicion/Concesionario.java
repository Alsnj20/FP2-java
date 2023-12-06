package AgregacionComposicion;

import java.util.ArrayList;

public class Concesionario {
    private String name;
    private Gerente gerent;
    private String adress;
    private String telf;
    private ArrayList<Vendedor> salesSttaf = new ArrayList<>();
    private ArrayList<Auto> cars = new ArrayList<>();
    public Concesionario(String n, Gerente g, String adr, String tel){
        name = n;
        gerent = g;
        adress = adr;
        telf = tel;
    }
    public void addAuto(Auto car){
        cars.add(car);
    }
    public void addVendedor(Vendedor vend){
        salesSttaf.add(vend);
    }
    public String getName(){
        return name;
    }
    public Gerente getGerente(){
        return gerent;
    }
    public String getAdress(){
        return adress;
    }
    public String getTelf(){
        return telf;
    }
    public void imprimirEstatus (){ 
        System.out.println("Datos de la Empresa:" );
        System.out.println(this);
        System.out.println("Datos del gerente: ");
        System.out.println(gerent);
        System.out.println("\nVendedores: "); 
        for (Vendedor person: salesSttaf){
           System.out.println(person);  
        }
        System.out.println("\nAutos: ");
        for (Auto car : cars){
            System.out.println(car); 
        }
    }
    public String toString(){
        return "Empresa: "+name+"|Direccion: "+adress+"|Telf: "+telf;
    }
}    
