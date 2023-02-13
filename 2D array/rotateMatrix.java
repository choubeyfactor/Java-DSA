import java.util.*;

public class rotateMatrix {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < columns; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[j] = temp;
            i++;
            j--;

        }
    }

    static void rotate(int[][] matrix, int n) {
        // transpose
        // reverse each row of transpose matrix

        transposeMatrix(matrix, n, n);

        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns in the matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values");

        for (int i = 0; i < r; i++) { // rows
            for (int j = 0; j < c; j++) { // columns
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix");
        printMatrix(matrix);
        rotate(matrix, r);
        System.out.println("rotation of matrix: ");
        printMatrix(matrix);
    }

}
