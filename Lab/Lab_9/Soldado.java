package Lab.Lab_9;
public class Soldado {
    private String name;
    private int levelAttack;
    private int levelDefense;
    private int levelLife;
    int speed;
    private int row;
    private int column;
    private String posture; //defensiva, ofensiva, fuga
    private boolean live;
    public Soldado(String posture, int speed, int levelLife){
        this.posture = posture;
        this.speed = speed;
        this.levelLife = levelLife;
    }
    public Soldado(int levelAttack, int levelDefense){
        this.levelAttack = levelAttack;
        this.levelDefense = levelDefense;
    }
    public void setNiveldeAtaque(int levelAttack){
        this.levelAttack = levelAttack;
    }
    public void setNiveldeDefensa(int levelDefense){
        this.levelDefense = levelDefense;
    }
    public Soldado (String name, int levelLife, int row, int column){
        this.name = name;
        this.levelLife = levelLife;
        this.row = row;
        this.column = column;
    }
    public void atacar(){
        this.posture = "ofensiva";
        System.out.println("La actitud es: "+posture);
        avanzar(1);
    }
    public void defender(){
        this.posture = "defensiva";
        avanzar(0);
    }
    public void huir(){
        this.posture = "fuga";
        avanzar(2);
    }
    public void avanzar(int n){
        if(n==0){
            speed = 0;
            System.out.println("El soldado se paro");
        }else{
            speed +=n;
            System.out.println("El soldado avanza "+speed);
        }
    }
    public void retroceder(){
        if(speed>0)
            defender();
        if(speed == 0)
            speed--;
    }
    public void serAtacado(){
        levelLife--;
        if(levelLife == 0){
            morir();
        }
    }
    public void morir(){
        live = false;
        System.out.println("El soldado ha muerto :(");
    }
    public void setVidaActual(int levelLife){
        this.levelLife = levelLife;
    }
    public int getVidaActual(){return levelLife;}
    public String getName(){
        return name;
    }
    public void data(){
        System.out.println("Actitud: "+posture+" Vida: "+levelLife+" Velocidad: "+speed); 
    }
    public String toString(){
        return "Nombre: "+name+" |Nivel de vida: "+levelLife+" |Fila: "+row+" |Columna: "+column
        +"/nNivel de Ataque: "+levelAttack+" |Nivel de Defenda: "+levelDefense;
    }
}
