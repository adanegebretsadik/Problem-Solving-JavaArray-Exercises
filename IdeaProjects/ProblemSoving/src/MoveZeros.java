import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] arr) {
        int lastNonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[lastNonZeroIndex++] = arr[i];
            }
        }
        for (int i = lastNonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 0, 5, 6, 7, 8, 9 };
        moveZeroes(arr);
        System.out.println("Array after moving zeroes: " + Arrays.toString(arr));
    }
}
