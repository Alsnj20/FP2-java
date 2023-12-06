public class PorHoras extends Empleado{
    private int pagoHoras;
    private int cantHoras;
    public PorHoras(String f, String l, int id, int p, int h){
        super(f, l, id);
        pagoHoras = p;
        cantHoras = h;
    }
    public int getPagoHoras(){
        return pagoHoras;
    }
    public int getCantHoras(){
        return cantHoras;
    }
    public String toString(){
        return super.toString()+"\nSueldoHoras: "+(getPagoHoras()*getCantHoras());
    }
}
