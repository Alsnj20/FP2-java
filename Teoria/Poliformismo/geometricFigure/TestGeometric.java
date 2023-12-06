package Poliformismo.geometricFigure;
public class TestGeometric {
    public static void main(String[] args) {
        GeometricFigure[] fig = new GeometricFigure[3];
        fig[0] = new Triangle(6, 7);
        fig[1]= new Circle(3);
        fig[2] = new Rectangle(3, 4);
        for(GeometricFigure f: fig)
            System.out.println(f);
    }
}
