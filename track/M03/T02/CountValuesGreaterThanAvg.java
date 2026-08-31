package track.M03.T02;

import java.util.Scanner;

public class CountValuesGreaterThanAvg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        int total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int avg = total / n;
        int c = 0;

        for (int ele : arr) {
            if (ele > avg) {
                c++;
            }
        }

        System.out.println(c);
    }
}