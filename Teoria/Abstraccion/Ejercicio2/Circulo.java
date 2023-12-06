public class Circulo extends Shape{
    private final double  PI = 3.14;
    private int radius;
    public Circulo(){
        super();
        radius = (int)(Math.random()*10+1);
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public String toString(){
        return "\nCIRCULO:\nRadio: "+radius+
        "\n"+super.toString();
    }
}
