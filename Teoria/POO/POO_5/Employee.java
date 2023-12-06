/* Crear la clase Empleado con atributos:
◼ nombre
◼ apellido
◼ edad
◼ Además consignar un atributo de clase que vaya
contando la cantidad de empleados que vayamos
creando
◼ En métodos: 2 constructores sobrecargados y los gets
◼ Crear un main que cree varios objetos, que pruebe los
gets y que muestre la cantidad de objetos creados */
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private static int countEmploye = 0;
    public Employee(){
        this(null, null, 0);
    }
    public Employee(String firstN, String lastN, int age){
        this.firstName = firstN;
        this.lastName = lastN;
        this.age = age;
        countEmploye++;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public static int getCountEmploye(){
        return countEmploye;
    }
    public String toString(){
        return "FirstName: "+firstName+"|LastName: "+lastName+"|Age: "+age;
    }
}
