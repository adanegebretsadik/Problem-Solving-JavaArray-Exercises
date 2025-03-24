import java.util.Arrays;

public class Sort012 {
    public static void sort(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;
        while (mid <= high){
            if (arr[mid] == 0){
                swap(arr, low++, mid++);
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high--);
            }
        }
    }
    public static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
