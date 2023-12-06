package Poliformismo.object;

public class Rectangle{
    private int width, length;
    public Rectangle(int b, int h){
        width = b;
        length = h;
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
        return "\nBase: "+width+"\nAltura: "+length+"\nArea: "+getArea();
    }   
}


