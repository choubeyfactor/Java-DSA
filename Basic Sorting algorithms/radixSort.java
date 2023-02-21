public class radixSort {

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr); // find largest element of the array

        int[] count = new int[10];
        for (int i = 0; i < count.length; i++) {// make frequency array
            count[(arr[i] / place) % 10]++;
        }

        // make prefix sum array of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element in the original array and put in the output
        // array
        for (int i = 1; i < n; i++) {
            int idx = count[(arr[i] / place) % 10];
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }
    }

    static void radixsort(int[] arr) {
        int max = findMax(arr); // get maximum element
        // applying counting sort to sort elements based on place value
        for (int place = 0; max / place > 0; place *= 10) {
            countSort(arr, place);
        }
    }

    static void display(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
