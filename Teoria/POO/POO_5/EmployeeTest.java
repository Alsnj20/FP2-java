public class EmployeeTest{
    public static void main(String[] args) {
        Employee empl1 = new Employee("Alisson", "Jara", 18);
        System.out.println(empl1);
        Employee empl2 = new Employee("Emily", "Ocon", 18);
        System.out.println(empl2);
        Employee empl3 = new Employee("Olivia", "Chambi", 40);
        System.out.println(empl3);
        int cant = Employee.getCountEmploye();
        System.out.println("Cantidad de empleados es: "+cant);
    }
}