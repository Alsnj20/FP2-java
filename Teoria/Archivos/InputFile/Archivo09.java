package InputFile;
/*Leer del archivo numeritosAleatorios.txt los 10
lanzamientos aleatorios de un dado ya almacenados*/
import java.io.*;
import java.util.Scanner;
class Archivo09{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Scanner fileIn = new Scanner(new FileReader("./PrintFile/numeritosAleatorios.txt"));
            System.out.println("Abriendo el archivo...");
            System.out.println("Información del archivo: ");
            while(fileIn.hasNextLine()){
                String keyWord = fileIn.nextLine();
                System.out.println(keyWord);
            }
            fileIn.close();

        }
        catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }
        sc.close();
    }
}