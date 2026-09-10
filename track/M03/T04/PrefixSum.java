package track.M03.T04;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int prefixsum[] = new int[n];
        prefixsum[0] = arr[0];
        int total = arr[0];
        for (int i = 1; i < n; i++) {
            total += arr[i];
            prefixsum[i] = total;
        }
        for (int ele : prefixsum) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
}