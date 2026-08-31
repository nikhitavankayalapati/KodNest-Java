package track.M03.T01;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println(evenCount + " " + oddCount);
        sc.close();

    }

}