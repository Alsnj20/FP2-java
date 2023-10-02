import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Eje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList<>();

        // Llenar el ArrayList con contactos
        llenarContactos(contactos, sc);

        // Imprimir todos los contactos
        System.out.println("Lista de Contactos:");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }

        // Realizar una búsqueda binaria por nombre
        System.out.println("Ingrese el nombre del contacto que desea buscar:");
        String nombreABuscar = sc.next();

        int indiceEncontrado = searchBinaryContact(contactos, nombreABuscar);

        if (indiceEncontrado != -1) {
            System.out.println("Contacto encontrado:");
            System.out.println(contactos.get(indiceEncontrado));
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public static void llenarContactos(ArrayList<Contacto> contactos, Scanner sc) {
        while (true) {
            System.out.println("Ingrese los datos del contacto (0 en nombre para salir):");
            String nombre = sc.next();
            if (nombre.equals("0")) {
                break; // Salir si se ingresa "0" en el nombre
            }
            int edad = sc.nextInt();
            String estadoCivil = sc.next();
            Contacto contacto = new Contacto(nombre, edad, estadoCivil);
            contactos.add(contacto);
        }
        // Ordenar la lista alfabéticamente por nombre
        Collections.sort(contactos);
    }

    public static int searchBinaryContact(ArrayList<Contacto> contactos, String nombre) {
        int left = 0;
        int right = contactos.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            String nombreContacto = contactos.get(mid).getNombre();
            int comparacion = nombreContacto.compareTo(nombre);

            if (comparacion == 0) {
                return mid; // Encontrado
            } else if (comparacion < 0) {
                left = mid + 1; // Buscar en la mitad derecha
            } else {
                right = mid - 1; // Buscar en la mitad izquierda
            }
        }

        return -1; // No encontrado
    }
}
