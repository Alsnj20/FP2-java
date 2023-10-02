public class Program_4 {
    public static void main(String[] args) {
        int[] array = {5, 17, 23, 50, 12, 44, 38, 84, 77};
        printArray(array);
        System.out.println();
        System.out.println("------------------------------");
        selectionSort(array);
        printArray(array);
    }
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int tem = array[i];
            array[i] = array[index];
            array[index] = tem;  
        }
    } 
    public static void printArray(int[] array){
        System.out.print("[ ");
        for (int n : array) {
            System.out.print(n+" ");
        }
        System.out.print("]");
    } 
    public static int minN(int[] array, int n){
        for (int i = n + 1; i < array.length; i++) {
            if (array[i] < array[n]) {
                return i;
            }
        }
        return 0;
    }
}
