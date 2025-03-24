public class PalindromeArray {
    public static boolean isPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end --;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,3,2,1 };
        System.out.println(isPalindrome(arr));

    }
}
