package track.M03.T04;

import java.util.Scanner;

public class FindSubarrayWithTargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int l = 0, sum = 0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            while (sum > target && l < i) {
                sum -= arr[l];
                l++;
            }
            if (sum == target) {
                System.out.println(l + " " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(-1);
        }
        sc.close();
    }
}