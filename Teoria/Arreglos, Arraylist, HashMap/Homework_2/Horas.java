import java.util.*;
class Horas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] horas = fillHour(30);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nDia "+(i+1)+" : ");
            horas = modificateHour1(horas);
            printHour(horas);
        } 
    sc.close();
    }
    public static int[] fillHour(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateHour();
        }
        return array;
    }
    public static int generateHour() {
        return (int) (Math.random() * 9);
    }
    public static void printHour(int[] array) {
        System.out.print("[ ");
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.print("]");
    }
    public static int[] modificateHour(int[] arra) {
        int[] array = new int[arra.length];
        System.arraycopy(arra, 1, array, 0, 29);
        array[29] = generateHour();
        System.out.println("Ingrese las horas trabajadas para el dia 30: "+array[29]);
        return array;
    }
    public static int[] modificateHour1(int[] arra) {
        int[] array = new int[arra.length];
        for(int i=0; i<array.length-1; i++){
            array[i]=arra[i+1];
        }
        array[29] = generateHour();
        System.out.println("Ingrese las horas trabajadas para el dia 30: "+array[29]);
        return array;
    }
}

