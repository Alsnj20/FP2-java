import java.util.Scanner;
public class Programa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] soldadosLista = new String[5];
        fillData(soldadosLista, sc);
        System.out.println("----------------------------");
        printData(soldadosLista);
    }
    public static void fillData(String[] nombres, Scanner key){
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre para Soldado"+i);
            nombres[i] = key.next();
        }
    }
    public static void printData(String[] nombre){
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i]);
        }
    }
}
