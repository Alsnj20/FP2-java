package InputFile;
/*Leer del archivo numeritos.txt los 10 primeros
números enteros mayores que 0 que fueron almacenados*/
import java.io.*;
import java.util.Scanner;
class Archivo08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fileName");
        String file = sc.nextLine();
        try{
            Scanner fileIn = new Scanner(new FileReader("./PrintFile/"+file));
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