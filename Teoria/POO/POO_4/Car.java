/*Car car2 = car1; copioa la referencia y sale iguales*/
public class Car {
    private String make;
    private int year;
    private String color;
    public Car(){
        this(null, 0, null);
    }
    public Car(String make, int year, String color){
        setMake(make);
        setYear(year);
        setColor(color);
    }
    public void setMake(String m){
        this.make = m;
    }
    public void setYear(int y){
        this.year = y;
    }
    public void setColor(String c){
        this.color = c;
    }
    public String toString(){
        return make+" "+year+" "+color;
    }
    public Car makeCopy(){
        return new Car(make, year, color);
    }
    public boolean equals(Car c){
        return this.make.equals(c.make) && this.year == c.year && this.color.equals(c.color);
    }
    //encadenamiento de metodo
    public Car setMake1(String m){
        this.make = m;
        return this;
    }
    public Car setYear1(int y){
        this.year = y;
        return this;
    }
    public Car setColor1(String c){
        this.color = c;
        return this;
    }
}
