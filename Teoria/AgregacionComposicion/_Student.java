package AgregacionComposicion;

public class _Student {
    private int numList;
    private String name;
    private _Address home;
    public _Student(int num, String nom){
        numList = num;
        name = nom;
    }
    public int getNumList(){
        return numList;
    }
    public String getName(){
        return name;
    }
    public _Address getAddress(){
        return home;
    }
    public void addAddress(_Address dir){
        this.home = dir;
    }
    public void printData(){
        System.out.println(numList+"\t"+name+"\t"+home);
    }
}
