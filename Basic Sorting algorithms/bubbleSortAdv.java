import java.util.*;

public class bubbleSortAdv {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps to n-1 times
        for (int i = 0; i < arr.length; i++) {

            // for each step max item will come at the last respective index
            for (int j = 1; j < arr.length - 1; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;

                }
            }
            // if you didnt swap for a particular value of i , it means the array ids sorted
            // hence stop the program
            if (swapped = false) { // !false = true
                break;
            }
        }
    }
}
//---------------------------------END OF CODE-------------------------------------//
