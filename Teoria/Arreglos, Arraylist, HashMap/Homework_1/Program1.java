/*Hacer un programa que cree un arreglo para n
notas enteras, luego que permita ingresarlas y
finalmente que las imprima. Usando métodos. */
import java.util.*;
class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = arrayFull(n, sc);
        printArray(array);
    }
    public static int[] arrayFull(int n, Scanner key){
        int[] array = new int[n];
        for(int i=0; i<array.length; i++){
            array[i] = key.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        System.out.print("[ ");
        for(int n: array){
            System.out.print(n+" ");
        }
        System.out.print("]");
    }
}
