package Poliformismo.object;
public class TestGeometricFigure {
    public static void main(String[] args) {
        Object obj;
        obj = new Triangle(4, 5);
        System.out.println(obj);
        obj = new Circle(5);
        System.out.println(obj);
        obj = new Rectangle(3, 5);
        System.out.println(obj);
    }
}
