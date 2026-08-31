package track.M03.T01;

import java.util.Scanner;

public class CountWhetherTwoArraysAreIdentical {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int arr1[] = new int[n1];
            for (int i = 0; i < n1; i++) {
                arr1[i] = sc.nextInt();
            }
            int n2 = sc.nextInt();
            int arr2[] = new int[n2];
            for (int i = 0; i < n2; i++) {
                arr2[i] = sc.nextInt();
            }
            if (n1 != n2) {
                System.out.println(0);
                return;
            }

            int identical = 1;
            for (int i = 0; i < n1; i++) {
                if (arr1[i] != arr2[i]) {
                    identical = 0;
                    break;
                }
            }
            System.out.println(identical);
            sc.close();
        }
    }
}