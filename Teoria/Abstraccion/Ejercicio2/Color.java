public class Color {
    private int red;
    private int green;
    private int blue;
    public Color(){
        red = (int)(Math.random()*255);
        green = (int)(Math.random()*255);
        blue = (int)(Math.random()*255);
    }
    public int getRed(){return red;}
    public int getGreen(){return green;}
    public int getBlue(){return blue;}
    public void setColor(int r, int g, int b){
        red = r; green = g; blue = b;
    }
    public String toString(){
        return "("+red+","+green+","+blue+")";
    }
}
