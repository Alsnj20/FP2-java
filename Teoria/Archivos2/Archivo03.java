import java.io.*;
import java.util.*;
/* Almacenar N objetos Alumno (cui, nombre, edad), leerlos,
ordenarlos por edad y almacenarlos en otro archivo de objetos */
public class Archivo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos: ");
        int cant = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter file name: ");
        String file = sc.nextLine();
        ObjectOutputStream fileOut;
        try {  
            fileOut = new ObjectOutputStream(new FileOutputStream(file));
            for (int i = 0; i < cant; i++) {
            System.out.println("Enter your (name/age/id): ");
            Alumno c = new Alumno(sc.next(), sc.nextInt(), sc.next());
            fileOut.writeObject(c);
            }
            fileOut.close();
            System.out.println("Save file");
            Alumno[] alu = new Alumno[cant];
            ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream("./"+file));
            for (int i = 0; i < cant; i++) {
                alu[i] = (Alumno) fileIn.readObject();
            }
            fileIn.close();
            System.out.println("Save file");
            sc.nextLine();
            System.out.println("Enter new file name");
            String fileNew = sc.nextLine();
            ObjectOutputStream fileOut2 = new ObjectOutputStream(new FileOutputStream(fileNew));
            bubbleSort(alu);
            for (int i = 0; i < alu.length; i++) {
                fileOut2.writeObject(alu[i]);
            }
            System.out.println("Save file");
            fileOut2.close();
            System.out.println("Open file");
            ObjectInputStream fileIn2 = new ObjectInputStream(new FileInputStream("./" + fileNew));
            for (int i = 0; i < alu.length; i++)
                System.out.println(fileIn2.readObject());
            fileIn2.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        sc.close();
    }

    public static void bubbleSort(Alumno[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j].getEdad() > list[j + 1].getEdad()) {
                    Alumno temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
