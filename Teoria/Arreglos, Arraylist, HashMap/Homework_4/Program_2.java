public class Program_2 {
    public static void main(String[] args) {
        int n = 56;
        int[] arra = {7,9,10,23,56};
        System.out.println(binarySearch(arra, n));
    }
    public static int binarySearch(int[] array, int n){
        int left = 0;
        int right = array.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(array[mid] == n){
                return mid;
            }else if(array[mid] < n){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }   
}
