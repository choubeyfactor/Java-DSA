import java.util.*;

public class SuffixPrefix {

    static int findArraySum(int[] arr) {

        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static void printArrayz(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static boolean equalSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);

        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;

            if (suffixSum == prefSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input Arrays: ");
        printArrayz(arr);

        System.out.println("Equal Partition possible: " + equalSumPartition(arr));
    }

}