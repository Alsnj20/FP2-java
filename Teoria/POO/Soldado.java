public class Soldado {
    private String name;
    private int nLife;
    public Soldado(String name,int nLife){
        this.name = name;
        this.nLife = nLife;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLife(int nLife){
        this.nLife = nLife;
    }
    public String toString(){
        return name+" "+nLife;
    }
    public String getName(){
        return name;
    }
    public int getLife(){
        return nLife;
    } 
}