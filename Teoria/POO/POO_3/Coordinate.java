/*EJERCICIO 1: Crear la clase Coordenada, posición en el
plano (x, y), con su constructor y métodos necesarios
◼ 3 formas de calcular la distancia entre 2 coordenadas
(distancia euclidiana)
◼ Método en clase principal
◼ Método en Coordenada con 2 parámetros //mETODO CLASE
◼ Método en Coordenada con 1 parámetro */
package POO_3;
public class Coordinate {
    private double x;
    private double y;
    public Coordinate(){
        this(0, 0);
    }
    public Coordinate(double px, double py){
        x = px;
        y = py;
    }
    public Coordinate(Coordinate point2){
        this(point2.x, point2.y);
    }
    public double distanceV(Coordinate p2){ 
        double d = (Math.pow(this.x-p2.x, 2)) + Math.pow(this.y-p2.y, 2);
        return Math.sqrt(d);
    }
    public static double distanceV2(Coordinate p1, Coordinate p2){
        return p1.distanceV(p2);
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
