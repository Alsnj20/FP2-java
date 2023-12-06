package Herencia1;

public class TestFullTime {
    public static void main(String[] args) {
        Person per1 = new Person("Laura");
        System.out.println("Nombre: "+per1.getName());
        System.out.println("---------------------------");
        Employee emple1 = new Employee("Alonso", 123);
        FullTime emp = new FullTime("Alberto", 456, 83.8);
        emple1.display();
        System.out.println("---------------------------");
        emp.display();
    }  
}
