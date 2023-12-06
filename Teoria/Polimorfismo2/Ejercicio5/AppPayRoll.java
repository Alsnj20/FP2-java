package Ejercicio5;
import java.util.*;
public class AppPayRoll{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("REGISTRAR A SUS EMPLEADOS");
        ArrayList<Employee> employees = new ArrayList<>();
        boolean play = true;
        while (play) {
            System.out.println("Ingrese una de las siguiente opcion para registrar a su empleado");
            System.out.println("1.Asalariado\n2.Por Horas\n3.Salir");
            int option = sc.nextInt();
            Employee emple; String name;
            switch (option) {
                case 1:
                    System.out.println("-Asalariado-");
                    System.out.print("Ingrese su Nombre: ");
                    name = sc.next();
                    System.out.print("Ingrese su salario: ");
                    double s = sc.nextDouble();
                    emple = new Salaried(name, s);
                    employees.add(emple);
                    break;
                case 2:
                    System.out.println("-Por Horas-");
                    System.out.print("Ingrese su nombre: ");
                    name = sc.next();
                    System.out.print("Ingrese su pago por hora: ");
                    double ph = sc.nextDouble();
                    emple = new Hourly(name, ph);
                    employees.add(emple);
                    break;
                case 3:
                    play = false;
                    break;
            }
        }
        printPayDays(employees);
    }

    public static void printPayDays(ArrayList<Employee> emple) {
        for (int i = 1; i <= 30; i++) {
            for (Employee employee : emple) {
                if (employee != null) {
                    employee.setnrodayPay(i);
                }
            }
        }
    }
}
