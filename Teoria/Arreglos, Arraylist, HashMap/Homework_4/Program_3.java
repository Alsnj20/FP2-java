public class Program_3 {
    public static void main(String[] args) {
        int[] array = { 23, 17, 5, 90, 12, 44, 38, 84, 77 };
        printArray(array);
        System.out.println("-----------------------------");
        bubbleSort(array);
        printArray(array);
    }
    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
