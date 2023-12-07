import java.io.*;
import java.util.Scanner;

/* Generar un conjunto de N enteros aleatorio en intervalo [x..y] 
yalmacenarlos en un archivo binario, luego leerlos, ordenarlos y
almacenarlos en otro archivo binario */
public class Archivo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataOutputStream fileOut;
        System.out.println("Ingrese el rango minimo: ");
        int x = sc.nextInt();
        System.out.println("Ingrese el rango maximo");
        int y = sc.nextInt();
        System.out.println("Ingrese las cantidad de numeros enteros");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter file binary name: ");
        String file = sc.nextLine();
        try {
            fileOut = new DataOutputStream(new FileOutputStream(file));
            for (int i = 0; i < n; i++)
                fileOut.writeInt((int) (Math.random() * (y - x) + x));
            fileOut.close();
            System.out.println("Save binary file");

            int[] array = new int[n];
            DataInputStream fileIn = new DataInputStream(new FileInputStream("./" + file));
            for (int i = 0; i < array.length; i++)
                array[i] = fileIn.readInt();
            fileIn.close();

            bubbleSort(array);

            System.out.println("Ingrese el nombre del nuevo archivo");
            String fileNew = sc.nextLine();

            DataOutputStream fileOut2 = new DataOutputStream(new FileOutputStream(fileNew));
            for (int i = 0; i < array.length; i++) {
                fileOut2.writeInt(array[i]);
            }
            fileOut2.close();
            System.out.println("Abriendo el archivo: ");

            DataInputStream fileIn2 = new DataInputStream(new FileInputStream("./" + fileNew));
            for (int i = 0; i < array.length; i++)
                System.out.println(fileIn2.readInt());
            fileIn2.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
