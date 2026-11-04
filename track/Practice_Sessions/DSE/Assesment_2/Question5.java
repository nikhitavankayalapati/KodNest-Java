package track.Practice_Sessions.DSE.Assesment_2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++)
            weights[i] = sc.nextInt();
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println(countEligiblePairs(weights, low, high));
        sc.close();
    }

    public static long countEligiblePairs(int[] weights, int low, int high) {
        return countPairsLessThanOrEqualTo(weights, high) - countPairsLessThanOrEqualTo(weights, low - 1);
    }

    private static long countPairsLessThanOrEqualTo(int[] weights, int target) {
        long count = 0;
        int left = 0;
        int right = weights.length - 1;

        while (left < right) {
            if (weights[left] + weights[right] <= target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
