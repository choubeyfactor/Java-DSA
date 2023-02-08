import java.util.*;
public class sortingArrayusingPointer2 {

    static void printArrayz(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int i, int j) { // swap function

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void sortZeroesAndOnes2(int[] arr){
        int n = arr.length;

        int left = 0 , right = n-1 ;
        
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr , left , right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }

            if (arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Arrays: ");
        printArrayz(arr);
        sortZeroesAndOnes2(arr);
        System.out.println("Sorted Array: ");
        printArrayz(arr);

    }
}
