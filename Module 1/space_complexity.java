import java.util.Scanner;
public class MatrixDiagonalInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];        
        for (int i = 0; i < n; i++) {
            a[i][i] = scanner.nextInt();
        }        
        scanner.close();
    }
}
