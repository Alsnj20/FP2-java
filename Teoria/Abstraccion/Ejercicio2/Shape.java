/*Clase abstracta Shape, con atributos color y origen,
métodos set, get, 3 constructores sobrecargados y 2
métodos abstractos que permitan calcular el área y el
perímetro
◼ Color con atributos red, green, blue [0..255], un
constructor, 3 gets y 1 set
◼ Origen es de tipo Punto, punto en el plano cartesiano
◼ 2 clases derivadas de Shape: Círculo y Rectángulo.
Especificar qué atributos y métodos son necesarios para
cada uno */
public abstract class Shape{
    private Color color;
    private Punto origen;
    public Shape(){
        color = new Color();
        origen = new Punto();
    }
    public Shape(Color c){
        setColor(c);
    }
    public Shape(Color c, Punto o){
        color = c; origen = o;
    }
    public void setColor(Color c){
        color = c;
    }
    public void setOrigen(Punto o){
        origen = o;
    }
    public Color getColor(){return color;}
    public Punto getOrigen(){return origen;}
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Color: "+color+"    Origen: "+origen+
        "\nArea: "+getArea()+
        "\nPerimetro: "+getPerimeter();
    }
}