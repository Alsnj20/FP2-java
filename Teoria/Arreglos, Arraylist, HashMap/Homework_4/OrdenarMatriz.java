import java.util.*;
class OrdenarMatriz{
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        fillArray(matriz);
        printArray(matriz);
        System.out.println("-------------------");
        for (int i = 0; i < matriz.length*matriz[0].length; i++) {
            sortCol(matriz);
            sortRow(matriz);
            
        }
        printArray(matriz);
        System.out.println("---------------------");
    }
    public static void fillArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*10);
            }
        }
    }
    public static void sortRow(int[][]array){
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length-1-j; i++) {
                if(array[j][i] > array[j][i+1]){
                    int tempo = array[j][i];
                    array[j][i] = array[j][i+1];
                    array[j][i+1] = tempo;
                }
            }
        }
    }
    public static void sortCol(int[][]array){
        for (int j = 0; j < array.length-1; j++) {
            for (int i = 0; i > array[j].length; i++) {
                if(array[j][i] < array[j+1][i]){
                    int tempo = array[j][i];
                    array[j][i] = array[j+1][i];
                    array[j+1][i] = tempo;
                }
            }
        }
    }
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
