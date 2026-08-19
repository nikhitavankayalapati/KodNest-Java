package track.Class_Practice;

import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no rows");
        int r = sc.nextInt();
        int arr[][] = new int[r][];
        System.out.println("enter the elements of array");
        for (int i = 0; i < r; i++) {
            System.out.println("enter no of columns");
            int c = sc.nextInt();
            arr[i] = new int[c];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("output");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
