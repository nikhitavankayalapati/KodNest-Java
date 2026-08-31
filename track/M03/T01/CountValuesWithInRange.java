package track.M03.T01;

import java.util.Scanner;

public class CountValuesWithInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int first = sc.nextInt();
        int last = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= first && arr[i] <= last) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

}