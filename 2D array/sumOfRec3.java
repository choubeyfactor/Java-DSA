import java.util.*;

public class sumOfRec3 {

    static void prefixSum(int arr[][])
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

  static int findSum(int[][] matrix , int l1 , int l2 , int r1 , int r2){
    prefixSum(matrix);

    int ans = 0 ,  sum = 0 , up = 0 , left = 0 , leftUp = 0 ;
    
    sum = matrix[l2][r2];

    if (r1 >= 1) {
        left = matrix[l2][r1-1];
    }
    if (l1 >= 1) {
        left = matrix[l2][r1-1];    
     }
    if (l1>= 1 && r1 >= 1) {
        leftUp = matrix[l1-1][r1-1];
    }
    

    ans = sum - up - left + leftUp ;
    return sum ;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows and columns of matrix ");
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] matrix = new int[r][c];
    int totalElemnts = r * c;

    System.out.println("Enter " + r * c + " values: ");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            matrix[i][j] = sc.nextInt();
            
        }
    }
    System.out.println("Enter rectangle boundaries l1 , r1 , l2 , r2 ");
    int l1 = sc.nextInt();
    int r1 = sc.nextInt();
    int l2 = sc.nextInt();
    int r2 = sc.nextInt();
    System.out.println("Rectangle Sum : " + findSum(matrix, l1, r1, l2, r2));

}
}  