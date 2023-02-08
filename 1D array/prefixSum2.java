import java.util.Scanner;

public class prefixSum2 {

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
        System.out.print("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input Arrays: ");
        printArrayz(arr);
        int[] pref = makePrefixSumarray(arr);
        System.out.println("Sorted Array: ");
        printArrayz(arr);
    }
}
