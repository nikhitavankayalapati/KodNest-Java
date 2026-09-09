package track.M03.T04;

import java.util.Scanner;

public class FindMinimumSumOfWindowSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int total = 0;
        for (int i = 0; i < k; i++) {
            total += arr[i];
        }
        int minsum = total;
        for (int i = k; i < n; i++) {
            total += arr[i] - arr[i - k];
            minsum = Math.min(minsum, total);
        }
        System.out.println(minsum);
        sc.close();
    }
}