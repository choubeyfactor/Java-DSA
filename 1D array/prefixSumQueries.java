import java.util.*;

public class prefixSumQueries {

    static void printArrayz(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumarray(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.print("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefSum = makePrefixSumarray(arr);

        while (q-- > 0) {
            System.out.println("Enter range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l - 1];
            System.out.println("Sum " + ans);
        }
    }
}
