package InputFile;
/*Programa que lea los 10 lanzamientos aleatorios de un
dado, luego que los almacene en un arreglo. Usando
métodos*/
import java.io.*;
import java.util.Scanner;
class Archivo07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fileName");
        String file = sc.nextLine();
        try{
            Scanner fileIn = new Scanner(new FileReader("./PrintFile/"+file));
            String keyWord = fileIn.nextLine(); //leer una linea
            System.out.println("La 1ra linea del archivo "+file+" es: ");
            System.out.println(keyWord);
            fileIn.close();

        }
        catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }
        sc.close();
    }
}