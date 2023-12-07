import java.io.*;
import java.util.ArrayList;
/*EJERCICIO1: Leer e imprimir en pantalla los datos
(descripción, cantidad y números) escritos en el archivo
del Ejemplo (archivo con estructura). Primero leer los
números a un ArrayList, luego imprimirlos */
class Archivo01{
    public static void main(String[] args) {
        DataInputStream fileIn;
        ArrayList<Integer> array = new ArrayList<>();
        String inf = "";char c;
        try{
            fileIn = new DataInputStream(new FileInputStream("./archivo1.dat"));
            while((c = fileIn.readChar()) != 0)
                inf +=c;
            int cant = fileIn.readInt();//primer entero
            System.out.println(inf+" "+cant);
            for(int i=0; i<cant; i++){
                array.add(fileIn.readInt());
            }
            for(Integer n: array){
                System.out.println(n);
            }
            fileIn.close();
        }catch(Exception e){
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}