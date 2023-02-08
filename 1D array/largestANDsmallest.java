import java.util.*;

public class largestANDsmallest {

    static int[] autoSort(int[] arr) {
        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length - 1] };
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 89, 43, 233, 45 };

        int[] ans = autoSort(arr);
        System.out.println("Smallest: " + ans[0] + " and largest: " + ans[1]);

    }
}