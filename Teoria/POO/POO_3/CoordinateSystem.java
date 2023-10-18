package POO_3;
public class CoordinateSystem {
    public static void main(String[] args) {
        Coordinate p1 = new Coordinate(6, 8);
        Coordinate p2 = new Coordinate(3, 4);
        double n1 = p1.distanceV(p2);
        System.out.println("La distancia de "+p1+" a "+p2+" es : "+n1);
        double n2 = distanceV3(p1, p2);
        System.out.println("La distancia de "+p1+" a "+p2+" es : "+n2);
        double n3 = Coordinate.distanceV2(p1, p2);
        System.out.println("La distancia de "+p1+" a "+p2+" es : "+n3);

    }
    public static double distanceV3(Coordinate p1, Coordinate p2){
        return p1.distanceV(p2);
    }
}
