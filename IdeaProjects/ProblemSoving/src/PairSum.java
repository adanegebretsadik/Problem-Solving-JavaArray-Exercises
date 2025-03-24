import java.util.HashSet;

public class PairSum {
    public static void findPairs(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = k - num;
            if (set.contains(complement)) {
                System.out.println("Pair: ( " + complement + ", " + num + ")");
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 10;
        findPairs(arr, k);
    }
}
