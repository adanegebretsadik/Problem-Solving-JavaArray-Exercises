public class KthLargest {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {  // This partitioning is for descending order
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return the pivot index
    }

    public static int quickSelect(int[] arr, int low, int high, int k) {
        if (low == high) {  // Base case: when the search space is narrowed to one element
            return arr[low]; // Return the element at the 'low' index (or 'high', they are the same here)
        }

        int pi = partition(arr, low, high);  // Partition the array and get pivot index

        if (pi == k) {
            return arr[pi];  // If the pivot index matches k, return the element
        } else if (pi < k) {
            return quickSelect(arr, pi + 1, high, k);  // Search in the right half
        } else {
            return quickSelect(arr, low, pi - 1, k);  // Search in the left half
        }
    }

    public static int findKthLargest(int[] arr, int k) {
        int n = arr.length;
        return quickSelect(arr, 0, n - 1, n - k);  // Convert k-th largest to (n-k)-th smallest in 0-based index
    }

    public static void main(String[] args) {
        int[] arr1 = {8, 2, 3, 4, 5, 8, 7};
        int k = 3;
        System.out.println(findKthLargest(arr1, k));
    }
}
