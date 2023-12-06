package Herencia2;
public class Auto {
    private String nameCar;
    private String brand;
    private int year;
    public Auto(String nam, String marc, int yea){
        this.nameCar = nam;
        this.brand = marc;
        this.year = yea;
    }
    public String getName(){
        return nameCar;
    }
    public String getBrand(){
        return brand;
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        return "Modelo: "+getName()+
                "\nMarca: "+getBrand()+
                "\nAño: "+getYear();
    }
}
