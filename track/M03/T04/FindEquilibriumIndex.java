package track.M03.T04;

import java.util.Scanner;

public class FindEquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int prefixsum[] = new int[n];
        prefixsum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + arr[i];
        }
        int res = -1;
        if (n == 1) {
            res = 0;
        } else {
            for (int i = 1; i < n - 1; i++) {
                if (prefixsum[i - 1] == (prefixsum[n - 1] - prefixsum[i])) {
                    res = i;
                    break;
                }
            }
        }
        System.out.println(res);
        sc.close();
    }
}