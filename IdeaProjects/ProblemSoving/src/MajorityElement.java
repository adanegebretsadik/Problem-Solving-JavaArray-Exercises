public class MajorityElement {
    public static int findMajorityElement(int[] arr) {
        int count = 0, candidate = -1;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count += 1;
            } else {
                count -= 1;
            }

        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {8,8,3,8,5,8,7,8};
        System.out.println(findMajorityElement(arr));
    }
}
