import java.util.Scanner;

public class Que76 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int diagonalSum = 0;

        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("Diagonal Sum = " + diagonalSum);
    }
}