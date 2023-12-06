package PrintFile;

import java.io.*;
import java.util.Scanner;

/*Programa que almacene en un arreglo 10 lanzamientos
aleatorios de un dado, luego que los escriba en un archivo de
texto. Usando métodos */

public class Archivo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dadoLanzamiento[] = new int[10];
        try {
            System.out.print("Enter filename: ");
            PrintWriter fileOut = new PrintWriter(new FileWriter(sc.nextLine(), true));
            fileArrayNumber(dadoLanzamiento);
            fileOut.println("Lanzamientos aleatorios de un dado: ");
            printArray(fileOut, dadoLanzamiento);
            fileOut.close();
            System.out.println("Archivo guardado");
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }
    public static void fileArrayNumber(int[] dado){
        for (int i = 0; i < dado.length; i++) {
            dado[i] = (int)(Math.random()*6+1);
        }
    }
    public static void printArray(PrintWriter file, int[] dado){
        for (int i = 1; i <= dado.length; i++) {
            file.println(""+dado[i-1]);
        }
    }
}