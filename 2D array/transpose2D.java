import java.util.Scanner;

public class transpose2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the matrix:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] originalMatrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                originalMatrix[i][j] = sc.nextInt();
            }
        }
        int[][] transposedMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }
        System.out.println("The transposed matrix is:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
