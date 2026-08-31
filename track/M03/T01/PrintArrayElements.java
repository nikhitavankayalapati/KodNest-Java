package track.M03.T01;

import java.util.Scanner;

public class PrintArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);

        }

        sc.close();

    }

}