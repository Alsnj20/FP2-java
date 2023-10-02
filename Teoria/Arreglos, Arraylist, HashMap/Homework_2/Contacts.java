
/*Ejercicio 3: Hacer un programa que cree un
arreglo con capacidad para 100 contactos (al
menos nombre y celular), que permita ingresar los
datos requeridos hasta que el usuario ingrese "q"
en nombre. Luego que imprima todos los datos de
los contactos ingresados. Finalmente que el
usuario ingrese un nombre y el programa muestre
su celular correspondiente. Verificar que el número
de celular tenga sólo dígitos. */
import java.util.Scanner;
public class Contacts {
    private String name;
    private String number;

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String toString() {
        return "Nombre: " + name + " |Edad: " + number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contacts[] contacts = new Contacts[100];
        fillData(contacts, sc);
        printData(contacts);
        System.out.println("Ingrese un nombre de su lista de contactos :");
        String contact = sc.next();
        findContact(contacts, contact);
    }

    public static void fillData(Contacts[] contc, Scanner key) {
        for (int i = 0; i < contc.length; i++) {
            System.out.println("Ingrese los datos: ('q') para salir");
            String name = key.next();
            if (name.equals("q"))
                break;
            String number = key.next();
            if (number.length() == 9 && number.matches("[0-9]*")) {
                contc[i] = new Contacts(name, number);
            } else {
                System.out.println("Ingrese un número de 9 digitos");
            }
        }
    }

    public static void printData(Contacts[] contc) {
        for (int i = 0; i < contc.length; i++) {
            if (contc[i] != null) {
                System.out.println(contc[i].toString());
            }
        }
    }

    public static void findContact(Contacts[] contc, String friend) {
        Boolean found = false;
        for (int i = 0; i < contc.length; i++) {
            if (contc[i] != null && contc[i].getName().equals(friend)) {
                System.out.println("Telefono: " + contc[i].getNumber());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contacto no encontrado");
        }
    }
}
