import java.util.*;

public class multiply2D {

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {

        if (c1 != r2) {
            System.out.println("Wrong Dimensions");
            return;
        }

        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) { // row number
            for (int j = 0; j < c2; j++) { // column number

                for (int k = 0; k < c1; k++) {

                    /*
                     * i = 1 , j = 0
                     * mul[i][j] = ith row pf a * jth col of b
                     */

                    mul[i][j] += (a[i][k] * b[k][j]);

                }

            }
        }
        System.out.println("Multiply of 2 matrices");
        printMatrix(mul);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns of matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++) { // rows
            for (int j = 0; j < c1; j++) { // columns
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows and columns of matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r1][c1];
        for (int i = 0; i < r2; i++) { // rows
            for (int j = 0; j < c2; j++) { // columns
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);
        multiply(a, r1, c1, b, r2, c2);

    }

}
