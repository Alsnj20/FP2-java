public class Empleado {
    private String firstName;
    private String lastName;
    private int dni;
    public Empleado(String f, String l, int id){
        firstName = f;
        lastName = l;
        dni = id;
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
    public String toString(){
        return "Nombre: "+getFirstName()+
        "\nApellido: "+getLastName()+
                "\nDNI: "+getDNI();
    }
}
