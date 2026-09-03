package track.M03.T02;

import java.util.Scanner;

public class SecondLargestDistinctValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxi1 = arr[0];
        int maxi2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxi1) {
                maxi2 = maxi1;
                maxi1 = arr[i];
            } else if (arr[i] < maxi1 && arr[i] > maxi2) {
                maxi2 = arr[i];
            }
        }

        if (maxi2 == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct value");
        } else {
            System.out.println(maxi2);
        }
        sc.close();
    }
}