package PrintFile;

import java.io.*;
import java.util.Scanner;

/*Imprimir en el archivo numeritosAleatorios.txt los 10
lanzamientos aleatorios de un dado
 */
public class Archivo03 {
    public static void main(String[] args) {
        try {
            PrintWriter fileOut = new PrintWriter(new FileWriter("numeritosAleatorios.txt", true));
            fileOut.println("Lanzamientos aleatorios de un dado: ");
                for (int i = 1; i <= 10; i++) {
                    fileOut.println("Lanzamiento "+i+": "+(int)(Math.random()*6+1));
                }
            fileOut.close();
            System.out.println("Archivo guardado");
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }
}
