package AgregacionComposicion;

public class Auto {
    private String name;
    private String brand;
    private int year;
    public Auto(String nam, String marc, int yea){
        this.name = nam;
        this.brand = marc;
        this.year = yea;
    }
    public String getName(){
        return name;
    }
    public String getBrand(){
        return brand;
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        return "Modelo: "+getName()+"|Marca: "+getBrand()+"|Año: "+getYear();
    }
}
    

