package track.M03.T02;

import java.util.*;

public class FindValueClosestToTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long target = sc.nextLong();

        long closest = arr[0];
        long minDiff = Math.abs(arr[0] - target);

        for (int i = 1; i < n; i++) {
            long diff = Math.abs(arr[i] - target);

            // Update if closer, or if equally close but smaller
            if (diff < minDiff || (diff == minDiff && arr[i] < closest)) {
                minDiff = diff;
                closest = arr[i];
            }
        }

        System.out.println(closest);
        sc.close();
    }
}