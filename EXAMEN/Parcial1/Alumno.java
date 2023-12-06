class Alumno {
    private int n;
    private String name;
    private String cui;
    public Alumno(int n, String name, String cui){
        setN(n);
        setName(name);
        setCui(cui);
    }
    public void setN(int n){
        this.n = n;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCui(String cui){
        this.cui = cui;
    }
    public int getN(){
        return n;
    }
    public String getName(){
        return name;
    }
    public String getCui(){
        return cui;
    }
    public String toString(){
        return this.n+"."+this.name+" "+this.cui;
    }
}
