import java.util.Scanner;
public class Programa4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] soldadosLista = new String[5];
        int[] nivelVida = new int[5];
        fillData(soldadosLista, nivelVida, sc);
        System.out.println("----------------------------");
        printData(soldadosLista, nivelVida);
    }
    public static void fillData(String[] nombres, int[] lifeN, Scanner key){
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre para Soldado "+i);
            nombres[i] = key.next();
            lifeN[i] = (int)(Math.random()*5+1);
        }
    }
    public static void printData(String[] nombre, int[] lifeN){
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Nombre: "+nombre[i]+ " Nivel de vida: "+lifeN[i]);
        }
    }   
}
