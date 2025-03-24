import java.util.Arrays;

public class RearrangeSigns {
    public static void rearrange(int[] arr){
        int[] temp = new int[arr.length];
        int posIndex = 0, negIndex = 1;

        for (int num : arr){
            if (num >= 0 && posIndex < arr.length){
                temp[posIndex] = num;
                posIndex += 2;
            } else if (num < 0 && negIndex < arr.length) {
                temp[negIndex] = num;
                negIndex += 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

    }
    public static void printArray(int[]arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] transactions = {3, -1, -4, 2, -5, 6};
        rearrange(transactions);
        System.out.print("Rearranged Transactions: ");
        printArray(transactions);

    }
}
