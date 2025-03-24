import java.util.HashSet;
import java.util.Set;

public class PairSumTarget {
    public static void findPairs(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int target =  4;
        System.out.println("Pairs with target sum:");
        findPairs(arr, target);
    }
}
