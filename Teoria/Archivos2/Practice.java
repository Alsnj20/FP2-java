
import java.io.*;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataOutputStream fileOut;
        System.out.println("Enter file binary Name :");
        try {
            fileOut = new DataOutputStream(new FileOutputStream(sc.nextLine()));
            System.out.println("Ingrese la descripción: ");
            fileOut.writeChars(sc.nextLine());
            fileOut.writeChar(0); //si es importante
            System.out.println("Ingrese la cantidad de numeros: ");
            int cant = sc.nextInt();
            fileOut.writeInt(cant);
            for (int i = 0; i < cant; i++)
                fileOut.writeInt(i);
            fileOut.close();
            System.out.println("Save binary file");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}