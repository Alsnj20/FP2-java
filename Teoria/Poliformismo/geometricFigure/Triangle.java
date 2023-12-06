package Poliformismo.geometricFigure;

public class Triangle extends GeometricFigure{
    private int base, height;
    public Triangle(int b, int h){
        base = b;
        height = h;
        setNameGeometricFigure("triangle");
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
        return super.toString()+"\nBase: "+getBase()+"\nAltura: "+getHeight()+"\nArea: "+getArea();
    }
}   