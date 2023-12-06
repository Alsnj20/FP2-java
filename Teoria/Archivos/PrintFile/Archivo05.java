package PrintFile;
/*Imprimir en un archivo, cuyo nombre ingresemos por teclado, un
mensaje que también ingresemos por teclado
 */
import java.util.*;
import java.io.*;
public class Archivo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter fileName: ");
            PrintWriter fileOut = new PrintWriter(sc.nextLine());
            System.out.println("Ingrese un texto: ");
            fileOut.println(sc.nextLine());
            fileOut.close();
            System.out.println("saved file");
            System.out.println("");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: "+e.getMessage());
        }
        sc.close();
    }
}
