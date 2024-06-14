
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        // We create a new Scanner object to read the input from the user.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the matrices (rows and columns): ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[columns][rows];
        int[][] matrixC = new int[rows][rows];
        scanner.close();

        System.out.println("Enter the elements of matrix A: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix B: ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Result of matrix multiplication: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
