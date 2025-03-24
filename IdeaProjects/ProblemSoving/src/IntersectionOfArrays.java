import java.util.*;

public class IntersectionOfArrays {
    public static int[] intersect(int[] num1, int[] num2){
        int i=0, j=0, k=0;
        int minLength = Math.min(num1.length, num2.length);
        int[] intersection =  new int[minLength];

        while (i<num1.length && j<num2.length){
            if (num1[i] == num2[j]){
                intersection[k++] = num1[i];
                i++;
                j++;
            } else if (num1[i] < num2[j]) {
                i++;
                
            } else {
                j++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, k);


    }

    public static void main(String[] args) {
        int[] arr1 =  {1, 2, 2, 1};
        int[] arr2 =  {2, 2};
        System.out.println("Intersection: " + Arrays.toString(intersect(arr1, arr2)));
    }
}
