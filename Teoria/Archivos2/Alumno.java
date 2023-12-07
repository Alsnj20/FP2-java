import java.io.Serializable;
/*Almacenar N objetos Alumno (cui, nombre, edad), leerlos,
ordenarlos por edad y almacenarlos en otro archivo de objetos */
public class Alumno implements Serializable {
    private String cui;
    private String name;
    private int edad;
    public Alumno(String n, int e, String c){
        cui = c;
        name = n;
        edad = e;
    }
    public int getEdad(){
        return edad;
    }
    public String toString(){
        return name+" "+edad+" "+cui; 
    }
}
