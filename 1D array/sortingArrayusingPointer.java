import java.util.*;

public class sortingArrayusingPointer {

    static void sortZeroesAndOnes(int[] arr) {
        int n = arr.length;
        int zeroes = 0; // count number of zeroes

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }

        // 0 to zeroes-1: 0 , zeroes to n-1: 1
        for (int i = 0; i < arr.length; i++) {
            if(i<zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1; 
            }
        }
    }

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
        sortZeroesAndOnes(arr);
        System.out.println("Sorted Array: ");
        printArrayz(arr);
    }
}
