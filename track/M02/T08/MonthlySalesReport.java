package track.M02.T08;

import java.util.Scanner;

public class MonthlySalesReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            int total = 0;

            for (int j = 0; j < c; j++) {
                total += arr[i][j];
            }

            System.out.println("Product " + (i + 1) + " total: " + total);
        }
        sc.close();
    }
}