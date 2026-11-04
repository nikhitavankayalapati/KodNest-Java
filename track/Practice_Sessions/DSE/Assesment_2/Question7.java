package track.Practice_Sessions.DSE.Assesment_2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++)
            heights[i] = sc.nextInt();
        int minimum = sc.nextInt();
        System.out.println(maxSafeCoverage(heights, minimum));
        sc.close();
    }

    public static long maxSafeCoverage(int[] heights, int minimum) {
        int left = 0;
        int right = heights.length - 1;
        while (left < right && heights[left] < minimum) {
            left++;
        }
        while (left < right && heights[right] < minimum) {
            right--;
        }
        if (left >= right) {
            return 0L;
        }
        long maxScore = 0L;
        while (left < right) {
            long currentScore = (long) Math.min(heights[left], heights[right]) * (right - left);
            if (currentScore > maxScore) {
                maxScore = currentScore;
            }
            if (heights[left] < heights[right]) {
                left++;
                while (left < right && heights[left] < minimum) {
                    left++;
                }
            } else {
                right--;
                while (left < right && heights[right] < minimum) {
                    right--;
                }
            }
        }

        return maxScore;
    }
}