package track.M03.T03;

import java.util.Scanner;

public class SeparateZerosAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (arr[l] == 1 && arr[r] == 0) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            } else if (arr[l] == 0) {
                l++;
            } else {
                r--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}