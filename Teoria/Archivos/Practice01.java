import java.util.*;
import java.io.*;
class Practice01{
    public static void main(String[] args) {
        try{
            PrintWriter fileOut = new PrintWriter("archivo.txt");
            fileOut.println("hola");
            fileOut.close();
            System.out.println("Archivo guardado");
        }
        catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}