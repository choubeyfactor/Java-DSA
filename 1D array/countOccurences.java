import java.util.Scanner;

public class countOccurences {

    static int countOccur(int[] arr, int x) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        return count;
    }

    static int lastOccur(int[] arr, int x) {

        int last = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                last = i;
            }
        }

        return last;
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

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.println(x + " has occured " + countOccur(arr, x) + " times in the array");
        System.out.println(x + " has occured lastly on " + lastOccur(arr, x) + " index");

    }
}
