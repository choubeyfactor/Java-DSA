import java.util.*;;

public class rotatingArray2 {

    static void swap(int[] arr, int i, int j) { // swap function

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void printArrayz(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k: ");
        int k = sc.nextInt();

        //

        System.out.println("Original: ");
        printArrayz(arr);
        rotateInPlace(arr, k);
        System.out.println("After rotation: ");
        printArrayz(arr);

    }
}
