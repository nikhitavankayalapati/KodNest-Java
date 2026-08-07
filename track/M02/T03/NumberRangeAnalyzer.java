package track.M02.T03;

import java.util.Scanner;

public class NumberRangeAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int evenSum = 0;
        int oddCount = 0;

        while (start <= end) {
            if (start % 2 == 0) {
                evenSum += start;
            } else {
                oddCount++;
            }
            start++;
        }

        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd count: " + oddCount);

        sc.close();
    }
}
