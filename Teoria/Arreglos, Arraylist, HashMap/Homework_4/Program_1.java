class Program_1 {
    public static void main(String[] args){
        int n = 8;
        int[] array = {2,5,8,9,12};
        System.out.println(linearSearch(array, n));
    }
    public static int linearSearch(int[] array, int n){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n) return i;
        }
        return -1;
    }
}