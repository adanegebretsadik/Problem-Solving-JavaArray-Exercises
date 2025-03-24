import java.util.Arrays;

public class RemoveDuplicate {
    public static int[] removeDuplicates(int[] nums) {
        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return Arrays.copyOf(nums, j+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 5, 6, 7, 8, 9, 10};

        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Unique: " + Arrays.toString(uniqueArr));
    }
}
