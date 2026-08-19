package track.M02.T08;

import java.util.Scanner;

public class ReadAndDisplayMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no rows");
        int r = sc.nextInt();
        System.out.println("no of columns");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("enter the elements of array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("output");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
