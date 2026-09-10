package track.M03.T04;

import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int arr[] = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        int totalsum = (int) n * (n + 1) / 2;
        int missingnumber = totalsum - total;
        System.out.println(missingnumber);
        sc.close();
    }
}