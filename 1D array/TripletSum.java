import java.lang.annotation.Target;
import java.util.*;
public class TripletSum {
    
    static int tripletSum(int[] arr , int target){
        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
            for (int k = j+1 ; k<n ; k++){
                if (arr[i] + arr[j] + arr[k] == target) {
                    ans++; 
                }
            }
        }
        
    }
    return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements" );
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        System.out.println("Enter the target sum: ");
            int target = sc.nextInt();

    System.out.println(tripletSum(arr, target));
    }
}

