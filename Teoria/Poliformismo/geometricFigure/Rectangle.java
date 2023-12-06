package Poliformismo.geometricFigure;

public class Rectangle extends GeometricFigure {
    private int width, length;
    public Rectangle(int b, int h){
        width = b;
        length = h;
        setNameGeometricFigure("rectangle");
    }
    public int getWidth(){
        return width;
    }
    public int getLength(){
        return length;
    }
    public int getArea(){
        return getWidth()*getLength();
    }
    public String toString(){
        return super.toString()+"\nBase: "+getWidth()+"\nAltura: "+getLength()+"\nArea: "+getArea();
    }   
}


