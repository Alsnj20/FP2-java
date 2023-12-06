package PrintFile;
/*Imprimir en el archivo mensaje.txt el texto: 
hola amigos, como estan */
import java.io.*;
class Archivo01{
    public static void main(String[] args) {
        try{
            PrintWriter fileOut = new PrintWriter("mensaje.txt");
            fileOut.println("Hola amigos, como estan");
            fileOut.close();
            System.out.println("Archivo guardado");
        }
        catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}