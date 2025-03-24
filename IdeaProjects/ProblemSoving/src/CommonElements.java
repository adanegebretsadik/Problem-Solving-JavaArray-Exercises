public class CommonElements {
    public static void findCommonElements(int[] arr1, int[] arr2) {
        int i=0, j=0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i] + " " + arr2[j]);
                j++;
                i++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,3,2,8};
        int[] arr2 = {1,2,3,4,5,8,7};
        System.out.println("Common elements are:");
        findCommonElements(arr1, arr2);
    }
}
