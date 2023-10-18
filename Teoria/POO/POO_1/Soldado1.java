package POO_1;
public class Soldado1 {
    private String name;
    private int nLife;
    private String column;
    private String row;
    
    public Soldado1(String name,int nLife, String column, String row){
        this.name = name;
        this.nLife = nLife;
        this.column = column;
        this.row = row;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLife(int nLife){
        this.nLife = nLife;
    }
    public void setColumn(String column){
        this.column = column;
    }
    public void setRow(String row){
        this.row = row;
    }
    public String getName(){return name;}
    public int getLife(){return nLife;}
    public String getColumn(){return column;}
    public String getRow(){return row;}
    public String toString(){
        return name+", "+nLife+" => "+column+""+row;
    }
}
