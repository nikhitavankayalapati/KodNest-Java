package track.M03.T03;

import java.util.Scanner;

public class FindPairWithTargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int l = 0;
        int r = n - 1;
        int sum = 0;
        boolean found = false;
        while (l < r) {
            sum = arr[l] + arr[r];
            if (sum < target) {
                l++;
            } else if (sum > target) {
                r--;
            } else {
                System.out.print(arr[l] + " " + arr[r]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.print(-1);
        }
    }
}
