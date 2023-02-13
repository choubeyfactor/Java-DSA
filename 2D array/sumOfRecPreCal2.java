import java.io.*;
import java.lang.*;
import java.util.*;
public class sumOfRecPreCal2 {
  public static void main(String[] args)
  {
    int n = 3;
    int arr[][] = new int[][] { { 1,2,3 },
                               { 4,5,6 },
                               { 1,1,1 } };
    prefixSum(arr, n);
    print(arr, n);
  }
  static void prefixSum(int arr[][], int n)
  {
     
    // vertical prefixsum
    for (int j = 0; j < n; j++) {
      for (int i = 1; i < n; i++) {
        arr[i][j] += arr[i - 1][j];
      }
    }
     
    // horizontal prefixsum
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n; j++) {
        arr[i][j] += arr[i][j - 1];
      }
    }
  }
  static void print(int arr[][], int n)
  {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}