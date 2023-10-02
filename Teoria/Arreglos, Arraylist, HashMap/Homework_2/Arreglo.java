
/*Crear métodos ingresar(), modificar(), imprimir(),
que permitan ingresar los n enteros de un arreglo,
modificar multiplicando por 2 sus elementos e
imprimir sus elementos. Los métodos deben
permitir trabajar con arreglos unidimensionales de
cualquier tamaño. Crear un main() que pruebe
dichos métodos*/

import java.util.Scanner;
public class Arreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();//longitud del arreglo;
        int[] arr = new int[n];
        fillArray(arr);
        printArray(arr);
        multforTwo(arr);
        System.out.println();
        printArray(arr);
        
    }
    public static void fillArray(int[] array){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }
    public static void multforTwo(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] *=2;
        }
    }
    public static void printArray(int[] array){
        System.out.print("[");
        for (int n : array) {
            System.out.print(" "+n);
        }
        System.out.print(" ]");
    }
    
}
