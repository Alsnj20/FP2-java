package InputFile;
/*Programa que lea los 10 lanzamientos aleatorios de un
dado, luego que los almacene en un arreglo. Usando
métodos*/
import java.io.*;
import java.util.Scanner;

public class Archivo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lanz = new int[10];
        try {
            Scanner fileIn = new Scanner(new FileReader("./PrintFile/dadoLanzamiento.txt"));
            System.out.println("Abriendo el archivo...");
            fileLanzamientos(fileIn, lanz);
            System.out.println("Información del archivo: ");
            System.out.println("Lanzamientos aleatorios de un dado: ");
            printLanzamientos(lanz);
            fileIn.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    public static void fileLanzamientos(Scanner file, int[] lanz) {
        for (int i = 0; i < lanz.length && file.hasNextLine(); i++) {
            lanz[i] = file.nextInt();
        }
    }
    public static void printLanzamientos(int[] lanzamientos) {
        for (int i = 0; i < lanzamientos.length; i++)
            System.out.println("L " + (i + 1) + ": " + lanzamientos[i]);
    }
}
