package PrintFile;
/*El anterior pero abrir el archivo por segunda vez, ahora en modo
añadir y añadir un segundo mensaje que también ingresemos
por teclado
 */
import java.io.*;
import java.util.Scanner;

public class Archivo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fileName: ");
        String nameFile = sc.nextLine();
        try {
            PrintWriter fileOut = new PrintWriter(nameFile);
            System.out.print("Ingrese el primer mensaje a imprimir en el archivo: ");
            fileOut.println(sc.nextLine());
            fileOut.close();//si no cerramo el archivo que seria como guardar el 2do message estara en la primera linea
            fileOut = new PrintWriter(new FileWriter(nameFile, true));
            System.out.print("Ingrese el segundo mensaje a añadir en el archivo: ");
            fileOut.println(sc.nextLine());
            fileOut.close();
            System.out.println("Archivo guardado");
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
        sc.close();
    }
}
