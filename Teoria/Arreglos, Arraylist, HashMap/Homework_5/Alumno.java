public class Alumno {
    private String name;
    private int age;
    private int average;
    public Alumno(String name, int age, int average){
        this.name = name;
        this.age = age;
        this.average = average;
    }
    public int getPromedio(){
        return average;
    }
    public int getEdad(){
        return age;
    }
    public String getNombre(){
        return name;
    }
    public String toString(){
        return "Nombre: "+name+" |Edad: "+age+" |Promedio: "+average;
    }
}
