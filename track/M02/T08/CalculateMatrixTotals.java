package track.M02.T08;

import java.util.Scanner;

public class CalculateMatrixTotals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            int tot = 0;

            for (int j = 0; j < col; j++) {
                tot += arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " total: " + tot);
        }
        sc.close();
    }
}