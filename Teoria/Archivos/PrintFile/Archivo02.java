package PrintFile;

/*Imprimir en el archivo numeritos.txt los 10 primeros
números enteros mayores que 0
 */
import java.util.*;
import java.io.*;

public class Archivo02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter filename: ");
            PrintWriter fileOut = new PrintWriter(new FileWriter(scan.nextLine(), true));
            fileOut.println("Los 10 primeros números enteros mayores que 0");
                for (int i = 1; i <= 10; i++) {
                    fileOut.println(i);
                }
            fileOut.close();
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }
}
