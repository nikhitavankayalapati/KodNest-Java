package track.M02.T08;

import java.util.Scanner;

public class Arrayproblemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int r = sc.nextInt();
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int arrTotal = 0;
        for (int i = 0; i < n; i++) {
            arrTotal += arr[i];
        }

        int matrixTotal = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrixTotal += matrix[i][j];
            }
        }

        System.out.println("Array total: " + arrTotal);
        System.out.println("Matrix total: " + matrixTotal);
        sc.close();
    }
}