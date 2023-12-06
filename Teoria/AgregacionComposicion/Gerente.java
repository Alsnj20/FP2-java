package AgregacionComposicion;
public class Gerente {
    private String name;
    private int age;
    private String telephone;
    public Gerente(String n, int edad, String number){
        this.name = n;
        this.age = edad;
        this.telephone = number;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getTelephone(){
        return telephone;
    }
    public String toString(){
        return "Nombre: "+getName()+"|Edad: "+getAge()+"|Telefono: "+getTelephone();
    }
}
