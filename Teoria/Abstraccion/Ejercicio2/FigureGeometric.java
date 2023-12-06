import java.util.ArrayList;

public class FigureGeometric {
    public static void main(String[] args) {
        int cantFigureGeometric = (int)(Math.random()*10+1);
        ArrayList<Shape> figure = new ArrayList<>();
        System.out.println("Cantidad de figura geometricas :"+cantFigureGeometric);
        for (int i = 0; i < cantFigureGeometric; i++) {
            int n = (int)(Math.random()*2+1);
            Shape f = null;
            if(n == 1) f = new Circulo();
            if(n == 2) f = new Rectangulo();
            figure.add(f);
        }
        for (Shape shape : figure) {
            System.out.println(shape);
        }
    }
}
