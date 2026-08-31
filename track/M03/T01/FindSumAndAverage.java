package track.M03.T01;

import java.util.Scanner;

public class FindSumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        int total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        double average = (double) total / n;
        System.out.println(total);
        System.out.printf("%.2f", average);

        sc.close();

    }

}