package track.M03.T03;

import java.util.Scanner;

public class CheckArrayPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int palindrome = 1;
        int l = 0, r = n - 1;
        while (l < r) {
            if (arr[l] != arr[r]) {
                palindrome = 0;
                break;
            }
            l++;
            r--;
        }
        System.out.println(palindrome);
        sc.close();
    }
}