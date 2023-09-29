class Soldier {
    private String name;
    private int lifeN;
    public Soldier (String name, int lifeN){
        this.name = name;
        this.lifeN = lifeN;
    }
    public Soldier(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getLifeN(){
        return lifeN;
    }
    public String toString(){
        return "Nombre: "+name+" |Nivel de vida: "+lifeN;
    }
}
