package Herencia2;
public class Person {
    private String firstName;
    private String lastName;
    private int dni;
    private String telephone;
    public Person(String f, String l, int id, String telf){
        firstName = f;
        lastName = l;
        dni = id;
        telephone = telf;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getDNI(){
        return dni;
    }
    public String getTelephone(){
        return telephone;
    }
    public void display(){
        System.out.println("Nombre: "+getFirstName()+
                "\nApellido: "+getLastName()+
                "\nDNI: "+getDNI()+
                "\nTelf: "+getTelephone()); 
    }
    public String toString(){
        return "Nombre: "+getFirstName()+
        "\nApellido: "+getLastName()+
                "\nDNI: "+getDNI()+
                "\nTelf: "+getTelephone();
    }
}
