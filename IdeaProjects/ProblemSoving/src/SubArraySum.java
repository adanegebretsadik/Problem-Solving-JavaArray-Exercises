import java.util.*;

public class SubArraySum {
    public static int countSubArrays(int[] arr, int k){
       int count = 0;
       for (int i=0; i<arr.length; i++){
           int sum = 0;
           for (int j=i; j<arr.length; j++){
               sum += arr[j];
               if (sum == k){
                   count++;
               }
           }
       }
        return count;
    }

    public static void main(String[] args) {
        int[] transaction =  {1, 2, 3, -2, 5};
        int fraudThreshold = 5;
        System.out.println("Suspicious Transactions: " + countSubArrays(transaction, fraudThreshold));
    }
}
