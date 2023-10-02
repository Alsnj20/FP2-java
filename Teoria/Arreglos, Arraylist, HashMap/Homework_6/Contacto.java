public class Contacto {
    private String name;
    private int age;
    private String maritalStatus;
    public Contacto(String name, int age, String maritalStatus){
        setNombre(name);
        setEdad(age);
        setEstadoCivil(maritalStatus);
    }
    public void setNombre(String name){
        this.name=name;
    }
    public void setEdad(int age){
        this.age=age;
    }
    public void setEstadoCivil(String maritalStatus){
        this.maritalStatus = maritalStatus;
    }
    public String getNombre(){
        return name;
    }
    public int getEdad(){
        return age;
    }
    public String getEstadoCivil(){
        return maritalStatus;
    }
    public String toString(){
        return "Nombre: "+name+" |Edad: "+age+" |Estado Civil: "+maritalStatus;
    }
}
