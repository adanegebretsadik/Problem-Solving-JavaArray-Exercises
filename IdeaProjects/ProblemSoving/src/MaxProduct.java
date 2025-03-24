public class MaxProduct {
    public static int findMaxProduct(int[] arr) {
        int max1 = 0;
        int max2 = 0;
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return max1*max2;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("The max product is " + findMaxProduct(arr));
    }
}
