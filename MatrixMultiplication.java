package java0919;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stubimport java.util.Scanner;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows and columns for Matrix 1 (rows columns): ");
        int rows1 = scanner.nextInt(), cols1 = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix 2: ");
        int cols2 = scanner.nextInt();

        int[][] mat1 = new int[rows1][cols1], mat2 = new int[cols1][cols2], matSum = new int[rows1][cols2];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows1; i++)
            for (int j = 0; j < cols1; j++)
                mat1[i][j] = scanner.nextInt();

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < cols1; i++)
            for (int j = 0; j < cols2; j++)
                mat2[i][j] = scanner.nextInt();
        for (int i = 0; i < rows1; i++)
            for (int j = 0; j < cols2; j++)
                for (int k = 0; k < cols1; k++)
                    matSum[i][j] += mat1[i][k] * mat2[k][j];
        System.out.println("Mat Sum:");
        for (int[] row : matSum) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        scanner.close();
    }
}
