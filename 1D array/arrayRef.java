import java.util.Arrays;
import java.util.Scanner;

public class arrayRef {
    
    static void changeArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
//if you change the new array which is refers the olf=d arry and after changing it yhe values of old array is also changed then it is called shallow copying
    public static void main(String[] args) {
        
        int arr[] = new int[3];

         arr[0] = 1;
         arr[1] = 13;
         arr[2] = 12;


        // changeArray(arr);
        // printArray(arr);

         int arr2[] = Arrays.copyOf(arr, arr.length);
         System.out.println(arr2);
         int arr3[] = Arrays.copyOfRange(arr, 0, arr.length + 1);
         System.out.println(arr3);
    }
}
