package track.Class_Practice;

import java.util.Scanner;

public class SuffixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int p[] = new int[n];
        p[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            p[i] = a[i] + p[i + 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
        sc.close();

    }

}
