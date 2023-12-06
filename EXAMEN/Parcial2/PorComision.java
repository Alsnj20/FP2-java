public class PorComision extends Empleado{
    private int ventas;
    private int porcentaje;
    public PorComision(String f, String l, int id,int v, int p){
        super(f, l, id);
        ventas = v;
        porcentaje = p;
    }
    public int getVentas(){
        return ventas;
    }
    public int getPorcentaje(){
        return porcentaje;
    }
    public double getSueldo(){
        return (double)(getVentas()*getPorcentaje()/100);
    }
    public String toString(){
        return super.toString()+"\nSueldo: "+getSueldo();
    }
}
