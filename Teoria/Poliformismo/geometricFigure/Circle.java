package Poliformismo.geometricFigure;
public class Circle extends GeometricFigure {
    private final double PI = 3.14;
    private int radius;
    public Circle(int r){
        radius = r;
        setNameGeometricFigure("circle");
    }
    public int getRadius(){
        return radius;
    }
    public double getArea(){
        return PI*getRadius()*getRadius();
    }
    public String toString(){
        return super.toString()+"\nRadio: "+getRadius()+"\nPI: "+PI+"\nArea: "+getArea();
    }
} 