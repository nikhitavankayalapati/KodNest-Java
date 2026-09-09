package track.M03.T04;

import java.util.Scanner;

public class FindMaxSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println(maxsum);
        sc.close();
    }
}