import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int ar : arr) set.add(ar);

        int logest = 0;
        for (int ar : arr) {
            if (!set.contains(ar - 1)){
                int currentar = ar;
                int length = 1;
                while (set.contains(currentar + 1)){
                    currentar++;
                    length++;
                }
                logest = Math.max(logest, length);
            }
        }
        return logest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(longestConsecutive(arr));
    }
}
