public class countSortPrefix {

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr); // find largest element of the array

        int[] count = new int[max + 1];
        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
        }

        // make prefix sum array of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element in the original array and put in the output array
        for (int i = 1; i < n; i++) {
            int idx = count[arr[i] - 1];
            output[idx] = arr[i];
            count[arr[i]]--;
        }
    }

    static void display(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 3, 3 };
        countSort(arr);
        display(arr);
    }
}
