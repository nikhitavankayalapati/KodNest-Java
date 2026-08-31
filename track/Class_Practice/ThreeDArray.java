package track.Class_Practice;

import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of blocks: ");
        int d = sc.nextInt();
        System.out.println("No of rows: ");
        int r = sc.nextInt();
        System.out.println("No of cols: ");
        int c = sc.nextInt();
        int arr[][][] = new int[d][r][c];
        System.out.println("enter elements");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("-----Output-----");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }

}
