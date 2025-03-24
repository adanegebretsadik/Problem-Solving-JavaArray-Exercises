public class SecondLargest {
    public static int secondLargest(int[] arr) {
        int largest = 0, secondLargest = 0;
        for (int i : arr){
            if (i > largest){
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i != largest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("SecondLargest is: " + secondLargest(arr));
    }
}
