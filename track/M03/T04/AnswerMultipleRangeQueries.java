package track.M03.T04;

import java.util.Scanner;

public class AnswerMultipleRangeQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int total = 0;
            for (int j = s; j <= e; j++) {
                total += arr[j];
            }
            System.out.println(total);
        }
        sc.close();
    }
}