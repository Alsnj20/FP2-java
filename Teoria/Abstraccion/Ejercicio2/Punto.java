public class Punto {
    private int x;
    private int y;
    public Punto(){
        x = (int)(Math.random()*10);
        y = (int)(Math.random()*10);
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}

