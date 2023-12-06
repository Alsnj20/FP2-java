public class Rectangulo extends Shape {
    private int base;
    private int height;
    public Rectangulo(){
        super();
        base = (int)(Math.random()*10+1);
        height = (int)(Math.random()*10+1);
    }
    public double getArea(){
        return base*height*1.0;
    }
    public double getPerimeter(){
        return 2*(base+height)*1.0;
    }
    public String toString(){
        return "\nRECTANGULO:\nBase: "+base+"   Altura: "+height+
        "\n"+super.toString();
    }
}
