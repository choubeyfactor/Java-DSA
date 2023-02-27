public class SortedArrRecur {

    public static boolean isSorted(int[] arr, int si) {
        if (si == arr.length - 1) {
            return true;
        }

        if (arr[si] > arr[si + 1]) {
            return false;
        } else {
            boolean restAns = isSorted(arr, si + 1);
            return restAns;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 6, 1, 9, 7 };
        int[] arr1 = { 2, 4, 6, 8, 10 };
        System.out.println(isSorted(arr1, 0));
    }
}
