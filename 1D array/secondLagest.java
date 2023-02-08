import java.util.*;
public class secondLagest {
   
    static int findLargest(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findSecondLargest(int[] arr){
        int mx = findLargest(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondLagest = findLargest(arr);
        return secondLagest;
    } 
    

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter " + n + " elements" );
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();

    }

    System.out.println("Second maximum element: " + findSecondLargest(arr));
}
}