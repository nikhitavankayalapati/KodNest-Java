package track.Practice_Sessions.DSE.Assesment4;

import java.util.*;

public class MinsizeSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int sum = 0;
        int minsize = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            while (sum >= target) {
                minsize = Math.min(minsize, i - left + 1);
                sum -= arr[left];
                left++;

            }

        }
        System.out.println(minsize);
        sc.close();

    }

}
