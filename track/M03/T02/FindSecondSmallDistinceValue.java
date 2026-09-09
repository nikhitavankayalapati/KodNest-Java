package track.M03.T02;

import java.util.Scanner;

public class FindSecondSmallDistinceValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int secondSmall = Integer.MAX_VALUE, small = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }
        if (secondSmall == Integer.MAX_VALUE)
            System.out.println("No second smallest distinct value");
        else
            System.out.println(secondSmall);
        sc.close();
    }
}