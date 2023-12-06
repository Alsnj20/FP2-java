public class SueldoFijo extends Empleado{
    private int sueldo;
    public SueldoFijo(String f, String l, int id,int s){
        super(f,l,id);
        sueldo = s;
    }
    public int getSueldo(){
        return sueldo;
    }
    public String toString(){
        return super.toString()+"\nSueldo: "+getSueldo();
    }
}
