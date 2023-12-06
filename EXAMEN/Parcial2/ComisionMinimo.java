public class ComisionMinimo extends PorComision{
    private int minimo;
    public static final int CONST = 100;
    public ComisionMinimo(String f, String l, int id,int v, int p, int m){
        super(f, l, id, v, p);
        minimo = m;
    }
    public String toString(){
        return super.toString()+"\nSueldo: "+(getSueldo()+ComisionMinimo.CONST);
    }
}
