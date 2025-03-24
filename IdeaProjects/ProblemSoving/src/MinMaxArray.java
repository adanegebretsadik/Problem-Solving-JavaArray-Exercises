public class MinMaxArray {
    public static void minMaxNumber(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("max is " + max);
        System.out.println("min is " + min);

    }

    public static void main(String[] args) {
        int[] arr = { 21,55,68,12,45,32,75,16,82,27 };
        minMaxNumber(arr);
    }
}