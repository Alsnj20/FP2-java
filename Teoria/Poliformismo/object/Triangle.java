package Poliformismo.object;

public class Triangle{
    private int base, height;
    public Triangle(int b, int h){
        base = b;
        height = h;
    }
    public int getBase(){
        return base;
    }
    public int getHeight(){
        return height;
    }
    public int getArea(){
        return (getBase()*getHeight())/2;
    }
    public String toString(){
        return "\nBase: "+getBase()+"\nAltura: "+getHeight()+"\nArea: "+getArea();
    }
}   