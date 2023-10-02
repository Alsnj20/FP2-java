public class Program_5 {
    public static void main(String[] args) {
        int[] array = {5,2,4,1,3};
        printArray(array);
        System.out.println();
        System.out.println("------------------------------");
        insertionSort(array);
        printArray(array);
    }
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j--;
                }
            array[j + 1] = key;
        }
    }
    public static void printArray(int[] array){
        System.out.print("[ ");
        for (int n : array) {
            System.out.print(n+" ");
        }
        System.out.print("]");
    }
}
    
